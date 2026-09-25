package com.krakedev.test;

import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;

public class TestHexagono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graficador gra = new Graficador();
		
		Hexagono hexagono = new Hexagono("Hexagono", "Rosa", 2);
		
		gra.graficar(hexagono);

	}

}
