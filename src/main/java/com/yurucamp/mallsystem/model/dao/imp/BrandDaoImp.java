package com.yurucamp.mallsystem.model.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.mallsystem.model.BrandBean;
import com.yurucamp.mallsystem.model.dao.BrandDao;

@Repository
public class BrandDaoImp implements BrandDao {

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
		sessionFactory.getCurrentSession().update(bean);
	}

	@Override
	public void deleteOne(Integer id) throws SQLException {
		BrandBean brandBean = sessionFactory.getCurrentSession().get(BrandBean.class, id);
		sessionFactory.getCurrentSession().delete(brandBean);
	}

	@Override
	public List<BrandBean> queryAll() throws SQLException {
		Query<BrandBean> query = sessionFactory.getCurrentSession().createQuery("FROM BrandBean", BrandBean.class);
		List<BrandBean> list = query.list();
		return list;
	}

	@Override
	public BrandBean queryOne(Integer id) throws SQLException {
		BrandBean brandBean = sessionFactory.getCurrentSession().get(BrandBean.class, id);
		return brandBean;
	}

	@Override
	public List<BrandBean> querypage() throws SQLException {
		String hql = "FROM BrandBean Order by id desc";
		Query<BrandBean> query = sessionFactory.getCurrentSession().createQuery(hql,BrandBean.class);
		query.setFirstResult(0);
		query.setMaxResults(5);
		List<BrandBean> results = query.list();
		return results;
	}
	
	@Override
	public Integer queryId(String brandname) throws SQLException {
		String hql = "from BrandBean where name=:name";
		System.out.println(hql);
		BrandBean brandBean= (BrandBean) sessionFactory.getCurrentSession().createQuery(hql).setParameter("name", brandname).getSingleResult();
		Integer id = brandBean.getId();
		return id ;			
	}

	@SuppressWarnings("unchecked")
	@Override
	public BrandBean querylast() throws SQLException {
//		Query<BrandBean> query = sessionFactory.getCurrentSession().createQuery("FROM BrandBean b order by b.id desc")
//				.setMaxResults(1);
//		Query<BrandBean> query = sessionFactory.getCurrentSession().createQuery("SELECT TOP (1) * FROM BrandBean ORDER BY id DESC",BrandBean.class);
//		List<BrandBean> result = query.list();
//		return (BrandBean) result;
		return null;
	}


	/**
	* 使用hql語句進行分頁查詢
	* @param hql 需要查詢的hql語句
	* @param offset 第一條記錄索引
	* @param pageSize 每頁需要顯示的記錄數
	* @return 當前頁的所有記錄
	*/
//	@SuppressWarnings("rawtypes")
//	public List findByPage(final String hql,
//	final int offset, final int pageSize)
//	{
//	//通過一個HibernateCallback物件來執行查詢
//	List list = getHibernateTemplate()
//	.executeFind(new HibernateCallback()
//	{
//	//實現HibernateCallback介面必須實現的方法
//	public Object doInHibernate(Session session)
//	throws HibernateException
//	{
//	//執行Hibernate分頁查詢
//	List result = session.createQuery(hql)
//	.setFirstResult(offset)
//	.setMaxResults(pageSize)
//	.list();
//	return result;
//	}
//	});
//	return list;
//	}
	
	
}
