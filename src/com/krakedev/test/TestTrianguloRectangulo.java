package com.krakedev.test;

import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestTrianguloRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graficador gra = new Graficador();
		
		TrianguloRectangulo triR = new TrianguloRectangulo("Triangulo Rectangulo", "Verde", 5, 4);
		
		gra.graficar(triR);
		
	}

}
