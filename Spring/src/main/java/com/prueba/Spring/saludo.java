package com.prueba.Spring;

import org.springframework.beans.factory.annotation.Value;

public class saludo {

	@Value("saludo desde mi beans")
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
