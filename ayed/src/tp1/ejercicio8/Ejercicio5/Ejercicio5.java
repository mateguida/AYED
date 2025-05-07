package tp1.Ejercicio5;

public class Ejercicio5 {
	public static int[] calcularValores(int[] vec) {
		int max = -1;
		int min = 99999;
		int cont = 0;
		int acum = 0;
		for(int i = 0; i < vec.length; i++) {
			if(vec[i] < min) {
				min = vec[i];
			}
			if(vec[i] > max) {
				max = vec[i];
			}
			acum += vec[i];
			cont++;
		}
		int prom = 0;
		if(cont != 0) {
			prom = acum/cont;
		}else {
			prom = 0;
		}
		int[] vecAux = {max, min, prom};
		return vecAux;
	}
	
	public static void calcularValoresObjeto(calculoVector c, int[] vec) {
		int acum = 0;
		int cont = 0;
		for(int i = 0; i < vec.length; i++) {
			if(vec[i] < c.getMin()) {
				c.setMin(vec[i]);
			}
			if(vec[i] > c.getMax()) {
				c.setMax(vec[i]);;
			}
			acum += vec[i];
			cont++;
		}
		if(cont != 0) {
			c.setProm(acum/cont);
		}else {
			c.setProm(0);
		}
	}
	
	public static void main(String[] args) {
		
		//Con return
		//int[] vector1 = {10,9,8};
		//int[] vectorResultante = calcularValores(vector1);
		//System.out.print("Maximo = " + vectorResultante[0] + ", Minimo = " + vectorResultante[1] + ", Promedio = " + vectorResultante[2]);;
 	
		//Con objeto
		int[] vector2 = {10, 8 , 9};
		calculoVector objResultado = new calculoVector();
		calcularValoresObjeto(objResultado, vector2);
		System.out.println("Maximo = " + objResultado.getMax() + ", Minimo = " + objResultado.getMin() + ", Promedio = " + objResultado.getProm());
	
		//Sin parametros ni return
	}
}
