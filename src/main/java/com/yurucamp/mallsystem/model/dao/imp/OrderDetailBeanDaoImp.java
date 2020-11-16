package com.yurucamp.mallsystem.model.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.mallsystem.model.OrderBean;
import com.yurucamp.mallsystem.model.OrderDetailBean;
import com.yurucamp.mallsystem.model.dao.OrderDetailBeanDao;

@Repository
public class OrderDetailBeanDaoImp implements OrderDetailBeanDao{

	private SessionFactory sessionFactory;

	@Autowired
	public OrderDetailBeanDaoImp(@Qualifier(value = "sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}
	
	@Override
	public void insert(OrderDetailBean orderDetailBean) throws SQLException {
		sessionFactory.getCurrentSession().save(orderDetailBean);
		
	}

	@Override
	public void update(OrderDetailBean orderDetailBean) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) throws SQLException {
		OrderBean orderBean = sessionFactory.getCurrentSession().get(OrderBean.class, id);
		sessionFactory.getCurrentSession().delete(orderBean);
		
	}

	@Override
	public OrderBean getOrder(Integer id) throws SQLException {
		OrderBean OrderBean = sessionFactory.getCurrentSession().get(OrderBean.class, id);
		return OrderBean;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDetailBean> queryByOrderId(Integer orderId) throws SQLException {
		List<OrderDetailBean> list = null;
		try {
			list = sessionFactory.getCurrentSession()
							.createQuery("From OrderDetailBean a where a.productID = :productID")
							.setParameter("orderID", orderId)
							.getResultList();
		} catch (Exception e) {
			System.out.println("No Result.");
			return null;
		}
			return list;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDetailBean> queryByProductId(Integer productId) throws SQLException {
		List<OrderDetailBean> list = null;
		try {
			list = sessionFactory.getCurrentSession()
							.createQuery("From OrderDetailBean a where a.productID = :productID")
							.setParameter("productID", productId)
							.getResultList();
		} catch (Exception e) {
			System.out.println("No Result.");
			return null;
		}
			return list;
		
	}
}

