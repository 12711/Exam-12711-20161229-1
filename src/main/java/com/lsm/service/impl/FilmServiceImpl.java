package com.lsm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.lsm.dto.Film;
import com.lsm.event.FilmEvent;
import com.lsm.mapper.FilmMapper;
import com.lsm.service.FilmService;

@Service("FilmService")
public class FilmServiceImpl implements FilmService {

	@Autowired
	FilmMapper filmMapper;

	@Override
	public Film queryByFilmName(Film film) {

		return filmMapper.queryByFileName(film);
	}

	@Override
	public int insertFilm(Film film) {

		if (filmMapper.queryByFileName(film) != null) {
			System.out.println("电影已存在请重新输入.......");
			return 0;
		}
		int val = filmMapper.insertFilm(film);

		return val;
	}

}
