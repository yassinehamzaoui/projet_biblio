package org.app.interfaces;
import java.util.List;

import org.app.beans.Etudiant;
public interface EtudiantInterface {

	public long add(Etudiant etudiant) throws Exception;
	public boolean modify(Etudiant etudiant) ;
	public boolean delete(Etudiant etudiant);
	public List<Etudiant> getList();
	public Etudiant findById(long id);
	public Etudiant findByEmail(String mail);
}
