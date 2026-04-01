package tp1.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		if(n>1) {
			int []vector=new int[n];
			crearVector(n,vector);
		imprimirVector(vector);
		}
		in.close();
	}
	
   public static void crearVector(int n, int []v) {
	   for(int i=0; i<n; i++) {
		   v[i]=(i+1)*n;
	   }
   }
   
   public static void imprimirVector(int []v) {
	   for(int i=0; i<v.length ; i++) {
		   System.out.println(v[i]);
	   }
   }

}
