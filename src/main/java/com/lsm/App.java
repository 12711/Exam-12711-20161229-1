package com.lsm;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lsm.dto.Film;
import com.lsm.service.FilmService;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext(
				"classpath:ApplicationContext.xml");

		Scanner in = new Scanner(System.in);

		FilmService filmService = application.getBean("FilmService", FilmService.class);

		while (true) {

			System.out.println("请选择是否添加电影:\n--------1.添加--0.不添加------");
			String flag = in.next();
			if ("0".equals(flag)) {
				//关闭application
				application.close();
				break;
			}

			Film film = new Film();
			System.out.println("请输入电影名:");
			String title = in.next();
			film.setTitle(title);

			System.out.println("请输入电影描述:");
			film.setDescription(in.next());

			System.out.println("请输入语言ID:");
			film.setLanguageId(in.nextInt());

			filmService.insertFilm(film);

		}

	}
}
