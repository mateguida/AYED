package tp1.ejercicio8;

import java.util.LinkedList;

public class Queue<T>{
	private LinkedList<T> data;
	
	public LinkedList<T> getData() {
		return data;
	}
	
	public Queue(){
		this.data = new LinkedList<T>();
	}
	
	public void enqueue(T dato) {
		this.data.add(dato);
	}
	
	public T dequeue() {
		return this.data.poll();
	}
	
	public T head() {
		return this.data.peek();
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public int size() {
		return data.size();
	}
	
	public String toString() {
		return data.toString();
	}
}
