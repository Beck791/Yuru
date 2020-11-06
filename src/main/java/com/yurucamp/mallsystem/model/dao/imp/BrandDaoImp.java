package com.yurucamp.mallsystem.model.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
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
		bean.setId(brandBean.getId());
		bean.setName(brandBean.getName());
		bean.setUpdatetime(brandBean.getUpdatetime());

	}

	@Override
	public void deleteOne(Integer id) throws SQLException {
//		sessionFactory.getCurrentSession().delete(BrandBean.class);	
//		sessionFactory.getCurrentSession().createQuery("delete BrandBean where id=:id").setParameter("id", id).executeUpdate();
//		sessionFactory.getCurrentSession().delete(id);
//		query.executeUpdate();
//		bean.set
//		BrandBean bean = (BrandBean) sessionFactory.getCurrentSession().createQuery("FROM BrandBean b where b.id=:id");
//		sessionFactory.getCurrentSession().delete(id);
//		sessionFactory.openSession().delete(id);
//		sessionFactory.close();
//		BrandBean brandBean = sessionFactory.getCurrentSession().get(BrandBean.class, id);
//		sessionFactory.getCurrentSession().delete(brandBean);
		BrandBean brandBean = new BrandBean();
		brandBean.setId(id);
		sessionFactory.getCurrentSession().delete(brandBean);
//		Session session = sessionFactory.getCurrentSession();
		System.out.println(id);
		System.out.println("I'm dao~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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

	@SuppressWarnings("unchecked")
	@Override
	public BrandBean querylast() throws SQLException {
		Query<BrandBean> query = sessionFactory.getCurrentSession().createQuery("FROM BrandBean b order by b.id desc")
				.setMaxResults(1);
//		Query<BrandBean> query = sessionFactory.getCurrentSession().createQuery("SELECT TOP (1) * FROM BrandBean ORDER BY id DESC",BrandBean.class);
		List<BrandBean> result = query.list();
		return (BrandBean) result;
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
