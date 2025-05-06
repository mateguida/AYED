package tp3.Ejercicio11;

import tp3.Ejercicio1.GeneralTree;

public class mainEj11 {

	public static void main(String[] args) {
		GeneralTree<Integer> ar = new GeneralTree<Integer>(2);
		//Nivel 1
		ar.addChild(new GeneralTree<Integer>(1));
		ar.addChild(new GeneralTree<Integer>(25));
		//Nivel 2
		ar.getChildren().get(0).addChild(new GeneralTree<Integer>(5));
		ar.getChildren().get(0).addChild(new GeneralTree<Integer>(4));
		ar.getChildren().get(1).addChild(new GeneralTree<Integer>(13));
		//Nivel 3
		ar.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<Integer>(18));
		ar.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<Integer>(7));
		ar.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<Integer>(11));
		ar.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<Integer>(3));
		//Nivel 4
		ar.getChildren().get(0).getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<Integer>(83));
		ar.getChildren().get(0).getChildren().get(1).getChildren().get(2).addChild(new GeneralTree<Integer>(33));
		ar.getChildren().get(0).getChildren().get(1).getChildren().get(2).addChild(new GeneralTree<Integer>(12));
		ar.getChildren().get(0).getChildren().get(1).getChildren().get(2).addChild(new GeneralTree<Integer>(17));
		ar.getChildren().get(0).getChildren().get(1).getChildren().get(2).addChild(new GeneralTree<Integer>(9));
		
		System.out.println(ParcialArboles11.resolver(ar));
	}
}
