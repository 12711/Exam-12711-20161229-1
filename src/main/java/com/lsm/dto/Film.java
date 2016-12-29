package com.lsm.dto;

/*
 * 电影实体类
 * */
public class Film {
	private Integer filmId;
	private String title;
	private String description;
	private Integer languageId;

	public Film(Integer filmId, String title, String description, Integer languageId) {
		super();
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.languageId = languageId;
	}

	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getFilmId() {
		return filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

}
