package com.krakedev.figuras;

public class Figura {
	// Atributos
	private String nombre;
	private String color;

	// Métodos getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Método toString
	@Override
	public String toString() {
		return "Figura [nombre= " + nombre + ", color= " + color + "]";
	}

	// Constructor
	public Figura(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}

}
