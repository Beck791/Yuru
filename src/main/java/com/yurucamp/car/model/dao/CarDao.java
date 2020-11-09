package com.yurucamp.car.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yurucamp.car.model.ReservationBean;
import com.yurucamp.car.model.CarBean;

@Repository
public class CarDao {
	@Autowired
	SessionFactory factory;

	public List<CarBean> getList(ReservationBean carBean) {
		String sql = "From CarBean";
		Session session = null;
		// List<Map<String,Object>> planList = new ArrayList<Map<String,Object>>();
		List<CarBean> planList = new ArrayList<>();
		session = factory.getCurrentSession();
		planList = session.createQuery(sql, CarBean.class).getResultList();
		return planList;
	}
}

