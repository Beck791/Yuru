package com.yurucamp.member.controller;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttribute;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.yurucamp.member.model.MemberBean;
import com.yurucamp.member.model.service.MemberCenterService;
import com.yurucamp.member.utils.DateUtils;

@Controller
@SessionAttributes({"memberId","memberRolse","memberRolse"})
public class MemberCenterController {

	private static final int yyyy = 0;
	private static final int MM = 0;
	@Autowired
	MemberCenterService service ;

	//		// YuruCamp首頁連結會員中心
	//		@GetMapping("/Member/MemberCenter")
	//		public String MemberCenter() {			
	//			return "MemberViewPage";
	//		}
	// 開啟會員中心前要先拉出資料庫資料

	@GetMapping("/Member/MemberCenter")
	public String MemberCenter(HttpServletRequest request,Model model) throws SQLException {
		HttpSession session = request.getSession();
		MemberBean mb = new MemberBean();
		String memberId = (String) session.getAttribute("memberId");
		mb = service.queryMem(memberId); 
		model.addAttribute("MemberBean",mb);
		//mb以MemberBean傳到前端
		//		System.out.println("ControllermemberId="+memberId);
		//		System.out.println("Controllci="+ci);
		System.out.println(mb.getMemberId());
		return "MemberViewPage";
	}

	//註冊
	@PostMapping("/Member/Rer")
	@ResponseBody
	public Map<String, String> Memberadd(Model model,String name,String memberId,String password,String gender,String birthday,String phone,
			String address,String mail,String registerDate,String status,Integer paid,String roles) throws SQLException, Throwable {

		System.out.println("進到Controller");
		System.out.println("memberId="+memberId);		
		
		MemberBean mBean=new MemberBean();
		mBean.setName(name);
		mBean.setMemberId(memberId);
		mBean.setPassword(password);
		mBean.setGender(gender);	
		mBean.setBirthday(DateUtils.StringToDate(birthday));	
		System.out.println("birthdaypass="+DateUtils.StringToDate(birthday));
		mBean.setPhone(phone);
		mBean.setAddress(address);	
		mBean.setMail(mail);		
		mBean.setRegisterDate(DateUtils.StringToDateTime());
		System.out.println("registerDatepass=:"+DateUtils.StringToDateTime());
		mBean.setStatus(status);		
		mBean.setPaid(paid);	
		mBean.setRoles(roles);	
		
		System.out.println("Controller-getbean-memberId="+mBean.getMemberId());

		String mes=null;
		mes=service.add(mBean);
		
		System.out.println("DAO回到Controller");
		System.out.println("mes="+mes);
		
		
		//把成功失敗訊息丟置前端
		Map<String, String> mes1 = new HashMap<String, String>();
		mes1.put("mes", mes); 
		return mes1;

	}
}
