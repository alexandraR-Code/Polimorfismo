package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado cua = new Cuadrado("Cuadrado", "Rojo", 4);
		System.out.println(cua.calcularPerimetro());

		Rectangulo rec = new Rectangulo("Rectangulo", "Verde", 5, 8);
		System.out.println(rec.calcularPerimetro());

	}

}
