package sql_Biblio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import sql_Biblio.FormulariosDeDatos;
import sql_Biblio.Libro;
import sql_Biblio.Menu;

public class GestorLibro {

	private static GestorBBDD gestor = new GestorBBDD();
	
	public static void run(Scanner scan) throws SQLException {
		int opcion;
		do {
			Menu.mostrarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.VERLIBROS:
				Conector.conectar();
				ArrayList<Libro> libros = GestorBBDD.getLibros();
				Visor.mostrarLibros(libros);

				Conector.cerrar();
				break;
			case Menu.INSERTARLIBRO:
				Conector.conectar();
				Libro libro = FormulariosDeDatos.pedirDatosLibro(scan);
				GestorBBDD.insertarLibro(libro);
				Conector.cerrar();
				break;
			case Menu.MODIFICARLIBRO:
				Conector.conectar();
				libros = GestorBBDD.getLibros();
				Visor.mostrarLibros(libros);
				libro = FormulariosDeDatos.pedirDatosLibro(scan);
				GestorBBDD.modificarLibro(libro, FormulariosDeDatos.pedirIdLibro(scan));
				gestor.cerrar();
				break;
			case Menu.SALIR:
				System.out.println("Salir...");
			}

		} while (opcion != Menu.SALIR);
	}
		
	

}
