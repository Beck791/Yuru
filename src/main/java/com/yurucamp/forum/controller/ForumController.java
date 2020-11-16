package com.yurucamp.forum.controller;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
		return "ClassifyPage";
	}

	@RequestMapping("/Forum/forumIndex")
	public String ToCampDiscussionPage(Model model) {
		
//		return "Forum/memberCreat";
		return "campDiscussionPage";
	}

	

	
	@RequestMapping(value ="/Forum/pureInsert", method = RequestMethod.GET)
	public String PureInsert(Model model) {
		PostBean po = new PostBean();
		String a = "aaa";
		model.addAttribute("ForumBean",a);
		model.addAttribute("PostBean",po);
		return "memberCreatPage";
	}
	
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
	
	
	
	@GetMapping(value ="/Forum/readArticle" )
	public String Read(Model model) throws SQLException{
		int poId=2 ;
		PostBean postBean = articleService.queryPostId(poId);
		model.addAttribute("PostBean", postBean);
//		List<ReplyBean> replyBean = articleService.queryPoIdAllReply(poId);
//		model.addAttribute("ReplyBean", replyBean);
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
		List<PostBean> list = articleService.queryAll();
		model.addAttribute("PostBean", list);
		return "memberReadPage";
	}

   
	
	
	
	
	
}