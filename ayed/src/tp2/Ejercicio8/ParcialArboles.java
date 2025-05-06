package tp2.Ejercicio8;

import tp2.ejercicio1.BinaryTree;

public class ParcialArboles {
	
	public boolean esPrefijo(BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
		return recorrerRecursivo(a1, a2);
	}
	
	private boolean recorrerRecursivo(BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
		boolean esPrefijo = true;
		
		if(a1.getData() != a2.getData()) esPrefijo = false;
		
		if(a1.hasLeftChild()) {
			if(a2.hasLeftChild()) {
				esPrefijo = recorrerRecursivo(a1.getLeftChild(), a2.getLeftChild());
			}else {
				//El arbol 1 tiene un elemento que el arbol 2 no tiene, por ende no es prefijo
				esPrefijo = false;
			}
		}
		
		if(esPrefijo) {
			if(a1.hasRightChild()) {
				if(a2.hasRightChild()) {
					esPrefijo = recorrerRecursivo(a1.getRightChild(), a2.getRightChild());
				}else esPrefijo = false;
			}
		}
		return esPrefijo;
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> arbol1 = new BinaryTree<Integer>(65);
		arbol1.addLeftChild(new BinaryTree<Integer>(37));
		arbol1.addRightChild(new BinaryTree<Integer>(81));
		arbol1.getLeftChild().addRightChild(new BinaryTree<Integer>(47));
		arbol1.getRightChild().addRightChild(new BinaryTree<Integer>(93));
		
		BinaryTree<Integer> arbol2 = new BinaryTree<Integer>(65);
		arbol2.addLeftChild(new BinaryTree<Integer>(37));
		arbol2.getLeftChild().addRightChild(new BinaryTree<Integer>(47));
		arbol2.getLeftChild().addLeftChild(new BinaryTree<Integer>(22));
		arbol2.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(11));
		arbol2.getLeftChild().getLeftChild().addRightChild(new BinaryTree<Integer>(29));;
		arbol2.addRightChild(new BinaryTree<Integer>(81));
		arbol2.getRightChild().addLeftChild(new BinaryTree<Integer>(76));
		arbol2.getRightChild().addRightChild(new BinaryTree<Integer>(93));
		//arbol2.getRightChild().getRightChild().addLeftChild(new BinaryTree<Integer>(85));
		//arbol2.getRightChild().getRightChild().addRightChild(new BinaryTree<Integer>(94));
		
		ParcialArboles Aux = new ParcialArboles();
		System.out.println(Aux.esPrefijo(arbol1, arbol2));
		
	}
}
