package com.yurucamp.mallsystem.model.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.mallsystem.model.ProductBean;
import com.yurucamp.mallsystem.model.ShoppingCart;
import com.yurucamp.mallsystem.model.dao.ShoppingCartDao;

@Repository
public class ShoppingCartDaoImp implements ShoppingCartDao {

	private SessionFactory sessionFactory;

	@Autowired
	public ShoppingCartDaoImp(@Qualifier(value = "sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insert(Integer productId) throws SQLException {
		ProductBean productBean = sessionFactory.getCurrentSession().get(ProductBean.class, productId);
		ShoppingCart cart = new ShoppingCart();
		cart.setProductId(productId);
		if (quantityExists(productId)) {
			cart.setQuantity(cart.getQuantity()+1);
		}
		cart.setQuantity(1);	
		cart.setPrice(productBean.getPrice());
		sessionFactory.getCurrentSession().save(cart);
	}

	@Override
	public void update(ShoppingCart shoppingCart) throws SQLException {
		ShoppingCart cart = sessionFactory.getCurrentSession().get(ShoppingCart.class, shoppingCart.getId());
		cart.setQuantity(shoppingCart.getQuantity());	
		sessionFactory.getCurrentSession().update(cart);

	}

	@Override
	public void deleteProduct(Integer productId) throws SQLException {
		sessionFactory.getCurrentSession().createQuery("delete ShoppingCart where productId=:productId")
		.setParameter("memberId", productId);
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<ShoppingCart> queryAll(Integer memberId) throws SQLException {
	
		List<ShoppingCart> list = null;
		try {
				list =	sessionFactory.getCurrentSession().createQuery("from ShoppingCart where memberId=:memberId")
						.setParameter("memberId", memberId)
						.getResultList();
		}catch(Exception e) {
			System.out.println("No Result.");
			return null;
		}
		return list;
		
	}
	@Override
	public boolean quantityExists(Integer productId) {
		boolean Exists = false;
		ShoppingCart cart =	(ShoppingCart) sessionFactory.getCurrentSession().createQuery("from ShoppingCart where productId=:productId")
				.setParameter("productId",productId)
				.getSingleResult();
		int quantity = cart.getQuantity();
		if (quantity > 0) {
		 Exists = true;
		}
		return Exists;
	}
}