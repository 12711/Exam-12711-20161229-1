package com.lsm.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class FilmListener implements ApplicationListener<FilmEvent> {

	@Override
	public void onApplicationEvent(FilmEvent event) {
       System.out.println(event.getMessage());
	}

}
