package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciar obejtoss

		Graficador gra = new Graficador();
		Figura fig = new Figura("Figura generica", "Violeta");
		gra.graficar(fig);
		Cuadrado cua = new Cuadrado("Cuadrado", "Rojo");
		gra.graficar(cua);
		Rectangulo rec = new Rectangulo("Rectangulo", "Verde");
		gra.graficar(rec);
		
		// Instanciar graficar
		

	}

}
