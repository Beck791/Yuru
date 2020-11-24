package com.yurucamp.car.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.yurucamp.car.model.CarBean;
import com.yurucamp.car.model.ReservationBean;
import com.yurucamp.car.model.dao.CarDao;

@Service
@Transactional
public class CarService {

	@Autowired
	CarDao carDao;
	@Autowired
	private JavaMailSender mailSender;

	public List<CarBean> getCarList(Map<String,Object> condList, int[] arrCarId) throws SQLException {
		return carDao.getCarList(condList, arrCarId);
	}

	public List<ReservationBean> getRsvList(Map<String,Object> condList) throws SQLException {
		return carDao.getRsvList(condList);
	}

	public void insert(ReservationBean rsvBean) throws SQLException {
		carDao.insert(rsvBean);
	}
	
	public List<ReservationBean> query(int memberId) throws SQLException {
		return carDao.getContractList(memberId);
	}
	
	public List<ReservationBean> querydetail(int id) throws SQLException {
		return carDao.getcontractDetailList(id);
	}
	
	public List<CarBean> querycar() throws SQLException {
		return carDao.getCarMenuList();
	}
	
	public List<CarBean> querycarbyprice() throws SQLException {
		return carDao.getCarMenuByPriceList();
	}
	
	//預約成功信件
	public void sendPlanSuccessEmail() {
		SimpleMailMessage message = new SimpleMailMessage();
	
		//收信人
		message.setTo("ashley72045@gmail.com");
//		message.setTo("ethos0505@gmail.com");
		
		//信件標題
		message.setSubject("YuruCamp 悠遊租車預約成功");
		
		//信件內文
		
//		String authURL ="google.com";
		String content = "Dear " 
//				+ "PP"
				+ "\n\n 感謝您選擇YURU CAMP露營車,我們已收到您的預約,\n\n" 
				+ "並期待與您的旅程。\n\n"
				+ "" ;
//				+ authURL;
		message.setText(content);
		
		//發出信件
		mailSender.send(message);
		
	}
	
}



