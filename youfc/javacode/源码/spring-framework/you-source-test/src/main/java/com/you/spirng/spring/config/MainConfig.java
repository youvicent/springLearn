package com.you.spirng.spring.config;


import com.you.spirng.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 这是一个配置类
 */
@Configuration
public class MainConfig {

	@Bean
	public Person person(){
		Person person = new Person();
		person.setName("王五");
		return person;
	}
}
