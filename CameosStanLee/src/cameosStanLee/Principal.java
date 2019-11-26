package cameosStanLee;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Scanner leerTexto = new Scanner(System.in);
		int numeroDeCasos, contador = 0, cameosEncontrados = 0;
		String texto, comprobacion = "stanlee";

		numeroDeCasos = leer.nextInt();
		do {
			numeroDeCasos--;
			texto = leerTexto.nextLine();
			for (int i = 0; i < texto.length(); i++) {
				if (texto.substring(i, i + 1).equalsIgnoreCase(comprobacion.substring(contador, contador + 1))) {
					contador++;
					if (contador == 7) {
						contador = 0;
						cameosEncontrados++;
					}
				}
			}
			System.out.println(cameosEncontrados);
			cameosEncontrados = 0;
		} while (numeroDeCasos != 0);
	}
}
