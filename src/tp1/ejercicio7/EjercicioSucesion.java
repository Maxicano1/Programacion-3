package tp1.ejercicio7;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class EjercicioSucesion {
	
	//Parte G
	public List<Integer> calcularSucesion(int n){
		List<Integer> lista = new ArrayList<>();
		lista.add(n);
		
		if(n==1) {
			return lista;
		}
		if(n % 2 == 0) {
			lista.addAll(calcularSucesion(n/2));
		}
		if(n% 2 != 0) {
			lista.addAll(calcularSucesion(3*n+1));
		}
		return lista;
	}
	
	//Parte H
	public void invertirArrayList (ArrayList<Integer> lista) {
		if(lista.size()<=1) {
			return;
		}
		int ultimo = lista.remove(lista.size()-1);
		invertirArrayList(lista);
		lista.add(0, ultimo);		
	}
	
	// parte I
	public int sumarLinkedList(LinkedList<Integer> lista) {
		if (lista.isEmpty()) {
			return 0;
		}
		int primero = lista.removeFirst();
		
		return primero + sumarLinkedList(lista);
		
	}
	
	
	//parte j
	
	public ArrayList<Integer> combinarOrdenado (ArrayList<Integer> lista1, ArrayList<Integer> lista2){
		ArrayList<Integer> listaOrdenada = new ArrayList<>();
		int i=0,j=0;
		while (i<lista1.size() && j<lista2.size()) {
			if(lista1.get(i)<lista2.get(j)) {
				listaOrdenada.add(lista1.get(i));
				i++;
			}else {
					listaOrdenada.add(lista2.get(j));
					j++;
			}
		}
		while (i<lista1.size()) {
				listaOrdenada.add(lista1.get(i));
				i++;
		}
		while(j<lista2.size()) {
				listaOrdenada.add(lista2.get(j));
				j++;
		}
		return listaOrdenada;
	}

}
