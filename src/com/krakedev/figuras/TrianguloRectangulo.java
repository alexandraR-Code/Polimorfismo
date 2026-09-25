package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {

	// Atributos
	private int catetoA;
	private int catetoB;
	private double hipotenusa;

	// Metodos getter y setter
	public int getCatetoA() {
		return catetoA;
	}

	public void setCatetoA(int catetoA) {
		this.catetoA = catetoA;
	}

	public int getCatetoB() {
		return catetoB;
	}

	public void setCatetoB(int catetoB) {
		this.catetoB = catetoB;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}

	// Constructor

	public TrianguloRectangulo(String nombre, String color, int catetoA, int catetoB) {
		super(nombre, color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		this.hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
	}

	@Override
	public double calcularArea() {
		return (catetoA * catetoB) / 2.0;
	}

	@Override
	public int calcularPerimetro() {
		return (int) (catetoA + catetoB + hipotenusa);
	}

}
