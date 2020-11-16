package com.yurucamp.mallsystem.model.dao.imp;

import java.sql.SQLException;
import java.sql.Timestamp;
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
	public ProductBean queryOne(Integer id) throws SQLException {
		ProductBean product = sessionFactory.getCurrentSession().get(ProductBean.class, id);
		return product;
	}


	@Override
	public void insert(ProductBean productBean) throws SQLException {
		sessionFactory.getCurrentSession().save(productBean);
	}

	@Override
	public void update(ProductBean productBean) throws SQLException {
		ProductBean bean = sessionFactory.getCurrentSession().get(ProductBean.class, productBean.getId());
		bean.setPrice(productBean.getPrice());
		bean.setStock(productBean.getStock());
		bean.setDescription(productBean.getDescription());
		bean.setUpdatetime(new Timestamp(System.currentTimeMillis()));	
		sessionFactory.getCurrentSession().update(bean);
	}

	@Override
	public void deleteOne(Integer id) throws SQLException {
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

//	@Override
//	public JSONArray querypage() throws SQLException {
//		String hql = "FROM ProductBean Order by id desc";
//		Query<ProductBean> query = sessionFactory.getCurrentSession().createQuery(hql,ProductBean.class);
//		query.setFirstResult(0);
//		query.setMaxResults(5);
//		JSONArray results = (JSONArray) query.list();
//		return results;
//	}
	
	@Override
	public List<ProductBean> querypage() throws SQLException {
		String hql = "FROM ProductBean Order by id desc";
		Query<ProductBean> query = sessionFactory.getCurrentSession().createQuery(hql,ProductBean.class);
		query.setFirstResult(0);
		query.setMaxResults(5);
		List<ProductBean> results = query.list();
		return results;
	}
}
