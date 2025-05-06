package tp3.Ejercicio9;

import tp2.ejercicio1.BinaryTree;

public class prueba {

	public static void mezclaRecorridos(BinaryTree<Character> a) {
    	if(!a.isEmpty()) {
    		System.out.print(a.getData() + " ");
    		if(a.hasLeftChild()) {
    			mezclaRecorridos(a.getLeftChild());
    		}
    		if(a.hasRightChild()) {
    			mezclaRecorridos(a.getRightChild());
    		}
    		System.out.print(a.getData() + " ");
    	}
    }
	
	public static void main(String[] args) {
		BinaryTree<Character> arbol = new BinaryTree<Character>('C');
		arbol.addLeftChild(new BinaryTree<Character>('A'));
		arbol.addRightChild(new BinaryTree<Character>('E'));
		arbol.getLeftChild().addRightChild(new BinaryTree<Character>('B'));
		arbol.getRightChild().addLeftChild(new BinaryTree<Character>('D'));
		arbol.getRightChild().addRightChild(new BinaryTree<Character>('F'));
		mezclaRecorridos(arbol);
	}
}
