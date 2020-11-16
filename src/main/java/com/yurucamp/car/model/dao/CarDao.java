package com.yurucamp.car.model.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.yurucamp.car.model.CarBean;
import com.yurucamp.car.model.ReservationBean;

@Repository
public class CarDao {
	@Autowired
	SessionFactory factory;

	public List<CarBean> getCarList(Map<String,Object> condList, int[] arrCarId) {
		String sql = "FROM CarBean cb WHERE"
				+ " cb.location = '" + (String)condList.get("dept")
				+ "' AND cb.status = 0";

		// 予約中のＩＤを除く（上限：１０００件）
		if (arrCarId.length > 0) {
			sql += " AND cb.id NOT IN ("
			+ Arrays.toString(arrCarId).replace("[", "").replace("]", "")
			+ ")";
		}

		Session session = null;
		List<CarBean> planList = new ArrayList<>();
		session = factory.getCurrentSession();
		planList = session.createQuery(sql, CarBean.class).getResultList();
		return planList;
	}


	public List<ReservationBean> getRsvList(Map<String,Object> condList) {
		// 検索条件の出発時刻
		String condDeptDateTime = "CONVERT(datetime, '" + (String)condList.get("deptDate") + " " +
									(String)condList.get("deptTime") + "')";
		// 検索条件の返却時刻
		String condReturnDateTime = "CONVERT(datetime, '" + (String)condList.get("returnDate") + " " +
									(String)condList.get("returnTime") + "')";
		// ＤＢの出発時刻
		String tblDeptDateTime = "CONVERT(datetime, CONVERT(VARCHAR, rb.deptDate)+ ' ' + rb.deptTime)";
		// ＤＢの返却時刻
		String tblReturnDateTime = " CONVERT(datetime, CONVERT(VARCHAR, rb.returnDate)+ ' ' + rb.returnTime)";

		String sql = "FROM ReservationBean rb WHERE"
				+ " (" + tblReturnDateTime + " > " + condDeptDateTime
				+ " AND " + tblDeptDateTime + " < " + condDeptDateTime + ") "
				+ " OR (" + tblReturnDateTime + " > " + condReturnDateTime
				+ " AND " + tblDeptDateTime + " < " + condReturnDateTime + ") "
				+ " OR (" + tblReturnDateTime + " < " + condReturnDateTime
				+ " AND " + tblDeptDateTime + " > " + condDeptDateTime + ")";

		Session session = null;
		List<ReservationBean> planList = new ArrayList<>();
		session = factory.getCurrentSession();
		planList = session.createQuery(sql, ReservationBean.class).getResultList();
		return planList;
	}
}

