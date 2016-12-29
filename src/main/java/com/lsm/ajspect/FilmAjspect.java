package com.lsm.ajspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;

import com.lsm.event.FilmEvent;

public class FilmAjspect {

	@Autowired
	ApplicationEventPublisher applicationEventPublisher;

	public Object around(ProceedingJoinPoint joinPoint) {
		// 发布插入之前的事件
		FilmEvent event1 = new FilmEvent((ApplicationContext) applicationEventPublisher);
		event1.setMessage("Before Insert Film Data");
		applicationEventPublisher.publishEvent(event1);

		Object[] args = joinPoint.getArgs();
		Object obj=null;
		try {
			obj= joinPoint.proceed(args);
		} catch (Throwable e) {
			e.printStackTrace();
		}

		// 发布插入之后的事件
		FilmEvent event2 = new FilmEvent((ApplicationContext) applicationEventPublisher);
		event2.setMessage("After Insert Film Data");

		applicationEventPublisher.publishEvent(event2);

		return obj;
	}
}
