package org.app.interfaces;

import java.util.List;
import org.app.beans.User;

public interface UserInterface {

	public long add(User user) throws Exception;
	public boolean modify(User user) ;
	public boolean delete(User user);
	public List<User> getList();
	public User findById(long id);
}
