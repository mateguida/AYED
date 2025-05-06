package tp3.Ejercicio9;

import tp3.Ejercicio1.GeneralTree;

public class ParcialArboles {
	
	
	public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
		boolean hijos = true;
		int hijoMin = 9999;
		for(GeneralTree<Integer> hijo : arbol.getChildren()) {
			if(hijo.getData() < hijoMin) {
				hijoMin = hijo.getData();
			}
			if(!hijo.isLeaf()) {
				hijos = hijos & esDeSeleccion(hijo);
			}
		}
		if((arbol.getData() == hijoMin) & (hijos)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		GeneralTree<Integer> arbol = new GeneralTree<Integer>(12);
		arbol.addChild(new GeneralTree<Integer>(12));
		arbol.addChild(new GeneralTree<Integer>(25));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer>(25));
		arbol.getChildren().get(0).addChild(new GeneralTree<Integer>(35));
		arbol.getChildren().get(0).addChild(new GeneralTree<Integer>(12));
		arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<Integer>(35));
		arbol.getChildren().get(0).getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<Integer>(35));
		arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<Integer>(14));
		arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<Integer>(12));
		arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<Integer>(33));
		arbol.getChildren().get(0).getChildren().get(1).getChildren().get(2).addChild(new GeneralTree<Integer>(35));
		arbol.getChildren().get(0).getChildren().get(1).getChildren().get(2).addChild(new GeneralTree<Integer>(83));
		arbol.getChildren().get(0).getChildren().get(1).getChildren().get(2).addChild(new GeneralTree<Integer>(90));
		arbol.getChildren().get(0).getChildren().get(1).getChildren().get(2).addChild(new GeneralTree<Integer>(33));
		
		System.out.println(ParcialArboles.esDeSeleccion(arbol));
	}
}
