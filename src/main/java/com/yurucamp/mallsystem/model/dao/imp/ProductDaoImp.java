package com.yurucamp.mallsystem.model.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.mallsystem.model.ItemStatus;
import com.yurucamp.mallsystem.model.ProductBean;
import com.yurucamp.mallsystem.model.dao.ProductDao;

@Repository
public class ProductDaoImp implements ProductDao {

	private SessionFactory sessionFactory;

	@Autowired
	public ProductDaoImp(@Qualifier(value = "sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}

	@Override
	public ProductBean queryOne(int id) throws SQLException {
		ProductBean product = sessionFactory.getCurrentSession().get(ProductBean.class, id);
		return product;
	}

	@Override
	public ProductBean querylast() throws SQLException {
		return null;
//		Query<ProductBean> query = sessionFactory.getCurrentSession().createQuery("SELECT TOP (1) * FROM Product ORDER BY productId DESC",ProductBean.class);
//		List<ProductBean> result = query.list();
//		return (ProductBean) result;
	}

	@Override
	public void insert(ProductBean productBean) throws SQLException {
		sessionFactory.getCurrentSession().save(productBean);
	}

	@Override
	public void update(ProductBean productBean) throws SQLException {
		ProductBean bean = sessionFactory.getCurrentSession().get(ProductBean.class, productBean.getId());			
		sessionFactory.getCurrentSession().update(bean);
	}

	@Override
	public void deleteOne(int id) throws SQLException {
		ProductBean productBean = sessionFactory.getCurrentSession().get(ProductBean.class, id);
		sessionFactory.getCurrentSession().delete(productBean);
	}

	@Override
	public List<ProductBean> queryAll() throws SQLException {
		Query<ProductBean> query = sessionFactory.getCurrentSession().createQuery("FROM ProductBean", ProductBean.class);
		List<ProductBean> list = query.list();
		return list;
	}
	
	@Override
	public Integer queryId(String status) throws SQLException {
		String hql = "from ItemStatus where name=:name";
		ItemStatus itemStatus= (ItemStatus) sessionFactory.getCurrentSession().createQuery(hql).setParameter("name", status).getSingleResult();
		Integer id = itemStatus.getId();
		return id ;			
	}
	
	@Override
	public ItemStatus queryOneStatus(Integer id) throws SQLException {
		ItemStatus itemStatus = sessionFactory.getCurrentSession().get(ItemStatus.class, id);
		return itemStatus;	
	}
	
}
