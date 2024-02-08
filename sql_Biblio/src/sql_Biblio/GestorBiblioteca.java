package sql_Biblio;

import java.util.Scanner;

public class GestorBiblioteca {
	static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {

		run();
		
	}
	private static void run(){
		final int LIBROS=1;
		final int PRESTAMOS =2;
		final int SOCIOS = 3;
		final int SALIR = 0;
		//menu
		System.out.println("---Menu---");
		System.out.println("Salir");
		System.out.println("1-Gestionar Libros");
		System.out.println("2-Gestionar Prestamos");
		System.out.println("3-Gestionar Socios");
	
		
		int opcion= Integer.parseInt(scan.nextLine());
		//do while
		do {
			switch(opcion) {
			case LIBROS:
//				gestionarLibros();
			case PRESTAMOS:
//				gestionarPrestamos();
			case SOCIOS:
//				gestionarSocios();
			case SALIR:
				System.out.println("SALIR...");
			
			}
		}while(opcion != SALIR);
	}
}
