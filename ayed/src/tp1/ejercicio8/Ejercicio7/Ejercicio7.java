package tp1.Ejercicio7;

import java.util.*;
import tp1.Ejercicio3.Estudiante;

public class Ejercicio7 {

	public static void incisoD(){
		List<Estudiante> lEstudiantes = new LinkedList<Estudiante>();
		Estudiante e1 = new Estudiante("Mateo", "Guida", "mateoguida04@gmail.com", "42 y 122", 3);		
		Estudiante e2 = new Estudiante("Martina", "Alvarez", "malvarez@gmail.com", "4 y 64", 1);		
		Estudiante e3 = new Estudiante("Agustin", "Medina", "am8@gmail.com", "42 y 115", 5);		
		lEstudiantes.add(e1);
		lEstudiantes.add(e2);
		lEstudiantes.add(e3);
		List<Estudiante> lCopia = new LinkedList<Estudiante>();
		lCopia = lEstudiantes;
		System.out.println("=============Lista Original=============");
		for(Estudiante est : lEstudiantes) {
			System.out.println(est.tusDatos());
		}		
		System.out.println();
		System.out.println("===========Lista copia==============");
		for(Estudiante est : lCopia) {
			System.out.println(est.tusDatos());
		}
		
		lEstudiantes.get(2).setApellido("Juarez");
		
	
		System.out.println("=============Lista Original=============");
		for(Estudiante est : lEstudiantes) {
			System.out.println(est.tusDatos());
		}		
		System.out.println();
		System.out.println("===========Lista copia==============");
		for(Estudiante est : lCopia) {
			System.out.println(est.tusDatos());
		}
		Estudiante e4 = new Estudiante("Julian", "Alvarez", "araña@gmail", "125 y 48" ,5);
		if(lEstudiantes.contains(e4)) {
			System.out.println("El estudiante ya se encuentra en la lista");
		}else {
			System.out.println("Estudiante agregado");
			lEstudiantes.add(e4);
		}
		
		System.out.println(lEstudiantes.contains(e4));
	}
	
	public static boolean esCapicua(ArrayList<Integer> lista) {
		if(lista.size()%2 == 0) {
			return false;
		}else {
			if(lista.reversed().equals(lista)) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	public static List<Integer> calcularSucesion(int n){
		List<Integer> listaAux = new LinkedList<Integer>();
		if(n != 1) {
			if(n%2 == 0) {
				listaAux.add(n);
				n = n/2;
				listaAux.addAll(calcularSucesion(n));
				return listaAux;
			}else {
				listaAux.add(n);
				n = 3*n + 1;
				listaAux.addAll(calcularSucesion(n));
				return listaAux;
			}
		}else {
			listaAux.add(n);
			return listaAux;
		}
	}
	
	public static void invertirArrayList(ArrayList<Integer> lista) {
		int indiceUltimo = lista.indexOf(lista.getLast());
		int aux;
		for(int i = 0; i < (lista.size()/2); i++) {
			aux = lista.get(i);
			lista.set(i, lista.get(indiceUltimo-i));
			lista.set(indiceUltimo-i, aux);
		}
	}
	
	public static int sumarLinkedList(LinkedList<Integer> lista) {
		if(lista.isEmpty()){
			return 0;
		}else {
			return lista.poll() + sumarLinkedList(lista);
		}
	}
	
	public static void main(String[] args) {
		/*List<Integer> list = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		int numLeido = s.nextInt();
		while(numLeido != 0) {
			list.add(numLeido);
			numLeido = s.nextInt();
		}
		
		System.out.println("Imprimiendo lista");
		for(int num : list){
			System.out.print("-" + num);		
		}
		
		Iterator<Integer> iterador = list.iterator();
		System.out.print("Lista: ");
		while(iterador.hasNext()) {
			System.out.print(iterador.next() + " ");
		}
		s.close();*/
		
		//incisoD();
		
//		ArrayList<Integer> secuencia1 = new ArrayList<Integer>();
//		secuencia1.add(4);
//		secuencia1.add(5);
//		secuencia1.add(6);
//		secuencia1.add(5);
//		secuencia1.add(4);
//				
//		System.out.println(esCapicua(secuencia1));
		
//		for(Integer n : calcularSucesion(6)) {
//			System.out.print(n + " ");
//		}
		
//		ArrayList<Integer> lista1 = new ArrayList<Integer>();
//		lista1.add(1);
//		lista1.add(2);
//		lista1.add(3);
//		lista1.add(4);
//		for(Integer n : lista1) {
//			System.out.print(n + " ");
//		}
//		invertirArrayList(lista1);
//		System.out.println();
//		for(Integer n : lista1) {
//			System.out.print(n + " ");
//		}
		
		LinkedList<Integer> lis = new LinkedList<Integer>();
		lis.add(25);
		lis.add(50);
		lis.add(15);
		System.out.print(sumarLinkedList(lis));
	}
}
