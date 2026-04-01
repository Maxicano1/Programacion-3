package tp1.ejercicio9;

import java.util.Scanner;

public class TestBalanceo {

	public static void main (String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.print("Ingrese cadena de caracter: ");
		String cadena = in.nextLine();
		System.out.println("Cadena Ingresada: "+cadena);
		
		Stack<Character> pila = new Stack<>();
		
		System.out.println(pila.isEmpty());
		
		pila.push('h');
		pila.push('o');
		pila.push('l');
		pila.push('a');
		
		System.out.println(pila.toString());
		
		
		
	}
}
