package tp2.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

import tp2.ejercicio1.BinaryTree;

public class ContadorArbol {
	private BinaryTree<Integer> arbol;

	public ContadorArbol() {
		this.arbol = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo2 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo3 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo4 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo5 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo6 = new BinaryTree<Integer>();
		this.arbol.setData(1);
		nodo2.setData(2);
		nodo3.setData(3);
		nodo4.setData(4);
		nodo5.setData(5);
		nodo6.setData(6);
		nodo2.addLeftChild(nodo4);
		nodo2.addRightChild(nodo5);
		nodo3.addLeftChild(nodo6);
		this.arbol.addLeftChild(nodo2);
		this.arbol.addRightChild(nodo3);
	}
	
	public BinaryTree<Integer> getArbol() {
		return arbol;
	}
	
	public List<Integer> numerosPares(){
		//InOrden
		//return inOrden(this.getArbol());
		return posOrden(this.getArbol());
	}
	
	public List<Integer> inOrden(BinaryTree<Integer> ab){
		ArrayList<Integer> listaRetorno = new ArrayList<Integer>();
		if(ab.hasLeftChild()) {
			listaRetorno.addAll(this.inOrden(ab.getLeftChild()));
		}
		if(ab.getData()%2 == 0) {
			listaRetorno.add(ab.getData());
		}
		if(ab.hasRightChild()) {
			listaRetorno.addAll(this.inOrden(ab.getRightChild()));
		}
		return listaRetorno;
	}
	
	public List<Integer> posOrden(BinaryTree<Integer> ab){
		ArrayList<Integer> listaRetorno = new ArrayList<Integer>();
		if(ab.hasLeftChild()) {
			listaRetorno.addAll(this.posOrden(ab.getLeftChild()));
		}
		if(ab.hasRightChild()) {
			listaRetorno.addAll(this.posOrden(ab.getRightChild()));
		}
		if(ab.getData()%2 == 0) {
			listaRetorno.add(ab.getData());
		}
		return listaRetorno;
	}
}
