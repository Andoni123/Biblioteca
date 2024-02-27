package sql_Biblio;

import java.util.ArrayList;

public class Visor {


	public static void mostrarLibros(ArrayList<Libro> libros) {

		for (Libro l : libros) {
			System.out.println(l.toString());
		}

	}

	public static void mostrarLibro(Libro l) {
		System.out.println(l);
	}

	public static void mostrarSocios(ArrayList<Socio> socios) {
		for(Socio s : socios) {
			System.out.println(s.toString());
		}
	}

	public static void mostrarPrestamos(ArrayList<Prestamo> prestamos) {
		for (Prestamo p : prestamos) {
			System.out.println(p.toString());
		}
	}
}
