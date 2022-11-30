package Maid;

import java.util.Scanner;

public class Maid {
   public static void leer() {
	   int edad;
	   Scanner obj_leer= new Scanner(System.in);
	   System.out.println("Proporcione Edad");
	   edad=obj_leer.nextInt();
	   System.out.println("Tu edad es: "+edad);
   }
   
	public static void main(String[] args) {
    leer();
	}

}
