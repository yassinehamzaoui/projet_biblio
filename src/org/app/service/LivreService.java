package org.app.service;

import java.util.List;

import org.app.beans.Livre;
import org.app.dao.LivreDao;
import org.app.interfaces.LivreInterface;

public class LivreService implements LivreInterface{

	LivreDao service;
	@Override
	public long add(Livre livre) throws Exception {
		// TODO Auto-generated method stub
		service = new LivreDao();
		return service.add(livre);
	}

	@Override
	public boolean modify(Livre livre) {
		// TODO Auto-generated method stub
		service = new LivreDao();
		return service.modify(livre);
	}

	@Override
	public boolean delete(Livre livre) {
		// TODO Auto-generated method stub
		service = new LivreDao();
		return service.delete(livre);
	}

	@Override
	public List<Livre> getList() {
		// TODO Auto-generated method stub
		service = new LivreDao();
		return service.getList();
	}

	@Override
	public Livre findById(long id) {
		// TODO Auto-generated method stub
		service = new LivreDao();
		return service.findById(id);
	}
	public Livre findByName(String nomlivre){
		// TODO Auto-generated method stub
		service = new LivreDao();
		return service.findByName(nomlivre);
	}
	public List<Livre> findByAutor(String auteur){
		// TODO Auto-generated method stub
		service = new LivreDao();
		return service.findByAutor(auteur);
	}
	public List<Livre> findBytheme(String theme){
		// TODO Auto-generated method stub
		service = new LivreDao();
		return service.findBytheme(theme);
	}
	public List<Livre> findByLanguage(String langue){
		// TODO Auto-generated method stub
		service = new LivreDao();
		return service.findByLanguage(langue);
	}
}
