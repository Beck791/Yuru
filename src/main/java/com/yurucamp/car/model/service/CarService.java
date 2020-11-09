package com.yurucamp.car.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yurucamp.car.model.ReservationBean;
import com.yurucamp.car.model.CarBean;
import com.yurucamp.car.model.dao.CarDao;

@Service
public class CarService {

	@Autowired
	CarDao carDao;

	public List<CarBean> getList(ReservationBean carBean) {
		return carDao.getList(carBean);
	}

}

