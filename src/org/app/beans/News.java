package org.app.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="News")
public class News implements Serializable {

	private static final long serialVersionUID=1L;
	
	public News()
	{}	
	
	public News(String titreNews, String descriptionNews) {
		TitreNews = titreNews;
		DescriptionNews = descriptionNews;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_news")
	private int IdNews;
	
	@Column(name="Titre_news")
	private String TitreNews;
	
	@Column(name="Description_news")
	private String DescriptionNews;

	public int getIdNews() {
		return IdNews;
	}

	public void setIdNews(int idNews) {
		IdNews = idNews;
	}

	public String getTitreNews() {
		return TitreNews;
	}

	public void setTitreNews(String titreNews) {
		TitreNews = titreNews;
	}

	public String getDescriptionNews() {
		return DescriptionNews;
	}

	public void setDescriptionNews(String descriptionNews) {
		DescriptionNews = descriptionNews;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
