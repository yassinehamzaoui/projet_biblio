package org.app.interfaces;
import java.util.List;

import org.app.beans.Professeur;

public interface ProfesseurInterface {

	public long add(Professeur prof) throws Exception;
	public boolean modify(Professeur prof) ;
	public boolean delete(Professeur prof);
	public List<Professeur> getList();
	public Professeur findById(long id);
	public Professeur findByEmail(String mail);
}