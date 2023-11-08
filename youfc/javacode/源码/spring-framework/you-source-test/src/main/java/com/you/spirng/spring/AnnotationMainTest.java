package com.you.spirng.spring;

import com.you.spirng.spring.bean.Person;
import com.you.spirng.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解spring的用法
 */
public class AnnotationMainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
