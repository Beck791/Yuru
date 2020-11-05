package com.yurucamp.mallSystem.model.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.mallSystem.model.BrandBean;
import com.yurucamp.mallSystem.model.dao.BrandDao;

@Repository
public class BrandDaoImp implements BrandDao{

	private SessionFactory sessionFactory;

	@Autowired
	public BrandDaoImp(@Qualifier(value = "sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void insert(BrandBean brandBean) throws SQLException {
		sessionFactory.getCurrentSession().save(brandBean);		
	}

	@Override
	public void update(BrandBean brandBean) throws SQLException {
		BrandBean bean = sessionFactory.getCurrentSession().get(BrandBean.class, brandBean.getId());
		bean.setId(brandBean.getId());
		bean.setName(brandBean.getName());
		bean.setCreatetime(brandBean.getCreatetime());
		bean.setUpdatetime(brandBean.getUpdatetime());
		
	}

	@Override
	public void deleteOne(int id) throws SQLException {
		BrandBean brandBean = sessionFactory.getCurrentSession().get(BrandBean.class, id);
		sessionFactory.getCurrentSession().delete(brandBean);
		
	}

	@Override
	public List<BrandBean> queryAll() throws SQLException {
//		Query<BrandBean> query = sessionFactory.getCurrentSession().createQuery("FROM BrandBean b order by b.id desc").setMaxResults(1);
		Query<BrandBean> query = sessionFactory.getCurrentSession().createQuery("FROM BrandBean", BrandBean.class);
		List<BrandBean> list = query.list();
		return list;
	}

	@Override
	public BrandBean queryOne(int id) throws SQLException {
		BrandBean brandBean = sessionFactory.getCurrentSession().get(BrandBean.class, id);
		return brandBean;
	}

	@SuppressWarnings("unchecked")
	@Override
	public BrandBean querylast() throws SQLException {                                                                  
        Query<BrandBean> query = sessionFactory.getCurrentSession().createQuery("FROM BrandBean b order by b.id desc").setMaxResults(1);
//		Query<BrandBean> query = sessionFactory.getCurrentSession().createQuery("SELECT TOP (1) * FROM BrandBean ORDER BY id DESC",BrandBean.class);
		List<BrandBean> result = query.list();
		return (BrandBean) result;
	}

}
