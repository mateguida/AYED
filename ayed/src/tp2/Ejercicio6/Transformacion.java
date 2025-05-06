package tp2.Ejercicio6;

import tp2.ejercicio1.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> arbolInstancia;

	public BinaryTree<Integer> getArbolInstancia() {
		return arbolInstancia;
	}

	public void setArbolInstancia(BinaryTree<Integer> arbolInstancia) {
		this.arbolInstancia = arbolInstancia;
	}
	
	public BinaryTree<Integer> suma(){
		return sumaHelper(this.getArbolInstancia());
	}
	
	private BinaryTree<Integer> sumaHelper(BinaryTree<Integer> arbol){
		BinaryTree<Integer> arbolRetorno = new BinaryTree<Integer>();
		if(arbol.isLeaf()) {
			arbolRetorno.setData(arbol.getData());
			arbol.setData(0);
			return arbolRetorno;
		}
		if(arbol.hasLeftChild()) {
			if(arbol.hasRightChild()) {
				arbolRetorno.setData(arbol.getData());
				arbol.setData(sumaHelper(arbol.getLeftChild()).getData() + sumaHelper(arbol.getRightChild()).getData());
				arbolRetorno.setData(arbol.getData() + arbolRetorno.getData());
				arbolRetorno.addLeftChild(arbol.getLeftChild());
				arbolRetorno.addRightChild(arbol.getRightChild());
				return arbolRetorno;
			}else {
				arbolRetorno.setData(arbol.getData());
				arbol.setData(sumaHelper(arbol.getLeftChild()).getData());
				arbolRetorno.setData(arbolRetorno.getData() + arbol.getData());
				arbolRetorno.addLeftChild(arbol);
				return arbolRetorno;
			}
		}else if(arbol.hasRightChild()){
			arbolRetorno.setData(arbol.getData());
			arbol.setData(sumaHelper(arbol.getRightChild()).getData());
			arbolRetorno.setData(arbolRetorno.getData() + arbol.getData());
			arbolRetorno.addRightChild(arbol);
			return arbolRetorno;
		}else {
			return null;
		}
	}
}
