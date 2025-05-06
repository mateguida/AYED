package tp2.Ejercicio7;

import tp2.ejercicio1.BinaryTree;

public class mainEJ7 {

	public static void main(String[] args) {
		
		BinaryTree<Integer> raiz = new BinaryTree<Integer>(2);
		raiz.addLeftChild(new BinaryTree<Integer>(7));
		raiz.addRightChild(new BinaryTree<Integer>(-5));
		raiz.getLeftChild().addLeftChild(new BinaryTree<Integer>(23));
		raiz.getLeftChild().addRightChild(new BinaryTree<Integer>(6));
		raiz.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(-3));
		raiz.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(55));
		raiz.getLeftChild().getRightChild().addRightChild(new BinaryTree<Integer>(11));
		raiz.getRightChild().addLeftChild(new BinaryTree<Integer>(19));
		raiz.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(4));
		raiz.getRightChild().getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(18));
		gpt ab = new gpt(raiz);
		System.out.println(ab.isLeftTree(-5));
	}
}
