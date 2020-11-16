package com.yurucamp.mallsystem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yurucamp.mallsystem.model.OrderBean;
import com.yurucamp.mallsystem.model.dao.OrderBeanDao;

@Service
@Transactional
public class OrderBeanService {

	@Autowired
	OrderBeanDao orderBeanDao;
	
	
	public void insert(OrderBean orderBean) {
		orderBeanDao.insert(orderBean);
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
