package tp1.ejercicio8;

public class CircularQueue<T> extends Queue<T>{
	
	public T shift() {
	    if (this.isEmpty()) {
	        return null;
	    }

	    T elem = this.dequeue();
	    this.enqueue(elem);

	    return elem;
	}

}
