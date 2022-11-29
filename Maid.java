package proyecto1;


public class Maid {
 String alumna = "Alondra Alejandra Lopez Medellin"; 
 String alumno = "Daniel Orlando Ceja Olloqui";
String asignatura = "Fundamentos de programación";
int semestre= 1;
public void saludo_alumna(){
	System.out.println("Hola "+alumna);
	System.out.println("Bienvenida al semestre "+semestre);
	System.out.println("De la asignatura "+asignatura);
}
public void saludo_alumno(){
	System.out.println("Hola "+alumno);
	System.out.println("Bienvenida al semestre "+semestre);
	System.out.println("De la asignatura "+asignatura);
}
	
	public static void main(String[] args) {
		Maid objeto_alumno = new Maid();
		Maid objeto_alumna = new Maid();
		objeto_alumno.saludo_alumno();
		objeto_alumna.saludo_alumno();
	}
}
