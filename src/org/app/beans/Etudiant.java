package org.app.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Etudiant")
public class Etudiant implements Serializable{
	
	public Etudiant()
	{}
	public Etudiant(String nomEtudiant, String prenomEtudiant,
			String adresseEtudiant, String emailEtudiant, String passEtudiant) {
		NomEtudiant = nomEtudiant;
		PrenomEtudiant = prenomEtudiant;
		AdresseEtudiant = adresseEtudiant;
		EmailEtudiant = emailEtudiant;
		PassEtudiant = passEtudiant;
	}

	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_etudiant")
	private int IdEtudiant;
	
	@Column(name="Nom_etudiant")
	private String NomEtudiant;
	
	@Column(name="Prenom_etudiant")
	private String PrenomEtudiant;
	
	@Column(name="Adresse_etudiant")
	private String AdresseEtudiant;
	
	@Column(name="Email_etudiant")
	private String EmailEtudiant;
	
	@Column(name="Pass_etudiant")
	private String PassEtudiant;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getIdEtudiant() {
		return IdEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		IdEtudiant = idEtudiant;
	}

	public String getNomEtudiant() {
		return NomEtudiant;
	}

	public void setNomEtudiant(String nomEtudiant) {
		NomEtudiant = nomEtudiant;
	}

	public String getPrenomEtudiant() {
		return PrenomEtudiant;
	}

	public void setPrenomEtudiant(String prenomEtudiant) {
		PrenomEtudiant = prenomEtudiant;
	}

	public String getAddresseEtudiant() {
		return AdresseEtudiant;
	}

	public void setAddresseEtudiant(String adresseEtudiant) {
		AdresseEtudiant = adresseEtudiant;
	}

	public String getEmailEtudiant() {
		return EmailEtudiant;
	}

	public void setEmailEtudiant(String emailEtudiant) {
		EmailEtudiant = emailEtudiant;
	}

	public String getPassEtudiant() {
		return PassEtudiant;
	}

	public void setPassEtudiant(String passEtudiant) {
		PassEtudiant = passEtudiant;
	}
}
