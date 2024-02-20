package sql_Biblio;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorBiblioteca {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		run();
	}
	private static void run() throws SQLException {
		// Variables
		int eleccion = 0;
		do {
			Menu.mostrarMenuBiblioteca();
			eleccion = Integer.parseInt(scan.nextLine());
			
			switch (eleccion) {
			// Enseñar menuLibros
			case Menu.LIBROS:
				GestorLibro.run(scan);
				break;

			// Enseñar menuSocio
			case Menu.SOCIOS:
				GestorSocio.run(scan);
				break;

			// Enseñar menuPrestamo
			case Menu.PRESTAMOS:
				GestorPrestamo.run(scan);
				break;
			// Salir
			case Menu.SALIR:
				System.out.println("Aio");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		} while (eleccion != 0);
	}
	
	
}
