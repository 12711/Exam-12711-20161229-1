package com.lsm.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class FilmEvent extends ApplicationContextEvent {
	private String message;

	public FilmEvent(ApplicationContext source) {
		super(source);

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
