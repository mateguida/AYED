package tp3.Ejercicio11;

import java.util.Iterator;

import tp1.ejercicio8.Queue;
import tp3.Ejercicio1.GeneralTree;

public class ParcialArboles11 {
	public static boolean resolver(GeneralTree<Integer> arbol) {
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		GeneralTree<Integer> nodoActual = new GeneralTree<Integer>();
		Iterator<GeneralTree<Integer>> it;
		boolean cumple = true;
		int contadorNivel = 0;
		int contadorNivelAnterior = 1;
		cola.enqueue(arbol);
		cola.enqueue(null);
		while(!cola.isEmpty()) {
			nodoActual = cola.dequeue();
			if(nodoActual != null) {
				it = nodoActual.getChildren().iterator();
				while(it.hasNext()) {
					cola.enqueue(it.next());
					contadorNivel++;
				}
			}else if (!cola.isEmpty()) {
				System.out.println("Nivel anterior = " + contadorNivelAnterior + "  Nivel Actual = " + contadorNivel);
				cumple = cumple & (contadorNivel == (contadorNivelAnterior+1));
				contadorNivelAnterior = contadorNivel;
				contadorNivel = 0;
				cola.enqueue(null);
			}
		}
		return cumple;
	}
}
