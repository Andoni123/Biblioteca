package sql_Biblio;

import java.util.Scanner;

public class GestorBiblioteca {
	static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {

		run();
		
	}
	private static void run(){
		int opcion;
		do {
			Menu.mostrarMenuBiblioteca();
			opcion= Integer.parseInt(scan.nextLine());
			
			switch(opcion) {
			case Menu.LIBROS:
				GestorLibro.run(scan);
				break;
			case Menu.PRESTAMOS:
				GestorPrestamo.run(scan);
				break;
			case Menu.SOCIOS:
				GestorSocio.run(scan);
				break;
			case Menu.SALIR:
				System.out.println("SALIR...");
			break;
			}
		}while(opcion != Menu.SALIR);
	}
	
}
