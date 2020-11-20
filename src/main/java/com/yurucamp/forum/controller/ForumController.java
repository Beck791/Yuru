package com.yurucamp.forum.controller;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import com.yurucamp.forum.model.PostBean;
import com.yurucamp.forum.model.ReplyBean;
import com.yurucamp.forum.model.service.ArticleService;
import com.yurucamp.general.model.service.GeneralService;

@Controller
@SessionAttributes({"memberId"})
public class ForumController {
	
	@Autowired
	ArticleService articleService;
	@Autowired
	GeneralService generalService;

	@RequestMapping("/Forum/Index")
	public String ToClassifyPage(Model model, SessionStatus status) {
		String memberId =(String) model.getAttribute("memberId");
		if (memberId == null) {
			status.setComplete();
			return "indexPage";
		}
//		return "Forum/forumIndex";
		return "forumClassifyIndexPage";
	}

//	@RequestMapping(value ="/Forum/memberPost" , method = RequestMethod.GET)
//	public String QueryMemberPostId(Integer poId,Model model) throws SQLException{
//		List<PostBean> postList = articleService.queryPostIdAll(poId);
//		model.addAttribute("postList", postList);
//		System.out.println("polist=?"+ postList);
////		return "Forum/memberCreat";
//		return "whereList";
//	}
//	

	//文章總覽
	@RequestMapping("/Forum/forumIndex")
	public String ToCampDiscussionPage(Model model) throws SQLException{
		List<PostBean> postList = articleService.queryPostAll();
		model.addAttribute("postList", postList);
		System.out.println("polist=?"+ postList);
//		return "Forum/memberCreat";
		return "campDiscussionPage";
	}



	//新增文章跳轉
	@RequestMapping(value ="/Forum/goInsert", method = RequestMethod.GET)
	public String GoInsert(Model model) {
		PostBean po = new PostBean();
		String a = "aaa";
		model.addAttribute("ForumBean",a);
		model.addAttribute("PostBean",po);
		return "memberCreatPage";
	}
	//新增文章
	@RequestMapping(value ="/Forum/insert", method = RequestMethod.POST)
	public String Insert( 			@RequestParam("poTitle")String poTitle,
									@RequestParam(value="contentforckeditor",required = false)String poContent,
									@RequestParam(value="poImage",required = false)MultipartFile poImage,								
									Model model) 
	
		throws SQLException {
		System.out.println("Already Save Object.id = " + poContent);
		PostBean postBean = new PostBean();
		postBean.setMemberId((String) model.getAttribute("memberId"));
		postBean.setPoTitle(poTitle);
		postBean.setPoContent(poContent);
		postBean.setPoImage(generalService.uploadToImgur(poImage));
		postBean.setPoCreatTime(new Timestamp(System.currentTimeMillis()));
		postBean.setPoUpDateTime(null);
		articleService.insertPost(postBean);
		System.out.println("Already Save Object.id = " + postBean.getPoId());
		List<PostBean> postList = articleService.queryPostAll();
		model.addAttribute("postList", postList);
		return "campDiscussionPage";
	}
	//新增回文跳轉
		@RequestMapping(value ="/Forum/goReply", method = RequestMethod.GET)
		public String GoReply(Model model) {
			ReplyBean re = new ReplyBean();
			String a = "aaa";
			model.addAttribute("ForumBean",a);
			model.addAttribute("ReplyBean",re);
			return "memberCreatPage";
		}
	
	
	
	//新增回覆
	@RequestMapping(value ="/Forum/Reply", method = RequestMethod.POST)
	public String Reply( 			
									@RequestParam(value="contentforckeditor",required = false)String poContent,
									@RequestParam(value="poImage",required = false)MultipartFile poImage,								
									Model model) 
	
		throws SQLException {
		System.out.println("Already Save Object.id = " + poContent);
		ReplyBean replyBean = new ReplyBean();
		replyBean.setMemberId((String) model.getAttribute("memberId"));
		replyBean.setReContent(poContent);
		replyBean.setReImage(generalService.uploadToImgur(poImage));
		replyBean.setReCreatTime(new Timestamp(System.currentTimeMillis()));
		replyBean.setReUpDateTime(null);
		articleService.insertReply(replyBean);
		System.out.println("Already Save Object.id = " + replyBean.getPoId());
		List<PostBean> postList = articleService.queryPostAll();
		model.addAttribute("postList", postList);
		return "campDiscussionPage";
	}
	
	
	
	
	
	
	
	
	
	
	//文章閱讀頁面
	@GetMapping(value ="/Forum/readArticle/{poId}")
	public String Read(@PathVariable("poId") Integer poId, Model model) throws SQLException{
		PostBean postBean = articleService.queryPostId(poId);
		model.addAttribute("PostBean", postBean);
		List<ReplyBean> replyList = articleService.queryPoIdAllReply(poId);
		model.addAttribute("replyList", replyList);
		System.out.println("potitle=?"+postBean.getPoTitle());
		return "memberReadPage";
	}
	
	
	
	//更新文章跳轉
	@RequestMapping(value = "/Forum/updateArticle", method = RequestMethod.GET)
	public String GoUpdate(@RequestParam("poId") Integer poId, Model model) throws SQLException {
		PostBean postBean = new PostBean();
		postBean = articleService.queryPostId(poId);
		System.out.println(postBean);
		model.addAttribute("PostBean", postBean);
		
		return "memberUpdatePage";
	}
	
	//刪除文章
	@RequestMapping(value = "/Forum/Delete", method = RequestMethod.POST)
	public String Delete(@RequestParam("poId") Integer poId, Model model)
			throws SQLException {
		articleService.deleteOne(poId);
		List<PostBean> list = articleService.queryPostAll();
		model.addAttribute("PostBean", list);
		return "memberArticleListPage";
	}
	//文章列表
	@RequestMapping("/Forum/articleList")
	public String memberArticleList() {
//		return "Forum/forumIndex";
		return "memberArticleListPage";
	}
	//搜尋會員發文與回文 by AJAX
	@RequestMapping(value ="/Forum/memberPost" , method = RequestMethod.GET)
	@ResponseBody
	public Object QueryMemberPost(@RequestParam("memberPost")String memberId,@RequestParam("type")String type,  Model model) throws SQLException{
		System.out.println("memberPost=?"+ memberId);
		System.out.println("type=?"+ type);

		if("memberPost".equals(type)) {
			List<PostBean> postListAll = articleService.queryMemberPost(memberId);
		model.addAttribute("postList", postListAll);
		System.out.println("polist=?"+ postListAll);
//		return "Forum/memberCreat";
		return postListAll;
	}
		else {
			List<Map<String,Object>> resultList = new ArrayList<>();
			
			List<ReplyBean> replyListAll = articleService.queryMemberReply(memberId);
		
			for(ReplyBean bean : replyListAll){
				PostBean postBean = articleService.queryPostId(bean.getPoId());
				
				Map<String,Object> resultMap = new HashMap<>();
				resultMap.put("ReplyBean", bean);
				resultMap.put("PostBean", postBean);
				
				resultList.add(resultMap);
			}
			
			model.addAttribute("replyList", resultList);
			
			System.out.println("replylist=?"+ replyListAll);
//			return "Forum/memberCreat";
			return replyListAll;
			
		}
		}
		

	
}