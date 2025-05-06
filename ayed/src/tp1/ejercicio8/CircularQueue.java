package tp1.ejercicio8;

public class CircularQueue<T> extends Queue<T>{
	
	public T shift() {
		T aux = this.getData().poll();
		for(int i = 0; i < this.getData().size(); i++) {
			this.getData().set(i, this.getData().get(i+1));
		}
		this.getData().add(aux);
		return aux;
	}
}
