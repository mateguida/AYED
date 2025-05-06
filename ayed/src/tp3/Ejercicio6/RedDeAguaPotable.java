package tp3.Ejercicio6;

import tp3.Ejercicio1.GeneralTree;

public class RedDeAguaPotable {
	private GeneralTree<Character> arbol;
	
	public void setArbol(GeneralTree<Character> a) {
		this.arbol = a;
	}
	
	public double minimoCaudal(double caudal) {
		return calcularCaudal(caudal, arbol);
	}
	
	private double calcularCaudal(double caudalRecibido, GeneralTree<Character> nodo) {
		if(nodo.isLeaf()) return caudalRecibido;
		double retorno = 9999;
		double caudalAEnviar = (double)caudalRecibido/nodo.getChildren().size();
		for(GeneralTree<Character> hijo : nodo.getChildren()) {
			if(calcularCaudal(caudalAEnviar, hijo) < retorno) {
				retorno = calcularCaudal(caudalAEnviar, hijo);
			}
		}
		return retorno;
	}
	
	public static void main(String[] args) {
		GeneralTree<Character> arbolPrueba = new GeneralTree<Character>('A');
		arbolPrueba.addChild(new GeneralTree<Character>('B'));
		arbolPrueba.addChild(new GeneralTree<Character>('C'));
		arbolPrueba.addChild(new GeneralTree<Character>('D'));
		arbolPrueba.addChild(new GeneralTree<Character>('E'));
		arbolPrueba.getChildren().get(1).addChild(new GeneralTree<Character>('F'));
		arbolPrueba.getChildren().get(1).addChild(new GeneralTree<Character>('G'));
		arbolPrueba.getChildren().get(1).getChildren().get(1).addChild(new GeneralTree<Character>('L'));;
		arbolPrueba.getChildren().get(2).addChild(new GeneralTree<Character>('H'));
		arbolPrueba.getChildren().get(2).addChild(new GeneralTree<Character>('I'));
		arbolPrueba.getChildren().get(2).addChild(new GeneralTree<Character>('J'));
		arbolPrueba.getChildren().get(2).addChild(new GeneralTree<Character>('K'));
		arbolPrueba.getChildren().get(2).addChild(new GeneralTree<Character>('P'));
		arbolPrueba.getChildren().get(2).getChildren().get(2).addChild(new GeneralTree<Character>('M'));;
		arbolPrueba.getChildren().get(2).getChildren().get(2).addChild(new GeneralTree<Character>('N'));;
		
		RedDeAguaPotable p = new RedDeAguaPotable();
		System.out.println(p.calcularCaudal(1000, arbolPrueba));
	}
}
