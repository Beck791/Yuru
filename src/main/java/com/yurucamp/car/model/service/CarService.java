package com.yurucamp.car.model.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yurucamp.car.model.CarBean;
import com.yurucamp.car.model.ReservationBean;
import com.yurucamp.car.model.dao.CarDao;

@Service
public class CarService {

	@Autowired
	CarDao carDao;

	public List<CarBean> getCarList(Map<String,Object> condList, int[] arrCarId) {
		return carDao.getCarList(condList, arrCarId);
	}

	public List<ReservationBean> getRsvList(Map<String,Object> condList) {
		return carDao.getRsvList(condList);
	}
}

