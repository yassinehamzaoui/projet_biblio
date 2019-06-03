package org.app.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class User implements Serializable{
	private static final long serialVersionUID=1L;
	
	public User()
	{}
	
	public User(String emailUser, String passUser, int roleUser) {
		EmailUser = emailUser;
		PassUser = passUser;
		RoleUser = roleUser;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_user")
	private int IdUser;
		
	@Column(name="Email_user")
	private String EmailUser;

	@Column(name="Pass_user")
	private String PassUser;

	@Column(name="Role_user")
	private int RoleUser;

	public int getIdUser() {
		return IdUser;
	}

	public void setIdUser(int idUser) {
		IdUser = idUser;
	}

	public String getEmailUser() {
		return EmailUser;
	}

	public void setEmailUser(String emailUser) {
		EmailUser = emailUser;
	}

	public String getPassUser() {
		return PassUser;
	}

	public void setPassUser(String passUser) {
		PassUser = passUser;
	}

	public int getRoleUser() {
		return RoleUser;
	}

	public void setRoleUser(int roleUser) {
		RoleUser = roleUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}