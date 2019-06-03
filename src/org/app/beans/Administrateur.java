	package org.app.beans;

	import java.io.Serializable;

	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="Administrateur")
	public class Administrateur implements Serializable{
		private static final long serialVersionUID=1L;
		
		public Administrateur()
		{}
		
		public Administrateur(String nomAdministrateur,
				String prenomAdministrateur, String adresseAdministrateur,
				String emailAdministrateur, String passAdministrateur) {
			NomAdministrateur = nomAdministrateur;
			PrenomAdministrateur = prenomAdministrateur;
			AdresseAdministrateur = adresseAdministrateur;
			EmailAdministrateur = emailAdministrateur;
			PassAdministrateur = passAdministrateur;
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="Id_administrateur")
		private int IdAdministrateur;
		
		@Column(name="Nom_administrateur")
		private String NomAdministrateur;
		
		@Column(name="Prenom_administrateur")
		private String PrenomAdministrateur;
		
		@Column(name="Adresse_administrateur")
		private String AdresseAdministrateur;
		
		@Column(name="Email_administrateur")
		private String EmailAdministrateur;
		
		@Column(name="Pass_administrateur")
		private String PassAdministrateur;
		
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public int getIdAdministrateur() {
			return IdAdministrateur;
		}

		public void setIdAdministrateurr(int idadmin) {
			this.IdAdministrateur = idadmin;
		}

		public String getNomAdministrateur() {
			return NomAdministrateur;
		}

		public void setNomAdministrateur(String nomadmin) {
			this.NomAdministrateur = nomadmin;
		}

		public String getPrenomAdministrateur() {
			return PrenomAdministrateur;
		}

		public void setPrenomAdministrateur(String prenomadmin) {
			this.PrenomAdministrateur = prenomadmin;
		}

		public String getAddresseAdministrateur() {
			return AdresseAdministrateur;
		}

		public void setAddresseAdministrateur(String adresseadmin) {
			this.AdresseAdministrateur = adresseadmin;
		}

		public String getEmailAdministrateur() {
			return EmailAdministrateur;
		}

		public void setEmailAdministrateur(String emailAdministrateur) {
			this.EmailAdministrateur = emailAdministrateur;
		}

		public String getPassAdministrateur() {
			return PassAdministrateur;
		}

		public void setPassAdministrateur(String passAdministrateur) {
			this.PassAdministrateur = passAdministrateur;
		}

	}
