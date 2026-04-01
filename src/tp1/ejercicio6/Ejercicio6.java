package tp1.ejercicio6;


/* 
 * A) El Arraylist es mejor cuando se trata de buscar un dato en una posicion especifica
 * B) El Linkedlist es mejor para poder eliminar o agregar un elementos a la lista
 * C) El Linkedlist usa menos memorias porque gasta solo cuando se ingresa un nuevo dato
 * en cambio el Arraylist tiene que generar el doble de datos cuando se llena
 * D)Linkedlist cuando necesito agregar o eliminar datos sin importar la posicion, en cambio
 * el arraylist comviene cuando tengo que buscar un dato en un espacio particular
 */

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio6 {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(2);
		l1.add(25);
		l1.add(12);
		
		for(int i:l1) {
			System.out.println(i);
		}
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(34);
		l2.add(55);
		l2.add(90);
		
		for(int i:l2) {
			System.out.println(i);
		}
	}

}
