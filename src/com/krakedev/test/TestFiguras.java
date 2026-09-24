package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciar objetos y imprimir los objetos
		Figura fig = new Figura("Figuras genericas", "Violeta");
		System.out.println(fig);

		Cuadrado cua = new Cuadrado("Cuadrado", "Rojo");
		System.out.println(cua);

		Triangulo tri = new Triangulo("Triangulo", "Azul");
		System.out.println(tri);
	}

}
