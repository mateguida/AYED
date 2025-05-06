package tp3.Ejercicio8;

import tp3.Ejercicio1.GeneralTree;

public class Navidad {
	private GeneralTree<Integer> arbol;
	
	public void setArbol(GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public String esAbetoNavidenio() {
		if(abetoRecursivo(this.arbol)) {
			return "Yes";
		}else {
			return "No";
		}
	}

	private boolean abetoRecursivo(GeneralTree<Integer> nodo) {
		boolean retorno = true;
		int contadorHojas = 0;
		for(GeneralTree<Integer> hijo : nodo.getChildren()) {
			if(hijo.isLeaf()) {
				contadorHojas++;
			}else {
				retorno = retorno & abetoRecursivo(hijo);
			}
		}
		if((contadorHojas >= 3) & retorno) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Navidad n = new Navidad();
		GeneralTree<Integer> arbol = new GeneralTree<Integer>(1);
		arbol.addChild(new GeneralTree<Integer>(2));
		arbol.addChild(new GeneralTree<Integer>(3));
		arbol.addChild(new GeneralTree<Integer>(4));
		arbol.addChild(new GeneralTree<Integer>(5));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer>(6));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer>(7));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer>(8));
		n.setArbol(arbol);
		System.out.println(n.esAbetoNavidenio());
	}

}
