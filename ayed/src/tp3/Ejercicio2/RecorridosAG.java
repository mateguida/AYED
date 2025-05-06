package tp3.Ejercicio2;

import java.util.LinkedList;
import java.util.List;

import tp1.ejercicio8.Queue;
import tp3.Ejercicio1.GeneralTree;

public class RecorridosAG {
	
	 private static void preOrden(GeneralTree<Integer> a, Integer n, List<Integer> lista) {
		 if((a.getData()%2 != 0) && (a.getData()>n)) {
			 lista.add(a.getData());
		 }
		 for(GeneralTree<Integer> hijo : a.getChildren()) {
			 preOrden(hijo, n, lista);
		 }
	 }
	 
	 private static void inOrden(GeneralTree<Integer> a, Integer n, List<Integer> lista) {
		 inOrden(a.getChildren().getFirst(),n,lista);
		 if((a.getData()%2 != 0) && (a.getData()>n)) {
			 lista.add(a.getData());
		 }
		 for(GeneralTree<Integer> hijo : a.getChildren().subList(1, a.getChildren().size())) {
			 inOrden(hijo, n, lista);
		 }
	 }
	 
	 private static void postOrden(GeneralTree<Integer> a, Integer n, List<Integer> lista) {
		 for(GeneralTree<Integer> hijo : a.getChildren()) {
			 preOrden(hijo, n, lista);
		 }
		 if((a.getData()%2 != 0) && (a.getData()>n)) {
			 lista.add(a.getData());
		 }
	 }
	 
	 private static void porNiveles(GeneralTree<Integer> a, Integer n, List<Integer> lista) {
		 Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		 GeneralTree<Integer> aux = new GeneralTree<Integer>();
		 cola.enqueue(a);
		 while(!cola.isEmpty()) {
			 aux = cola.dequeue();
			 if((aux.getData()%2 != 0) && (aux.getData()>n)) {
				 lista.add(aux.getData());
			 }
			 for(GeneralTree<Integer> hijo : aux.getChildren()) {
				 cola.enqueue(hijo);
			 }
		 }
	 }
	
	 public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree<Integer> a, Integer n){
		 LinkedList<Integer> lis = new LinkedList<Integer>();
		 preOrden(a,n,lis);
		 return lis;
	 }

	 public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree<Integer> a, Integer n){
		 LinkedList<Integer> lis = new LinkedList<Integer>();
		 inOrden(a,n,lis);
		 return lis;
	 }
	 
	 public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree<Integer> a, Integer n){
		 LinkedList<Integer> lis = new LinkedList<Integer>();
		 postOrden(a,n,lis);
		 return lis;
	 }
	 
	 public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree<Integer> a, Integer n){
		 LinkedList<Integer> lis = new LinkedList<Integer>();
		 porNiveles(a,n,lis);
		 return lis;
	 }
}
