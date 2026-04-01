package tp1.ejercicio8;

public class Ejercicio8 {
	
	public static void main (String[] args) {
		Queue<Integer> cola = new Queue<>();
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(7);
		cola.enqueue(4);
		cola.enqueue(1);
		
		System.out.println(cola.head());
		System.out.println(cola.size());
		
		System.out.println(cola.toString());
		 
		cola.dequeue();
		cola.dequeue();
		
		System.out.println(cola.toString());
		
		CircularQueue<Integer> colaCircular = new CircularQueue<>();
		
		colaCircular.enqueue(3);
		colaCircular.enqueue(5);
		colaCircular.enqueue(99);
		
		System.out.println(colaCircular.toString());
		
		colaCircular.shift();
		
		System.out.println(colaCircular.toString());
		
		DobleEndedQueue<Integer> colaDoble = new DobleEndedQueue<>();
		
		colaDoble.enqueue(3);
		colaDoble.enqueue(10);
		colaDoble.enqueue(13);
		
		System.out.println(colaDoble.toString());
		
		colaDoble.enqueueFirst(2);
		
		System.out.println(colaDoble.toString());
		
	}

}
