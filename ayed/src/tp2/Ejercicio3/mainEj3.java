package tp2.Ejercicio3;

import java.util.List;

public class mainEj3 {

	public static void main(String[] args) {
		ContadorArbol Cont = new ContadorArbol();
		List<Integer> lis = Cont.numerosPares();
		for(Integer n: lis) {
			System.out.println(n);
		}
	}
}
