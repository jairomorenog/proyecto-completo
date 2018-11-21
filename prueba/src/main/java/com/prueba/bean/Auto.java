package com.prueba.bean;

public class Auto {
	
	private String color;
	private String marca;
	private int id;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	 public Auto(int id,String color,String marca) {
		 this.id=id;
		 this.color=color;
		 this.marca=marca;
		 
	 }
}
