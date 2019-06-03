package org.app.dao;

import java.util.List;

import org.app.beans.User;
import org.app.interfaces.UserInterface;
import org.hibernate.Query;

public class UserDao extends SessionDao implements UserInterface {

	@Override
	public long add(User user) throws Exception {
		// TODO Auto-generated method stub
		openCurrentSessionWithTransaction();
		getCurrentSession().save(user);
		closeCurrentSessionWithTransaction();
		return user.getIdUser();
	}

	@Override
	public boolean modify(User user) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().update(user);
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
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		try
		{
			openCurrentSessionWithTransaction();
			getCurrentSession().delete(user);
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
	public List<User> getList() {
		// TODO Auto-generated method stub
		openCurrentSession();
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>)getCurrentSession().createQuery("FROM User").list();
		closeCurrentSession();
		return list;
	}
	public User findById(long id) {
		// TODO Auto-generated method stub
		User user=null;
		openCurrentSession();
		user=getCurrentSession().get(User.class, id);
		closeCurrentSession();
		return user;
}
	public User checkUser(String identifiant, String motdepasse) {
		User user = null;
		try {
			openCurrentSessionWithTransaction();
			Query query = getCurrentSession().createQuery("FROM User WHERE Email_user=:ident AND Pass_user=:passe ");
			query.setString("ident", identifiant);
			query.setString("passe", motdepasse);
			if (!query.list().isEmpty())
				user = (User) query.list().listIterator().next();
			closeCurrentSessionWithTransaction();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return user;
		}
	}
}