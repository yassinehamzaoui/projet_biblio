package org.app.dao;

import java.util.List;

import org.app.beans.News;
import org.app.interfaces.NewsInterface;

public class NewsDao extends SessionDao implements NewsInterface {

	@Override
	public long add(News news) throws Exception {
		// TODO Auto-generated method stub
		openCurrentSessionWithTransaction();
		getCurrentSession().save(news);
		closeCurrentSessionWithTransaction();
		return news.getIdNews();
	}

	@Override
	public boolean modify(News news) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().update(news);
			closeCurrentSessionWithTransaction();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(News news) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().delete(news);
			closeCurrentSessionWithTransaction();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<News> getList() {
		// TODO Auto-generated method stub
		openCurrentSession();
		@SuppressWarnings("unchecked")
		List<News> list = (List<News>)getCurrentSession().createQuery("FROM News").list();
		closeCurrentSession();
		return list;
	}
}
