package tp1.ejercicio7;

import java.util.List;
import java.util.ArrayList;

public class EjercicioSucesion {
	
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
	
	public void invertirArrayList (ArrayList<Integer> lista) {
		if(lista.size()<=1) {
			return;
		}
		int ultimo = lista.remove(lista.size()-1);
		invertirArrayList(lista);
		lista.add(0, ultimo);		
	}

}
