package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Libro> libros = new ArrayList<>();

		int option;

		final int AÑADIR_LIBRO = 1;
		final int ELIMINAR_LIBRO = 2;
		final int SALIR = 0;
		do {
			System.out.println(SALIR + "Salir");
			System.out.println(AÑADIR_LIBRO + "Añadir libro");
			System.out.println(ELIMINAR_LIBRO + "Eliminar libro");
			option = Integer.parseInt(scan.nextLine());

			switch (option) {
			case AÑADIR_LIBRO:
				añadirLibro(libros);
				break;
			case ELIMINAR_LIBRO:
				break;
			case SALIR:
				System.out.println("Salir....");
				break;
			default:
				break;
			}
		} while (option != 0);
	}

	public static void añadirLibro(ArrayList<Libro> libros) {

		Libro libro = new Libro();
		libro.setId(libros.size() + 1);
		System.out.println("Introduce nombre del libro");
		libro.setNombre(scan.nextLine());
		System.out.println("Introduce numero de paginas");
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		libro.setFecha_Publi(new Date());

		libros.add(libro);

		

	}

}
