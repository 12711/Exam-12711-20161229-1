package com.lsm.service;

import com.lsm.dto.Film;

public interface FilmService {
	//检查将插入的电影是否已存在
	Film queryByFilmName(Film film);
    
	//插入电影
	int insertFilm(Film film);
}
