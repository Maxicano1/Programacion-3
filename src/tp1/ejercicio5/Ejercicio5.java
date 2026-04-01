package tp1.ejercicio5;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		Random rand= new Random();
		int []v = new int[3];
		for(int i=0; i<v.length;i++) {
			v[i]=rand.nextInt(10)+1; //valores random de 1 a 10;
		}
		
		//metodo 1
		//System.out.println(metodoReturn(v));
		
		//metodo 2
		
		Resultado res = new Resultado();
		res.calcular(v);
		res.resultado();
		
		//metodo 3
		
		//preguntar....
	}
	
	public static String metodoReturn(int []v) {
		int min=999,max=-999;
		double prom=0;
		for(int i=0;i<v.length;i++) {
			if(v[i]>max) {
				max=v[i];
			}
			if(v[i]<min) {
				min=v[i];
			}
			prom=prom+v[i];
		}
		prom=prom/v.length;
		return "minimo: "+min+" maximo: "+max+" promedio: "+prom;
		
	}
}
