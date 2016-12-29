package com.lsm.mapper;

import com.lsm.dto.Film;

public interface FilmMapper {
   public Film queryByFileName(Film film);
   
   public int insertFilm(Film film);
}
