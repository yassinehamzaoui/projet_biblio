	package org.app.service;

	import java.util.List;

	import org.app.beans.Administrateur;
	import org.app.dao.AdministrateurDao;
	import org.app.interfaces.AdministrateurInterface;

	public class AdministrateurService implements AdministrateurInterface{

		AdministrateurDao service;
		@Override
		public long add(Administrateur admin) throws Exception {
			// TODO Auto-generated method stub
			service = new AdministrateurDao();
			return service.add(admin);
		}

		@Override
		public boolean modify(Administrateur admin) {
			// TODO Auto-generated method stub
			service = new AdministrateurDao();
			return service.modify(admin);
		}

		@Override
		public boolean delete(Administrateur admin) {
			// TODO Auto-generated method stub
			service = new AdministrateurDao();
			return service.delete(admin);
		}

		@Override
		public List<Administrateur> getList() {
			// TODO Auto-generated method stub
			service = new AdministrateurDao();
			return service.getList();
		}

		@Override
		public Administrateur findById(long id) {
			// TODO Auto-generated method stub
			service = new AdministrateurDao();
			return service.findById(id);
		}
		
		public Administrateur findByEmail(String mail){
			service = new AdministrateurDao();
			return service.findByEmail(mail);
		}
	}
