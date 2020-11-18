package com.yurucamp.forum.controller;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.yurucamp.forum.model.PostBean;
import com.yurucamp.forum.model.ReplyBean;
import com.yurucamp.forum.model.service.ArticleService;
import com.yurucamp.general.model.service.GeneralService;

@Controller
public class ForumController {
	
	@Autowired
	ArticleService articleService;
	@Autowired
	GeneralService generalService;

	@RequestMapping("/Forum/Index")
	public String ToClassifyPage() {
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



	//新增文章案件
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
		postBean.setPoTitle(poTitle);
		postBean.setPoContent(poContent);
		postBean.setPoImage(generalService.uploadToImgur(poImage));
		postBean.setPoCreatTime(new Timestamp(System.currentTimeMillis()));
		postBean.setPoUpDateTime(null);
		articleService.insertPost(postBean);
		System.out.println("Already Save Object.id = " + postBean.getPoId());
		return "campDiscussionPage";
	}
	
	
	
	
	//文章閱讀頁面
	@GetMapping(value ="/Forum/readArticle/${PostBean.poId}")
	public String Read(@PathVariable("poId") Integer poId, Model model) throws SQLException{
		PostBean postBean = articleService.queryPostId(poId);
		model.addAttribute("PostBean", postBean);
		List<ReplyBean> replyList = articleService.queryPoIdAllReply(poId);
		model.addAttribute("replyList", replyList);
		System.out.println("potitle=?"+postBean.getPoTitle());
		return "memberReadPage";
	}
	
	
	

//	@RequestMapping(value = "/Forum/updateArticle", method = RequestMethod.POST)
//	public String Update(@RequestParam("id") Integer id, Model model) throws SQLException {
//		PostBean postBean = new PostBean();
//		postBean = articleService.queryOne(id);
//		model.addAttribute("PostBean", postBean);
//		
//		return "memberReadPage";
//	}
//	
	@RequestMapping(value = "/Forum/Delete", method = RequestMethod.POST)
	public String Delete(@RequestParam("id") Integer id, Model model)
			throws SQLException {
		articleService.deleteOne(id);
		List<PostBean> list = articleService.queryPostAll();
		model.addAttribute("PostBean", list);
		return "memberReadPage";
	}
//文章列表
	@RequestMapping("/Forum/articleList")
	public String memberArticleList() {
//		return "Forum/forumIndex";
		return "memberArticleListPage";
	}
	
	@RequestMapping(value ="/Forum/memberPost" , method = RequestMethod.GET)
	public String QueryMemberPost(Model model) throws SQLException{
		List<PostBean> postListAll = articleService.queryPostAll();
		model.addAttribute("postList", postListAll);
		System.out.println("polist=?"+ postListAll);
//		return "Forum/memberCreat";
		return "campDiscussionPage";
	}
	
	
	
}