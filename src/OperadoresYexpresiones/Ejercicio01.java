package OperadoresYexpresiones;

import java.util.Scanner;

/**
 * @author Dalvi
 *
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		// Programa que calcule 3 calficaciones
		
		Scanner entrada = new Scanner(System.in);
		
		int primeraCalificacion = 0;
		int segundaCalificacion = 0;
		int terceraCalificacion = 0;
		
		
		System.out.println("Introduce una calificacion");
		primeraCalificacion = entrada.nextInt();
		System.out.println("Introduce una segunda calificacion");
		segundaCalificacion = entrada.nextInt();
		System.out.println("Introduce una tercera calificación");
		terceraCalificacion = entrada.nextInt();
		int total = primeraCalificacion + segundaCalificacion + terceraCalificacion;
		System.out.println("Total: "+ total);
		

	}

}
