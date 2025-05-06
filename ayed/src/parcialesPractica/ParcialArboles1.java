package parcialesPractica;

import java.util.LinkedList;

import tp1.ejercicio8.Queue;
import tp3.Ejercicio1.GeneralTree;

public class ParcialArboles1 {
	private GeneralTree<Integer> arbol;

	public void setArbol(GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public LinkedList<Integer> nivel(int num){
		return recorrerNiveles(num, this.arbol);
	}
	
	private LinkedList<Integer> recorrerNiveles(int num, GeneralTree<Integer> nodo){
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		LinkedList<Integer> listaProvisional = new LinkedList<Integer>();
		LinkedList<Integer> listaRetorno = new LinkedList<Integer>();
		GeneralTree<Integer> nodoDesencolado = new GeneralTree<Integer>();
		boolean condicion = true;
		//Encolo arbol entero
		cola.enqueue(nodo);
		cola.enqueue(null);
		while(!cola.isEmpty()) {//Mientras la cola este vacia proceso los nodos
			nodoDesencolado = cola.dequeue(); //Desencolo nodo
			if(nodoDesencolado != null) { // Si no es null, es nodo y lo proceso.
				if(condicion) {
					listaProvisional.add(nodoDesencolado.getData());
					condicion = condicion & (nodoDesencolado.getChildren().size() >= num); //Comparo si se cumple la condicion entre los nodos del nivel
				}
				if(nodoDesencolado.hasChildren()) {//Si tiene hijos el nodo desencolado, los encolo
					for(GeneralTree<Integer> hijo : nodoDesencolado.getChildren()) {
						cola.enqueue(hijo);
					}
				}
			} else if(!cola.isEmpty()) {//Si es null el nodo desencolado
				if(condicion) { //Si se recorrio el nivel y el & de condicion es todo true, recuerdo la lista
					return listaProvisional;
				}else { //Si en algun momento dio false, se pone en true para el siguiente nivel, y se limpia la lista donde guardaremos nodos
					condicion = true;
					listaProvisional.clear();
				}
				cola.enqueue(null); //Marca de nivel
			}
		}
		return listaRetorno;
	}
	
	public static void main(String[] args) {
		GeneralTree<Integer> arbol = new GeneralTree<Integer>(10);
		arbol.addChild(new GeneralTree<Integer>(8));
		arbol.addChild(new GeneralTree<Integer>(-5));
		arbol.getChildren().get(0).addChild(new GeneralTree<Integer>(5));
		arbol.getChildren().get(0).addChild(new GeneralTree<Integer>(22));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer>(19));
		arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<Integer>(-6));
		arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<Integer>(2));
		arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<Integer>(8));
		arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<Integer>(28));
		arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<Integer>(55));
		arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<Integer>(18));
		arbol.getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<Integer>(4));
		arbol.getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<Integer>(2));
		arbol.getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<Integer>(8));
		ParcialArboles1 e = new ParcialArboles1();
		e.setArbol(arbol);
		for(Integer n : e.nivel(3)) {
			System.out.print(n + ", ");
		}
	}

}
