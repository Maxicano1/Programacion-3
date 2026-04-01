package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


import java.util.Iterator;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		// Parte A
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> lista1 = new ArrayList<>();
		lista1.add(2);
		lista1.add(4);
		lista1.add(6);
		
		for(int i=0; i<lista1.size();i++) {
			System.out.println(lista1.get(i));
		}
		
		for (int i:lista1) {
			System.out.println(i);
		}
		
		//Parte B
		// En la implementacion es muy parecido donde solo cambia el tipo de lista a utilizar
		
		LinkedList<Integer> lista2 = new LinkedList<>();
		
		lista2.add(3);
		lista2.add(5);
		lista2.add(7);
		
		for(int i=0; i<lista2.size();i++) {
			System.out.println(lista2.get(i));
		}
		
		// Parte C
		//Usando un Iterador
		
		Iterator<Integer> it = lista1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Parte D
		
		crearLista();
		
		//parte F
        List<Integer> listaNum = new ArrayList<>();
		listaNum.add(2);
		listaNum.add(3);
		listaNum.add(2);
		boolean ok2 = false;
		ok2 = esCapicua(listaNum);
		if(ok2) {
			System.out.println("La lista de numero es Capicua");
		} else System.out.println("La lista no es capicua");
		
		//parte G
		
		System.out.println("/n");
		EjercicioSucesion l = new EjercicioSucesion();
		int numero = in.nextInt();
		List<Integer> listaG = new ArrayList<>(l.calcularSucesion(numero));
		
		for (Integer i:listaG) {
			System.out.println(i);
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static void crearLista() {
		ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
		Estudiantes e1,e2,e3;
		e1 = new Estudiantes("Julian","Sanchez","G20","JuliSanc@gmail.com","57y12");
		e2 = new Estudiantes("Wendy","Inga","G21","WendyIng@gmail.com","57y3");
		e3 = new Estudiantes("Maxi","Cano","G22","maxica@gmail.com","560y12");
		listaEstudiantes.add(e1);
		listaEstudiantes.add(e2);
		listaEstudiantes.add(e3);
		
		ArrayList<Estudiantes> copia = new ArrayList<>(listaEstudiantes);
		
		for(Estudiantes i:listaEstudiantes) {
			System.out.println(i.tusDatos());
		}
		for(Estudiantes i:copia) {
			System.out.println(i.tusDatos());
		}
		listaEstudiantes.get(0).setNombre("Carlos");
		listaEstudiantes.get(0).setApellido("Sanchez");
		
		for(Estudiantes i:listaEstudiantes) {
			System.out.println(i.tusDatos());
		}
		for(Estudiantes i:copia) {
			System.out.println(i.tusDatos());
		}
		// En este caso al modificar los datos de una lista la otra tambien se modifica por lo que apuntan al mismo dato
		
		//otra forma de copiar sin que si modifica uno se altere otro es creando un nuevo elemento enc ada copia
		
		ArrayList<Estudiantes> copia2 = new ArrayList<>();
		for(Estudiantes i:listaEstudiantes) {
			copia2.add(new Estudiantes(i.getNombre(),i.getApellido(),i.getComision(),i.getEmail(),i.getDireccion()));
		}
		listaEstudiantes.get(0).setNombre("GASTON");
		for(Estudiantes i:listaEstudiantes) {
			System.out.println(i.tusDatos());
		}
		for(Estudiantes i:copia2) {
			System.out.println(i.tusDatos());
	}
		
		//Parte E
		
		//agregar un estudiante
		Estudiantes enuevo = new Estudiantes("Genaro","Ayala","G24","genayala@gmail.com","23y42");
		//verificacion de que si estudiante existe
		boolean ok=false;
		for(Estudiantes i: listaEstudiantes) {
			if(i.getNombre() == enuevo.getNombre() && i.getApellido() == enuevo.getApellido()) {
				ok = true;
				System.out.println("El estudiante se encuentra en la lista");
				break;
			}
		}
		if(!ok) {
			System.out.println("El Estudiante no se encuentra en la lista");
			listaEstudiantes.add(enuevo);		}		
	}

	public static boolean esCapicua(List<Integer> l) {
		int izquierda = 0; //posicion inicial
		int derecha = l.size()-1; //posicion final
		while(izquierda < derecha) {
			if (!l.get(izquierda).equals(l.get(derecha))) {
				return false;
			}
			izquierda++;
			derecha--;
		}
				
		return true;
	}
	
}
