package org.app.dao;

import java.util.List;

import org.app.beans.Etudiant;
import org.app.interfaces.EtudiantInterface;
import org.hibernate.Query;

public class EtudiantDao extends SessionDao implements EtudiantInterface {

	@Override
	public long add(Etudiant etudiant) throws Exception {
		// TODO Auto-generated method stub
		openCurrentSessionWithTransaction();
		getCurrentSession().save(etudiant);
		closeCurrentSessionWithTransaction();
		return etudiant.getIdEtudiant();
	}

	@Override
	public boolean modify(Etudiant etudiant) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().update(etudiant);
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
	public boolean delete(Etudiant etudiant) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().delete(etudiant);
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
	public List<Etudiant> getList() {
		// TODO Auto-generated method stub
		openCurrentSession();
		@SuppressWarnings("unchecked")
		List<Etudiant> list = (List<Etudiant>)getCurrentSession().createQuery("FROM Etudiant").list();
		closeCurrentSession();
		return list;
	}

	@Override
	public Etudiant findById(long id) {
		// TODO Auto-generated method stub
		Etudiant etudiant=null;
		openCurrentSession();
		etudiant=getCurrentSession().get(Etudiant.class, id);
		closeCurrentSession();
		return etudiant;
	}
	public Etudiant findByEmail(String mail) {
		// TODO Auto-generated method stub
		Etudiant etudiant=null;
		try
		{
		openCurrentSessionWithTransaction();
		Query query = getCurrentSession().createQuery("from Etudiant where Email_etudiant=:mail");
		query.setString("mail", mail);
		if (!query.list().isEmpty())
			etudiant = (Etudiant) query.list().listIterator().next();
		closeCurrentSessionWithTransaction();
		return etudiant;
		} catch (Exception e) {
			e.printStackTrace();
			return etudiant;
		}
	}
}
