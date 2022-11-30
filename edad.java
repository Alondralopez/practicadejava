package edad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class edad {
public static void leer() {
	int edad=0;
	BufferedReader obj_leer = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Dame tu edad");
	try {
		edad = Integer.parseInt(obj_leer.readLine().trim());
} 
	catch(NumberFormatException e){
	System.out.println("Error en el tipo de dato"+" no proporciono un valor entero para la edad: ");
return;
}
	catch(IOException e) {
		System.out.println("Error en el "+" Dispositivo de entrada ...");
		return;
	}
	System.out.println("La edad dada es: "+edad);
}
	

	public static void main(String[] args) {
leer();
	}

}
