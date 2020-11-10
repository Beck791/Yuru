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

import com.yurucamp.forum.model.PostBean;
import com.yurucamp.forum.model.service.PostService;
import com.yurucamp.mallsystem.model.BrandBean;

@Controller
//@RequestMapping("/Forum")
public class ForumController {
	
	@Autowired
	PostService postservice;

	@GetMapping("/Forum/Index")
	public String ToClassifyPage() {
//		return "Forum/forumIndex";
		return "ClassifyPage";
	}

	@GetMapping("/Forum/forumIndex")
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
//		return "Forum/memberCreat";
		return "memberCreatPage";
	}
	
	@RequestMapping(value ="/Forum/insert", method = RequestMethod.POST)
	public String Insert(  @RequestParam("poTitle")String poTitle,
									@RequestParam(value="contentforckeditor",required = false)String poContent,
									@RequestParam(value="poImage",required = false)String poImage,								
									Model model) 
	
		throws SQLException {
		System.out.println("Already Save Object.id = " + poContent);
		PostBean postBean = new PostBean();
		postBean.setPoTitle(poTitle);
		postBean.setPoContent(poContent);
		postBean.setPoImage(poImage);
		postBean.setPoCreatTime(new Timestamp(System.currentTimeMillis()));
		postBean.setPoUpDateTime(null);
		postservice.insertPost(postBean);
		System.out.println("Already Save Object.id = " + postBean.getPoId());
//		return "Forum/memberCreat";
		return "campDiscussionPage";
	}
	
	
	
	@RequestMapping(value ="/Forum/readArticle", method = RequestMethod.GET )
	public String Read(Model model) throws SQLException{
		PostBean postBean = new PostBean();
		int id =1;
		postBean = postservice.read(id);
		model.addAttribute("PostBean", postBean);
	
		return "memberReadPage";
	}

	@RequestMapping(value = "/Forum/updateArticle", method = RequestMethod.POST)
	public String Update(@RequestParam("id") Integer id, Model model) throws SQLException {
		PostBean postBean = new PostBean();
		postBean = postservice.queryOne(id);
		model.addAttribute("PostBean", postBean);
		
		return "memberReadPage";
	}
	
	@RequestMapping(value = "/Forum/Delete", method = RequestMethod.POST)
	public String DeleteBrand(@RequestParam("id") Integer id, Model model)
			throws SQLException {
		postservice.deleteOne(id);
		List<PostBean> list = postservice.queryAll();
		model.addAttribute("PostBean", list);
		return "memberReadPage";
	}

   
	
	
	
	
	
}