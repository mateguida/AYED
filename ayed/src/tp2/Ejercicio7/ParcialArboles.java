package tp2.Ejercicio7;

import tp2.ejercicio1.BinaryTree;

public class ParcialArboles {
	private BinaryTree<Integer> arbol;
	
	public BinaryTree<Integer> getArbol() {
		return arbol;
	}

	public void setArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public boolean isLeftTree (int num) {
		BinaryTree<Integer> nodoEncontrado = buscarNodo(this.getArbol(), num);
		if(nodoEncontrado == null) {
			return false;
		}else {
			if(arbol.hasLeftChild()) {
				if(arbol.hasRightChild()) {
					return (contarHijosUnicos(arbol.getLeftChild()) > contarHijosUnicos(arbol.getRightChild()));
				}else {
					return (contarHijosUnicos(arbol.getLeftChild()) > -1);
				}
			}else if(arbol.hasRightChild()) {
				return (-1 > contarHijosUnicos(arbol.getRightChild()));
			}else {
				return false;
			}
		}
	}
	
	private BinaryTree<Integer> buscarNodo(BinaryTree<Integer> arbol, int num) {
        if (arbol == null || arbol.isEmpty()) return null;

        if (arbol.getData() == num) return arbol;

        BinaryTree<Integer> izq = buscarNodo(arbol.getLeftChild(), num);
        if (izq != null) return izq;

        return buscarNodo(arbol.getRightChild(), num);
    }
	
	private int contarHijosUnicos(BinaryTree<Integer> nodo) {
		if(nodo.hasLeftChild() & nodo.hasRightChild()) {
			return (contarHijosUnicos(nodo.getLeftChild()) + contarHijosUnicos(nodo.getRightChild()));
		}else if(nodo.hasLeftChild() | nodo.hasRightChild()){
			return 1;
		}else {
			return 0;
		}
	}
}
