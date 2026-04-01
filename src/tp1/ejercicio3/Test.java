package tp1.ejercicio3;

public class Test {
	public static void main(String[] args) {
		Estudiantes []vectorEstudiante = new Estudiantes[2];
		Profesor []vectorProfesor = new Profesor[3];
		vectorEstudiante[0]=new Estudiantes("Carlos","Almeida","g20","CarlosAlm@gmial.com","1y47");
		vectorEstudiante[1]=new Estudiantes("tito","Almeida","f1","titoAlm@gmial.com","1y47");
		vectorProfesor[0]= new Profesor("Augusto","Torales","AuguTor@gmail.com","Progra","info");
		vectorProfesor[1]= new Profesor("Ramon","Torales","RROmr@gmail.com","Progra","info");
		vectorProfesor[2]= new Profesor("SAbri","Torales","SuusuTor@gmail.com","Progra","ing");
		
		for (int i=0; i<=1; i++) {
			System.out.println(vectorEstudiante[i].tusDatos());
		}
		for(int i=0; i<=2; i++) {
			System.out.println(vectorProfesor[i].tusDatos());
		}
	}

}
