package org.app.service;

import java.util.List;

import org.app.beans.Etudiant;
import org.app.dao.EtudiantDao;
import org.app.interfaces.EtudiantInterface;

public class EtudiantService implements EtudiantInterface{

	EtudiantDao service;
	@Override
	public long add(Etudiant etudiant) throws Exception {
		// TODO Auto-generated method stub
		service = new EtudiantDao();
		return service.add(etudiant);
	}

	@Override
	public boolean modify(Etudiant etudiant) {
		// TODO Auto-generated method stub
		service = new EtudiantDao();
		return service.modify(etudiant);
	}

	@Override
	public boolean delete(Etudiant etudiant) {
		// TODO Auto-generated method stub
		service = new EtudiantDao();
		return service.delete(etudiant);
	}

	@Override
	public List<Etudiant> getList() {
		// TODO Auto-generated method stub
		service = new EtudiantDao();
		return service.getList();
	}

	@Override
	public Etudiant findById(long id) {
		// TODO Auto-generated method stub
		service = new EtudiantDao();
		return service.findById(id);
	}
	
	public Etudiant findByEmail(String mail){
		service = new EtudiantDao();
		return service.findByEmail(mail);
	}

}
