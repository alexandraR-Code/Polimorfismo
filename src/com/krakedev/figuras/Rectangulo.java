package com.krakedev.figuras;

public class Rectangulo extends Figura {
	// Atributos
	private int base;
	private int altura;

	// Metodos getter y setter

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	// Constructor
	public Rectangulo(String nombre, String color, int base, int altura) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}

	// metodo calcular perimetro
	public int calcularPerimetro() {
		return 2 * base + 2 * altura;
	}

}
