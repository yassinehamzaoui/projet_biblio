package org.app.interfaces;

import java.util.List;

import org.app.beans.Livre;

public interface LivreInterface {

	public long add(Livre livre) throws Exception;
	public boolean modify(Livre livre) ;
	public boolean delete(Livre livre);
	public List<Livre> getList();
	public Livre findById(long id);
	public Livre findByName(String nomlivre);
	public List<Livre> findByAutor(String auteur);
	public List<Livre> findBytheme(String theme);
	public List<Livre> findByLanguage(String langue);
}
