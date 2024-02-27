package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {

		int option;
		
		final int AÑADIR_LIBRO=1;
		final int ELIMINAR_LIBRO=2;
		final int SALIR =0;
		do {
			 option= Integer.parseInt(scan.nextLine());
			System.out.println(SALIR + "Salir");
			System.out.println(AÑADIR_LIBRO + "Añadir libro");
			System.out.println(ELIMINAR_LIBRO + "Eliminar libro");

			switch (option) {
			case AÑADIR_LIBRO:
				añadirLibro();
				break;
			case ELIMINAR_LIBRO:
				break;
			case SALIR:
				System.out.println("Salir....");
				break;
			default:
				break;
			}
		}while(option!=0);
	}
	static ArrayList<Libro> libros= new ArrayList<>();

	private static void añadirLibro() {
		Libro libro=new Libro();
		System.out.println("Introduce id ");
		libro.getId(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce nombre del libro");
		libro.getNombre(scan.nextLine());
		System.out.println("Introduce numero de paginas");
		libro.getNum_pag(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce fecha salida");
		libro.getFecha_Publi(new Date());
		
		libros.add(libro);
	}

}
