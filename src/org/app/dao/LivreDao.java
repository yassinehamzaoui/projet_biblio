package org.app.dao;

import java.util.List;

import org.app.beans.Livre;
import org.app.interfaces.LivreInterface;
import org.hibernate.Query;

public class LivreDao extends SessionDao implements LivreInterface {

	@Override
	public long add(Livre livre) throws Exception {
		// TODO Auto-generated method stub
		openCurrentSessionWithTransaction();
		getCurrentSession().save(livre);
		closeCurrentSessionWithTransaction();
		return livre.getIdLivre();
	}

	@Override
	public boolean modify(Livre livre) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().update(livre);
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
	public boolean delete(Livre livre) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().delete(livre);
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
	public List<Livre> getList() {
		// TODO Auto-generated method stub
		openCurrentSession();
		@SuppressWarnings("unchecked")
		List<Livre> list = (List<Livre>)getCurrentSession().createQuery("FROM Livre").list();
		closeCurrentSession();
		return list;
	}

	@Override
	public Livre findById(long id) {
		// TODO Auto-generated method stub
		Livre livre=null;
		openCurrentSession();
		livre=getCurrentSession().get(Livre.class,id);
		closeCurrentSession();
		return livre;
	}
	public Livre findByName(String TitreLivre) {
		// TODO Auto-generated method stub
		Livre livre = null;
		try
		{
		openCurrentSessionWithTransaction();
		Query query = getCurrentSession().createQuery("from Livre where Titre_livre=:TitreLivre");
		query.setString("TitreLivre", TitreLivre);
		if (!query.list().isEmpty())
			livre = (Livre) query.list().listIterator().next();
		closeCurrentSessionWithTransaction();
		return livre;
		} catch (Exception e) {
			e.printStackTrace();
			return livre;
		}
	}
	@SuppressWarnings("unchecked")
	public List<Livre> findByAutor(String auteur){
		// TODO Auto-generated method stub
		openCurrentSession();
		List<Livre> list = (List<Livre>)getCurrentSession().createQuery("FROM Livre where Auteur_livre=:auteur").setParameter("auteur",auteur).list();
		closeCurrentSession();
		return list;
	}
	public List<Livre> findBytheme(String theme){
		// TODO Auto-generated method stub
		openCurrentSession();
		@SuppressWarnings("unchecked")
		List<Livre> list = (List<Livre>)getCurrentSession().createQuery("FROM Livre where Theme_livre=:theme").setParameter("theme",theme).list();
		closeCurrentSession();
		return list;
	}
	public List<Livre> findByLanguage(String langue){
		// TODO Auto-generated method stub
		openCurrentSession();
		@SuppressWarnings("unchecked")
		List<Livre> list = (List<Livre>)getCurrentSession().createQuery("FROM Livre where Langue_livre=:langue").setParameter("langue",langue).list();
		closeCurrentSession();
		return list;
	}
}
