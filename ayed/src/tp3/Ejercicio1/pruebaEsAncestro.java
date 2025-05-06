package tp3.Ejercicio1;

public class pruebaEsAncestro {

	public static void main(String[] args) {
		GeneralTree<Integer> arbol = new GeneralTree<Integer>(6);
		arbol.addChild(new GeneralTree<Integer>(12));
		arbol.addChild(new GeneralTree<Integer>(30));
		arbol.addChild(new GeneralTree<Integer>(2));
		arbol.getChildren().get(0).addChild(new GeneralTree<Integer>(8));
		arbol.getChildren().get(0).addChild(new GeneralTree<Integer>(22));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer>(35));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer>(100));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer>(91));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer>(88));
		arbol.getChildren().get(2).addChild(new GeneralTree<Integer>(10));
		arbol.getChildren().get(2).addChild(new GeneralTree<Integer>(62));
		
		System.out.println(arbol.esAncestro(6, 8));
	}

}
