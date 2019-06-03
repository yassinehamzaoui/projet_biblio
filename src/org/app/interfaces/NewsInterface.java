package org.app.interfaces;

import java.util.List;

import org.app.beans.News;

public interface NewsInterface {

	public long add(News news) throws Exception;
	public boolean modify(News news) ;
	public boolean delete(News news);
	public List<News> getList();
}
