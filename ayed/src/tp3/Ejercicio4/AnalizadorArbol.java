package tp3.Ejercicio4;

import tp1.ejercicio8.Queue;
import tp3.Ejercicio1.GeneralTree;

public class AnalizadorArbol {
	public static double devolverMaximoPromedio(GeneralTree<AreaEmpresa> arbol) {
		Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
		GeneralTree<AreaEmpresa> aux = new GeneralTree<AreaEmpresa>();
		cola.enqueue(arbol);
		cola.enqueue(null);
		double mayorPromedio = 0;
		int contadorNodos = 0, acumulador = 0;
		while(!cola.isEmpty()) {
			aux = cola.dequeue();
			if(aux != null) {
				acumulador += aux.getData().getTardanza();
				contadorNodos++;
				for(GeneralTree<AreaEmpresa> hijo : aux.getChildren()) {
					cola.enqueue(hijo);
				}
			}else if(!cola.isEmpty()){
				if((double)acumulador/contadorNodos > mayorPromedio) {
					mayorPromedio = (double)acumulador/contadorNodos;
				}
				acumulador = 0;
				contadorNodos = 0;
				cola.enqueue(null);
			}
		}
		return mayorPromedio;
	}
	
	public static void main(String[] args) {
		GeneralTree<AreaEmpresa> raiz = new GeneralTree<AreaEmpresa>(new AreaEmpresa("M", 14));
		raiz.addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("J", 13)));
		raiz.addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("K", 25)));
		raiz.addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("L", 10)));
		raiz.getChildren().get(0).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("A", 4)));
		raiz.getChildren().get(0).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("B", 7)));
		raiz.getChildren().get(0).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("C", 5)));
		raiz.getChildren().get(1).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("D", 6)));
		raiz.getChildren().get(1).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("E", 10)));
		raiz.getChildren().get(1).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("F", 18)));
		raiz.getChildren().get(2).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("G", 9)));
		raiz.getChildren().get(2).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("H", 12)));
		raiz.getChildren().get(2).addChild(new GeneralTree<AreaEmpresa>(new AreaEmpresa("I", 19)));
		
		AreaEmpresa a1 = new AreaEmpresa("K", 25);
		AreaEmpresa a2 = new AreaEmpresa("E", 10);
		
		System.out.println(raiz.esAncestro(a1, a2));
		//System.out.println(devolverMaximoPromedio(raiz));
	}
}
