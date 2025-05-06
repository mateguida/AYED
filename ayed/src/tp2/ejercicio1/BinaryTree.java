package tp2.ejercicio1;
import tp1.ejercicio8.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public int contarHojas() {
		int contador = 1;
		if(this.hasLeftChild()) {
			contador += this.getLeftChild().contarHojas();
		}
		if(this.hasRightChild()) {
			contador += this.getRightChild().contarHojas();
		}
		return contador;
	}
		
		
    public BinaryTree<T> espejo(){
    	BinaryTree<T> retorno = this;
    	if(retorno.hasRightChild()) {
    		if(retorno.hasLeftChild()) {
    			//Si tiene los 2, hago el espejo de los hijos y despues el intercambio(der a izq y izq a der)
    			retorno.getLeftChild().espejo();
    			retorno.getRightChild().espejo();
    			BinaryTree<T> aux = retorno.getLeftChild();
    			retorno.addLeftChild(retorno.getRightChild());
    			retorno.addRightChild(aux);
    		}else {
    			//Si tiene hijo derecho pero no izquierdo, hago el espejo del hijo derecho(arbol) y luego paso el hijo derecho a izquierdo 
    			//y borro el derecho
    			retorno.getRightChild().espejo();
    			retorno.addLeftChild(retorno.getRightChild());
    			retorno.removeRightChild();
    		}
    	}else {
    		if(retorno.hasLeftChild()) {
    			//Si no tiene hijo derecho pero si tiene hijo izquierdo, hago el espejo del subarbol izquierdo, lo paso a hijo derecho
    			//y borro el hijo izquierdo que paso a la rama derecha
    			retorno.getLeftChild().espejo();
    			retorno.addRightChild(this.getLeftChild());
    			retorno.removeLeftChild();
    		}
    	}
    	return retorno;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		int contadorNivel = 1;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		BinaryTree<T> nodoDesencolado;
		cola.enqueue(this);
		cola.enqueue(null);
		while(!cola.isEmpty()) {
			nodoDesencolado= cola.dequeue();
			if(nodoDesencolado != null) {
				if((contadorNivel >=n) & (contadorNivel <= m)) {
					System.out.println(nodoDesencolado.getData().toString());					
				}
				if(nodoDesencolado.hasLeftChild()) {
					cola.enqueue(nodoDesencolado.getLeftChild());
				}
				if(nodoDesencolado.hasRightChild()) {
					cola.enqueue(nodoDesencolado.getRightChild());
				}
			}else if(!cola.isEmpty()){
				contadorNivel++;
				cola.enqueue(null);
				System.out.println();
			}
		}
   }
		
}

