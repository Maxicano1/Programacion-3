package tp1.ejercicio4;

public class SwapValores {
	public static void swap1 (int x, int y) {
		if (x < y) {
		int tmp = x ;
		x = y ;
		y = tmp;
		}
		}
		public static void swap2 (Integer x, Integer y) {
		if (x < y) {
		int tmp = x ;
		x = y ;
		y = tmp;
		}
		}
		
		public static void main(String[] args) {
			int a = 1, b = 2;
			Integer c = 3, d = 4;
			swap1(a,b);
			swap2(c,d);
			System.out.println("a=" + a + " b=" + b) ;
			System.out.println("c=" + c + " d=" + d) ;
			}

		
		/*
		 * no funciona el primer metodo porque los paramatros se pasan por valor 
		 * Los wrappers son inmutables es decir que no cambian los valores a pesar de modificarlos
		 * es decir que crea una nueva clase donde si se modifica apunta a esa nueva clase pero 
		 * la clase anterior queda en memoria.
		 */
}
