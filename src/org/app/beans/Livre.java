package org.app.beans;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="Livre")
	public class Livre implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	public Livre()
	{}
		
	public Livre(String titreLivre, String auteurLivre, String themeLivre,
				String langueLivre, String dateParution, int nbrPageLivre) {
			TitreLivre = titreLivre;
			AuteurLivre = auteurLivre;
			ThemeLivre = themeLivre;
			LangueLivre = langueLivre;
			DateParution = dateParution;
			NbrPageLivre = nbrPageLivre;	
		}

	
	public String toString()
	{
		return "Titre : "+TitreLivre+"<br>"+" Auteur : "+AuteurLivre+"<br>"+" Theme : "+ThemeLivre+"<br>"+" Langue : "+LangueLivre+"<br>"+
				" Date de parution : "+DateParution+"<br>"+" Nombre de pages : "+NbrPageLivre+"<br>";
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_livre")
	private int IdLivre;
	
	@Column(name="Titre_livre")
	private String TitreLivre;
	
	@Column(name="Auteur_livre")
	private String AuteurLivre;
	
	@Column(name="Theme_livre")
	private String ThemeLivre;
	
	@Column(name="Langue_livre")
	private String LangueLivre;
	
	@Column(name="Date_parution")
	private String DateParution;
	
	@Column(name="Nbr_page_livre")
	private int NbrPageLivre;

	@Column(name="Path_livre")
	private String Path;

	public int getIdLivre() {
		return IdLivre;
	}

	public void setIdLivre(int idLivre) {
		this.IdLivre = idLivre;
	}

	public String getTitreLivre() {
		return TitreLivre;
	}

	public void setTitreLivre(String titreLivre) {
		this.TitreLivre = titreLivre;
	}

	public String getAuteurLivre() {
		return AuteurLivre;
	}

	public void setAuteurLivre(String auteurLivre) {
		this.AuteurLivre = auteurLivre;
	}

	public String getThemeLivre() {
		return ThemeLivre;
	}

	public void setThemeLivre(String themeLivre) {
		this.ThemeLivre = themeLivre;
	}

	public String getLangueLivre() {
		return LangueLivre;
	}

	public void setLangueLivre(String langueLivre) {
		this.LangueLivre = langueLivre;
	}

	public String getDateParution() {
		return DateParution;
	}

	public void setDateParution(String dateParution) {
		this.DateParution = dateParution;
	}

	public int getNbrPageLivre() {
		return NbrPageLivre;
	}

	public void setNbrPageLivre(int nbrPageLivre) {
		this.NbrPageLivre = nbrPageLivre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPath() {
		return Path;
	}

	public void setPath(String path) {
		this.Path = path;
	}
	

}
