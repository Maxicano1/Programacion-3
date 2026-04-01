package tp1.ejercicio8;

import java.util.List;
import java.util.ArrayList;

public class DobleEndedQueue<T> extends Queue<T> {
	
    public DobleEndedQueue() {
        super();
    }

    // Encolar al inicio
    public void enqueueFirst(T dato) {
        data.add(0, dato);
    }

}
