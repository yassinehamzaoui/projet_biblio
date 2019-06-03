package org.app.dao;

import java.util.List;

import org.app.beans.Administrateur;
import org.app.interfaces.AdministrateurInterface;
import org.hibernate.Query;

public class AdministrateurDao extends SessionDao implements AdministrateurInterface {

	@Override
	public long add(Administrateur admin) throws Exception {
		// TODO Auto-generated method stub
		openCurrentSessionWithTransaction();
		getCurrentSession().save(admin);
		closeCurrentSessionWithTransaction();
		return admin.getIdAdministrateur();
	}

	@Override
	public boolean modify(Administrateur admin) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().update(admin);
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
	public boolean delete(Administrateur admin) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().delete(admin);
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
	public List<Administrateur> getList() {
		// TODO Auto-generated method stub
		openCurrentSession();
		@SuppressWarnings("unchecked")
		List<Administrateur> list = (List<Administrateur>)getCurrentSession().createQuery("FROM Administrateur").list();
		closeCurrentSession();
		return list;
	}

	@Override
	public Administrateur findById(long id) {
		// TODO Auto-generated method stub
		Administrateur admin=null;
		openCurrentSession();
		admin=getCurrentSession().get(Administrateur.class, id);
		closeCurrentSession();
		return admin;
	}
	
	public Administrateur findByEmail(String mail) {
		// TODO Auto-generated method stub
		Administrateur administrateur=null;
		try
		{
		openCurrentSessionWithTransaction();
		Query query = getCurrentSession().createQuery("from Administrateur where Email_administrateur=:mail");
		query.setString("mail", mail);
		if (!query.list().isEmpty())
			administrateur = (Administrateur) query.list().listIterator().next();
		closeCurrentSessionWithTransaction();
		return administrateur;
		} catch (Exception e) {
			e.printStackTrace();
			return administrateur;
		}
	}
}

