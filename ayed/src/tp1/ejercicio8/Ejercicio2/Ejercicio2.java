package tp1.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static int[] generarVector(int n) {
		int[] vectorAux = new int[n];
		for(int i = 0; i < n;i++) {
			vectorAux[i] = n * (i+1);
		}
		return vectorAux;
	}
	
	public static void main(String[] args) {
		System.out.print("Ingrese N= ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] vectorRetornado = generarVector(n);
		for(int i = 0; i < vectorRetornado.length; i++) {
			System.out.print(vectorRetornado[i] + " , ");
		}
		s.close();
	}

}
