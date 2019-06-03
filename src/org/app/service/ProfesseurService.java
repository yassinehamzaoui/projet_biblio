
package org.app.service;

import java.util.List;

import org.app.beans.Professeur;
import org.app.dao.ProfesseurDao;
import org.app.interfaces.ProfesseurInterface;

public class ProfesseurService implements ProfesseurInterface{

	ProfesseurDao service;
	@Override
	public long add(Professeur prof) throws Exception {
		// TODO Auto-generated method stub
		service = new ProfesseurDao();
		return service.add(prof);
	}

	@Override
	public boolean modify(Professeur prof) {
		// TODO Auto-generated method stub
		service = new ProfesseurDao();
		return service.modify(prof);
	}

	@Override
	public boolean delete(Professeur prof) {
		// TODO Auto-generated method stub
		service = new ProfesseurDao();
		return service.delete(prof);
	}

	@Override
	public List<Professeur> getList() {
		// TODO Auto-generated method stub
		service = new ProfesseurDao();
		return service.getList();
	}

	@Override
	public Professeur findById(long id) {
		// TODO Auto-generated method stub
		service = new ProfesseurDao();
		return service.findById(id);
	}
	
	
	public Professeur findByEmail(String mail){
		service = new ProfesseurDao();
		return service.findByEmail(mail);
	}
}
