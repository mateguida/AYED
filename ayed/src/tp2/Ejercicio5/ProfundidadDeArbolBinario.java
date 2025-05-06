package tp2.Ejercicio5;

import tp1.ejercicio8.Queue;
import tp2.ejercicio1.BinaryTree;

public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> arbolito;

	public BinaryTree<Integer> getArbol(){
		return arbolito;
	}
	
	public void setArbol(BinaryTree<Integer> a) {
		this.arbolito = a;
	}
	
	public int sumaElementosProfundidad(int prof) {
		int suma = 0;
		int contadorNivel = 1;
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		BinaryTree<Integer> elemActual;
		cola.enqueue(this.getArbol());
		cola.enqueue(null);
		while(!cola.isEmpty()) {
			elemActual = cola.dequeue();
			if(elemActual != null) {
				if(contadorNivel == prof) {
					suma += elemActual.getData();
				} 
				if(elemActual.hasLeftChild()) {
					cola.enqueue(elemActual.getLeftChild());
				}
				if(elemActual.hasRightChild()) {
					cola.enqueue(elemActual.getRightChild());
				}
			}else if(!cola.isEmpty()) {
				contadorNivel++;
				cola.enqueue(null);
			}
		}
		return suma;
	}
}
