package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura fig = new Figura();
		fig.setNombre("Figura genérica");
		fig.setColor("Violeta");
		System.out.println(fig);
		
		Cuadrado cua = new Cuadrado();
		cua.setNombre("Cuadrado");
		cua.setColor("Rojo");
		System.out.println(cua);
		
		Triangulo tri = new Triangulo();
		tri.setNombre("Triangulo");
		tri.setColor("Azul");
		System.out.println(tri);
	}

}
