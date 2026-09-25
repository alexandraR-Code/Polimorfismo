package com.krakedev.figuras;

public class Triangulo extends Figura {

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
	public Triangulo(String nombre, String color, int lado) {
		super(nombre, color);
		this.lado = lado;
	}

	// Triangulo equilatero: 3 lados iguales
	@Override
	public int calcularPerimetro() {
		return 3 * lado;
	}

	@Override
	public double calcularArea() {
		return (Math.sqrt(3) / 4) * lado * lado;
	}

}