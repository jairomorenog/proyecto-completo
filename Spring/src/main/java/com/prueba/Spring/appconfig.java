package com.prueba.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appconfig {
	
	@Bean
	public saludo saludo() {
		return new saludo();
	}

}
