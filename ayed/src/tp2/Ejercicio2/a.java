package tp2.Ejercicio2;
import tp2.ejercicio1.BinaryTree;

public class a {

	public static void main(String[] args) {
		BinaryTree<Integer> nodo1 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo2 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo3 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo4 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo5 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo6 = new BinaryTree<Integer>();
		nodo1.setData(1);
		nodo2.setData(2);
		nodo3.setData(3);
		nodo4.setData(4);
		nodo5.setData(5);
		nodo6.setData(6);
		nodo2.addLeftChild(nodo4);
		nodo2.addRightChild(nodo5);
		nodo3.addLeftChild(nodo6);
		nodo1.addLeftChild(nodo2);
		nodo1.addRightChild(nodo3);

		System.out.println(nodo1.contarHojas());
		System.out.println();
		nodo1.entreNiveles(1, 3);
		System.out.println();
		nodo1.espejo().entreNiveles(1, 3);
	}
}
