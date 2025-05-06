package tp2.Ejercicio7;

import tp2.ejercicio1.BinaryTree;

public class gpt {
	private BinaryTree<Integer> tree;

    public gpt(BinaryTree<Integer> tree) {
        this.tree = tree;
    }

    public boolean isLeftTree(int num) {
        BinaryTree<Integer> nodo = buscarNodo(tree, num);
        if (nodo == null) return false;

        int izquierda = contarUnicoHijo(nodo.getLeftChild());
        int derecha = contarUnicoHijo(nodo.getRightChild());

        return izquierda > derecha;
    }

    private BinaryTree<Integer> buscarNodo(BinaryTree<Integer> arbol, int num) {
        if (arbol == null || arbol.isEmpty()) return null;

        if (arbol.getData() == num) return arbol;

        BinaryTree<Integer> izq = buscarNodo(arbol.getLeftChild(), num);
        if (izq != null) return izq;

        return buscarNodo(arbol.getRightChild(), num);
    }

    private int contarUnicoHijo(BinaryTree<Integer> arbol) {
        if (arbol == null) return -1;

        int count = 0;
        boolean tieneIzq = arbol.hasLeftChild();
        boolean tieneDer = arbol.hasRightChild();

        if ((tieneIzq && !tieneDer) || (!tieneIzq && tieneDer)) {
            count = 1;
        }

        int izquierdo = contarUnicoHijo(arbol.getLeftChild());
        int derecho = contarUnicoHijo(arbol.getRightChild());

        return count + (izquierdo == -1 ? 0 : izquierdo) + (derecho == -1 ? 0 : derecho);
    }
}
