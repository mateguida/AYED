package tp2.Ejercicio4;
import tp2.ejercicio1.BinaryTree;

public class redBinariaLlena {
	
	public static int retardoReenvio(BinaryTree<Integer> arbolRetardos) {
		if(arbolRetardos.isLeaf()) {
			return arbolRetardos.getData();
		}else {
			if((arbolRetardos.getData() + arbolRetardos.getLeftChild().getData()) > (arbolRetardos.getData() + arbolRetardos.getRightChild().getData())) {
				return (arbolRetardos.getData() + retardoReenvio(arbolRetardos.getLeftChild()));
			}else if((arbolRetardos.getData() + arbolRetardos.getLeftChild().getData()) < (arbolRetardos.getData() + arbolRetardos.getRightChild().getData())) {
				return (arbolRetardos.getData() + retardoReenvio(arbolRetardos.getRightChild()));
			}else {
				return 0;
			}
		}
	}
	
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
		
		System.out.println((retardoReenvio(nodo1)));
	}
}
