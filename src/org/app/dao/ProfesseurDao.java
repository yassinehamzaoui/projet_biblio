package org.app.dao;

import java.util.List;

import org.app.beans.Professeur;
import org.app.interfaces.ProfesseurInterface;
import org.hibernate.Query;

public class ProfesseurDao extends SessionDao implements ProfesseurInterface {

	@Override
	public long add(Professeur prof) throws Exception {
		// TODO Auto-generated method stub
		openCurrentSessionWithTransaction();
		getCurrentSession().save(prof);
		closeCurrentSessionWithTransaction();
		return prof.getIdProfesseur();
	}

	@Override
	public boolean modify(Professeur prof) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().update(prof);
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
	public boolean delete(Professeur prof) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().delete(prof);
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
	public List<Professeur> getList() {
		// TODO Auto-generated method stub
		openCurrentSession();
		@SuppressWarnings("unchecked")
		List<Professeur> list = (List<Professeur>)getCurrentSession().createQuery("FROM Professeur").list();
		closeCurrentSession();
		return list;
	}

	@Override
	public Professeur findById(long id) {
		// TODO Auto-generated method stub
		Professeur prof=null;
		openCurrentSession();
		prof=getCurrentSession().get(Professeur.class, id);
		closeCurrentSession();
		return prof;
	}
	public Professeur findByEmail(String mail) {
		// TODO Auto-generated method stub
		Professeur professeur=null;
		try
		{
		openCurrentSessionWithTransaction();
		Query query = getCurrentSession().createQuery("from Professeur where Email_professeur=:mail");
		query.setString("mail", mail);
		if (!query.list().isEmpty())
			professeur = (Professeur) query.list().listIterator().next();
		closeCurrentSessionWithTransaction();
		return professeur;
		} catch (Exception e) {
			e.printStackTrace();
			return professeur;
		}
	}
}

