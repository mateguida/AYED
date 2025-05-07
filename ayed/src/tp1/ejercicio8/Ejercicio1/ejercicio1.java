package tp1.Ejercicio1;

public class ejercicio1 {
	
	public static void imprimirFor(int a, int b){
		for(;a<=b; a++) {
			System.out.println(a);
		}
	}
	
	public static void imprimirWhile(int a, int b) {
		while(a<=b) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void imprimirRecursivo(int a, int b) {
		if(a<=b) {
			System.out.println(a);
			imprimirRecursivo(a+1, b);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Imprimiendo con for");
		imprimirFor(0,10);
		System.out.println("Imprimiendo con while");
		imprimirWhile(10, 20);
		System.out.println("Imprimiendo con recursion");
		imprimirRecursivo(50,100);
	}

}
