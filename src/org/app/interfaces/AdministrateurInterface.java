package org.app.interfaces;

import java.util.List;
import org.app.beans.Administrateur;

public interface AdministrateurInterface {
	public long add(Administrateur admin) throws Exception;
	public boolean modify(Administrateur admin) ;
	public boolean delete(Administrateur admin);
	public List<Administrateur> getList();
	public Administrateur findById(long id);
	public Administrateur findByEmail(String mail);
}
