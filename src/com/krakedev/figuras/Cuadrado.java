package com.krakedev.figuras;

public class Cuadrado extends Figura {

	// Atributos
	private int lado;

	// Metodos getter y setter
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	// Constructor
	public Cuadrado(String nombre, String color, int lado) {
		super(nombre, color);
		this.lado = lado;
	}

	// Método calcular perimetro
	public int calcularPerimetro() {
		return 4 * lado;
	}

}
