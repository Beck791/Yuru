package com.yurucamp.mallsystem.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yurucamp.mallsystem.model.OrderBean;
import com.yurucamp.mallsystem.model.OrderDetailBean;
import com.yurucamp.mallsystem.model.dao.OrderBeanDao;
import com.yurucamp.mallsystem.model.dao.OrderDetailBeanDao;

@Service
@Transactional
public class OrderBeanService {

	@Autowired
	OrderBeanDao orderBeanDao;
	
	@Autowired
	OrderDetailBeanDao orderDetailBeanDao;
	
	public void insert(OrderBean orderBean,OrderDetailBean orderDetailBean) throws SQLException {
		orderBeanDao.insert(orderBean);
		orderDetailBeanDao.insert(orderDetailBean);
		
	}
	public void update(OrderBean orderBean) {
		orderBeanDao.update(orderBean);
	}
	public void delete(Integer id) {
		orderBeanDao.delete(id);
	}
	public OrderBean queryone(Integer id) {
		return orderBeanDao.queryone(id);
		
	}
	public List<OrderBean> queryByMemberId(Integer id){
		return orderBeanDao.queryByMemberId(id);
	}
	}
