package org.app.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Professeur")
public class Professeur implements Serializable{

	private static final long serialVersionUID=1L;
	
	public Professeur()
	{}
	
	public Professeur(String nomProfesseur, String prenomProfesseur,
			String adresseProfesseur, String emailProfesseur,
			String passProfesseur, String specialité) {
		NomProfesseur = nomProfesseur;
		PrenomProfesseur = prenomProfesseur;
		AdresseProfesseur = adresseProfesseur;
		EmailProfesseur = emailProfesseur;
		PassProfesseur = passProfesseur;
		SpecialiteProfesseur = specialité;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_professeur")
	private int IdProfesseur;
	
	@Column(name="Nom_professeur")
	private String NomProfesseur;
	
	@Column(name="Prenom_professeur")
	private String PrenomProfesseur;
	
	@Column(name="Adresse_professeur")
	private String AdresseProfesseur;
	
	@Column(name="Email_professeur")
	private String EmailProfesseur;
	
	@Column(name="Pass_professeur")
	private String PassProfesseur;
	
	@Column(name="Specialite_professeur")
	private String SpecialiteProfesseur;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getIdProfesseur() {
		return IdProfesseur;
	}

	public void setIdProfesseur(int idprofesseur) {
		IdProfesseur = idprofesseur;
	}

	public String getNomProfesseur() {
		return NomProfesseur;
	}

	public void setNomProfesseur(String nomprofesseur) {
		NomProfesseur = nomprofesseur;
	}

	public String getPrenomProfesseur() {
		return PrenomProfesseur;
	}

	public void setPrenomProfesseur(String prenomprofesseur) {
		PrenomProfesseur = prenomprofesseur;
	}

	public String getAdresseProfesseur() {
		return AdresseProfesseur;
	}

	public void setAdresseProfesseur(String adresseprofesseur) {
		AdresseProfesseur = adresseprofesseur;
	}

	public String getSpecialiteProfesseur() {
		return SpecialiteProfesseur;
	}

	public void setSpecialiteProfesseur(String specialiteProfesseur) {
		SpecialiteProfesseur = specialiteProfesseur;
	}

	public String getEmailProfesseur() {
		return EmailProfesseur;
	}

	public void setEmailProfesseur(String emailProfesseur) {
		EmailProfesseur = emailProfesseur;
	}

	public String getPassProfesseur() {
		return PassProfesseur;
	}

	public void setPassProfesseur(String passProfesseur) {
		PassProfesseur = passProfesseur;
	}
}
