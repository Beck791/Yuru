package com.yurucamp.member.model.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yurucamp.member.model.MemberBean;
import com.yurucamp.member.model.dao.MemberCenterDao;

@Service
@Transactional
public class MemberCenterService {

	@Autowired
	private JavaMailSender mailSender;
	 
	@Autowired
	private MemberCenterDao memberCenterDao;

	public MemberBean queryMem(String memberId) throws SQLException {
		System.out.println("ServicememberId="+memberId);
		return memberCenterDao.queryMem(memberId); 
	}
	
	public String add(MemberBean mBean) throws SQLException {
//		System.out.println("ServicememberId="+memberId);
		String mes=memberCenterDao.addMem(mBean);
		System.out.println(mBean);
		return mes;
	}
	
	//發送驗證碼確認信件
	public Integer sendRE(String mail,String name) throws SQLException {
		SimpleMailMessage message = new SimpleMailMessage();
		//收信人
		message.setTo(mail);
		
		//信件標題
		message.setSubject("YuruCamp會員 驗證信");
		
		//信件內文
		Integer num=memberCenterDao.sendRm();
		String content = "Dear " 
				+ name
				+ ", \n\n您的驗證碼為：\n\n" 
				+ num
				+ "\n\n請輸入驗證碼以完成註冊 .\n\n" ;
		message.setText(content);		
		//發出信件
		mailSender.send(message);
		return num;
	}
	
	

}
