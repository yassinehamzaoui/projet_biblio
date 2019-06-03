package org.app.service;

import java.util.List;

import org.app.beans.User;
import org.app.dao.UserDao;
import org.app.interfaces.UserInterface;


public class UserService implements UserInterface{

	UserDao service;
	@Override
	public long add(User user) throws Exception {
		// TODO Auto-generated method stub
		service = new UserDao();
		return service.add(user);
	}

	@Override
	public boolean modify(User user) {
		// TODO Auto-generated method stub
		service = new UserDao();
		return service.modify(user);
	}

	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		service = new UserDao();
		return service.delete(user);
	}

	@Override
	public List<User> getList() {
		// TODO Auto-generated method stub
		service = new UserDao();
		return service.getList();
	}

	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		service = new UserDao();
		return service.findById(id);
	}
	public User checkUser(String identifiant, String motdepasse) {
		// TODO Auto-generated method stub
		service = new UserDao();
		return service.checkUser(identifiant, motdepasse);
	}
}
