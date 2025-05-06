package tp3.Ejercicio7;

import java.util.LinkedList;
import java.util.List;

import tp3.Ejercicio1.GeneralTree;

public class Caminos {
	private GeneralTree<Integer> arbolito;
	
	public void setArbol(GeneralTree<Integer> a) {
		this.arbolito = a;
	}
	
	public List<Integer> caminoAHojaMasLejana(){
		return recorrerArbol(arbolito);
	}
	
	private LinkedList<Integer> recorrerArbol(GeneralTree<Integer> nodo){
		LinkedList<Integer> listaRetorno = new LinkedList<Integer>();
		LinkedList<Integer> listaAux = new LinkedList<Integer>();
		LinkedList<Integer> listahijo = new LinkedList<Integer>();
		int max = -1;
		listaRetorno.add(nodo.getData());
		for(GeneralTree<Integer> hijo : nodo.getChildren()) {
			listahijo = recorrerArbol(hijo);
			if(listahijo.size() > max){
				max = listahijo.size();
				listaAux = listahijo;
			}
		}
		listaRetorno.addAll(listaAux);
		return listaRetorno;
	}
	
	public static void main(String[] args){
		GeneralTree<Integer> ar = new GeneralTree<Integer>(12);
		ar.addChild(new GeneralTree<Integer>(17));
		ar.addChild(new GeneralTree<Integer>(9));
		ar.addChild(new GeneralTree<Integer>(15));
		ar.getChildren().get(0).addChild(new GeneralTree<Integer>(10));
		ar.getChildren().get(0).addChild(new GeneralTree<Integer>(6));
		ar.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<Integer>(1));
		ar.getChildren().get(1).addChild(new GeneralTree<Integer>(8));
		ar.getChildren().get(2).addChild(new GeneralTree<Integer>(14));
		ar.getChildren().get(2).addChild(new GeneralTree<Integer>(18));
		ar.getChildren().get(2).getChildren().get(0).addChild(new GeneralTree<Integer>(16));
		ar.getChildren().get(2).getChildren().get(0).addChild(new GeneralTree<Integer>(7));
		
		Caminos c = new Caminos();
		c.setArbol(ar);
		for(Integer n : c.caminoAHojaMasLejana()) {
			System.out.print(n + " ");
		}
	}
}

