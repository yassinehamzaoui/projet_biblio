package org.app.service;

import java.util.List;

import org.app.beans.News;
import org.app.dao.NewsDao;
import org.app.interfaces.NewsInterface;

public class NewsService implements NewsInterface{

	NewsDao service;
	@Override
	public long add(News news) throws Exception {
		// TODO Auto-generated method stub
		service = new NewsDao();
		return service.add(news);
	}

	@Override
	public boolean modify(News news) {
		// TODO Auto-generated method stub
		service = new NewsDao();
		return service.modify(news);
	}

	@Override
	public boolean delete(News news) {
		// TODO Auto-generated method stub
		service = new NewsDao();
		return service.delete(news);
	}

	@Override
	public List<News> getList() {
		// TODO Auto-generated method stub
		service = new NewsDao();
		return service.getList();
	}
}