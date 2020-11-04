package com.yurucamp.mallSystem.model.dao.imp;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.mallSystem.model.ProductBean;
import com.yurucamp.mallSystem.model.dao.ProductDao;

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
		Query<ProductBean> query = sessionFactory.getCurrentSession().createQuery("SELECT TOP (1) * FROM Product ORDER BY productId DESC",ProductBean.class);
		List<ProductBean> result = query.list();
		return (ProductBean) result;
	}

	@Override
	public void insert(ProductBean productBean) throws SQLException {
		sessionFactory.getCurrentSession().save(productBean);
	}

	@Override
	public void update(ProductBean productBean) throws SQLException {
		ProductBean bean = sessionFactory.getCurrentSession().get(ProductBean.class, productBean.getId());
		bean.setBrandId(productBean.getBrandId());
		bean.setPrice(productBean.getPrice());
		bean.setImage(productBean.getImage());
		bean.setWebTraffic(productBean.getWebTraffic());
		bean.setDescription(productBean.getDescription());
		bean.setStatusId(productBean.getStatusId());
		bean.setStock(productBean.getStock());
		bean.setCategory(productBean.getCategory());
		bean.setCreatetime(productBean.getCreatetime());
		bean.setUpdatetime(productBean.getUpdatetime());

	}

	@Override
	public void deleteOne(int Id) throws SQLException {
		ProductBean productBean = sessionFactory.getCurrentSession().get(ProductBean.class, Id);
		sessionFactory.getCurrentSession().delete(productBean);
	}

	@Override
	public List<ProductBean> queryAll() throws SQLException {
		Query<ProductBean> query = sessionFactory.getCurrentSession().createQuery("from Product", ProductBean.class);
		List<ProductBean> list = query.list();
		return list;
	}

}
