package sql_Biblio;

import java.util.Scanner;

public class GestorBiblioteca {
	static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {

		run();
		
	}
	private static void run(){
		
	
		Menu.mostrarMenuBiblioteca();
		int opcion= Integer.parseInt(scan.nextLine());
		//do while
		do {
			switch(opcion) {
			case Menu.LIBROS:
				Menu.mostrarMenuLibros();
			case Menu.PRESTAMOS:
				Menu.mostrarMenuPrestamos();
			case Menu.SOCIOS:
				Menu.mostrarMenuSocios();
			case Menu.SALIR:
				System.out.println("SALIR...");
			
			}
		}while(opcion != Menu.SALIR);
	}
	
}
