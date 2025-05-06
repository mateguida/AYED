package tp3.Ejercicio1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp1.ejercicio8.Queue;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	
	//Ejercicio 3 TP3
	public int altura() {	 
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		GeneralTree<T> aux = new GeneralTree<T>();
		int nivel = 0;
		cola.enqueue(this);
		while(!cola.isEmpty()) {
			aux = cola.dequeue();
			nivel++;
			for(GeneralTree<T> hijo : aux.getChildren()) {
				cola.enqueue(hijo);
			}
		}
		return nivel;
	}
	
	public int nivel(T dato){
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		GeneralTree<T> aux = new GeneralTree<T>();
		int nivel = 0;
		cola.enqueue(this);
		while(!cola.isEmpty()) {
			aux = cola.dequeue();
			nivel++;
			if(aux.getData() == dato) {
				return nivel;
			}
			for(GeneralTree<T> hijo : aux.getChildren()) {
				cola.enqueue(hijo);
			}
		}
		return -1;
	  }

	public int ancho(){
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		GeneralTree<T> aux = new GeneralTree<T>();
		int anchoActual;
		int nivelMasAncho = 0;
		cola.enqueue(this);
		while(!cola.isEmpty()) {
			aux = cola.dequeue();
			anchoActual = 0;
			for(GeneralTree<T> hijo : aux.getChildren()) {
				cola.enqueue(hijo);
				anchoActual++;
			}
			if(anchoActual > nivelMasAncho) {
				nivelMasAncho = anchoActual;
			}
		}
		return nivelMasAncho;
	}
	
	public GeneralTree<T> buscar(GeneralTree<T> arbol, T a){
		GeneralTree<T> aux = null;
		if(arbol != null) {
			if(arbol.getData().equals(a)) {
				aux = arbol;
				return aux;
			}
			
			List<GeneralTree<T>> hijos = arbol.getChildren();
			Iterator<GeneralTree<T>> it = hijos.iterator();
			while(aux == null && it.hasNext()) {
				aux = buscar(it.next(), a);
			}
			
			return aux;
		}else return aux;
	}
	
	//Ejercicio 5 TP3
	public boolean esAncestro(T a, T b) {
		GeneralTree<T> inicio = buscar(this, a);
		if(inicio == null) {
			return false;
		}else {
			GeneralTree<T> nodoAux = buscar(inicio, b);
			if(nodoAux == null){
				return false;
			}else {
				return true;
			}
		}
	}
}