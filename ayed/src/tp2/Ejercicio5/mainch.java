package tp2.Ejercicio5;

import tp2.ejercicio1.BinaryTree;

public class mainch {

	public static void main(String[] args) {
		BinaryTree<Integer> nodo1 = new BinaryTree<Integer>(10);
		nodo1.addLeftChild(new BinaryTree<Integer>(2));
		nodo1.addRightChild(new BinaryTree<Integer>(3));
		nodo1.getLeftChild().addLeftChild(new BinaryTree<Integer>(5));
		nodo1.getLeftChild().addRightChild(new BinaryTree<Integer>(4));
		nodo1.getRightChild().addLeftChild(new BinaryTree<Integer>(9));
		nodo1.getRightChild().addRightChild(new BinaryTree<Integer>(8));
		nodo1.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(7));
		nodo1.getLeftChild().getLeftChild().addRightChild(new BinaryTree<Integer>(8));
		nodo1.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(5));
		nodo1.getLeftChild().getRightChild().addRightChild(new BinaryTree<Integer>(6));
		nodo1.getRightChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(12));
		nodo1.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(8));
		nodo1.getRightChild().getRightChild().addLeftChild(new BinaryTree<Integer>(2));
		nodo1.getRightChild().getRightChild().addRightChild(new BinaryTree<Integer>(1));
		
		ProfundidadDeArbolBinario p = new ProfundidadDeArbolBinario();
		p.setArbol(nodo1);
		System.out.println(p.sumaElementosProfundidad(4));
	}
}
