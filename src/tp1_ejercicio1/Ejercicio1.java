package tp1_ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n1,n2;
		n1 = in.nextInt();
		n2 = in.nextInt();
		//imprimirFor(n1,n2);
		//imprimirWhile(n1,n2);
		imprimirRecursivo(n1,n2);
		in.close();
	}
	
	
	public static void imprimirFor(int n1, int n2) {
		for (int i = n1; i <= n2 ; i++) {
			System.out.println(i);
		}
	}
	
	public static void imprimirWhile (int n1, int n2) {
		while(n1<=n2){
			System.out.println(n1);
			n1++;
		}
	}
	
	public static void imprimirRecursivo(int n1, int n2) {
		if (n2<n1) {
			return;
		}
		else {
			System.out.println(n1);
			imprimirRecursivo(n1+1,n2);
		}
	}
}
