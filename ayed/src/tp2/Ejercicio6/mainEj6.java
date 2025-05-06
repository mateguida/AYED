package tp2.Ejercicio6;

import tp2.ejercicio1.BinaryTree;

public class mainEj6 {

	public static void main(String[] args) {
		Transformacion t = new Transformacion();
		BinaryTree<Integer> arbol = new BinaryTree<Integer>();
		arbol.setData(1);
		arbol.addLeftChild(new BinaryTree<Integer>(2));
		arbol.addRightChild(new BinaryTree<Integer>(3));
		arbol.getLeftChild().addRightChild(new BinaryTree<Integer>(4));
		arbol.getRightChild().addRightChild(new BinaryTree<Integer>(6));
		arbol.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
		arbol.getRightChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(7));
		arbol.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(8));
		t.setArbolInstancia(arbol);
		
		BinaryTree<Integer> arbolImprmir = t.suma();
		arbolImprmir.entreNiveles(1, 4);
	}

}
