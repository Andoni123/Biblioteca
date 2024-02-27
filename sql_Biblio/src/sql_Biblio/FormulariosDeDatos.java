package sql_Biblio;

import java.util.Date;
import java.util.Scanner;

public class FormulariosDeDatos {
	
	public static Libro pedirDatosLibro(Scanner scan) {
		Libro libro = new Libro();
		System.out.println("Dame el titulo");
		libro.setTitulo(scan.nextLine());
		System.out.println("Dame el autor del libro");
		libro.setAutor(scan.nextLine());
		System.out.println("Dame el numero de paginas");
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		return libro;
		
	}
	public static void modificarDatosLibro(Libro libro, Scanner scan) {
		
	}
	public static int pedirIdLibro(Scanner scan) {
		System.out.println("Dame la id del libro");
		return Integer.parseInt(scan.nextLine());
		
	}
	public static Socio pedirDatosSocio(Scanner scan) {
		Socio socio = new Socio();
		System.out.println("Dame el Nombre");
		socio.setNombre(scan.nextLine());
		System.out.println("Dame el apellido");
		socio.setApellido(scan.nextLine());
		System.out.println("Dame la direccion");
		socio.setDireccion(scan.nextLine());
		System.out.println("Dame la poblacion");
		socio.setPoblacion(scan.nextLine());
		System.out.println("Dame la provincia");
		socio.setProvincia(scan.nextLine());
		System.out.println("Dame el dni");
		socio.setDni(scan.nextLine());

		return socio;
		
	}
	public static Prestamo pedirDatosPrestamo(Scanner scan) {
		Prestamo prestamo = new Prestamo();
		System.out.println("Dame el id del libro prestado");
		prestamo.setId_libro(Integer.parseInt(scan.nextLine()));
		System.out.println("Dame el id de socio");
		prestamo.setId_socio(Integer.parseInt(scan.nextLine()));
		prestamo.setFecha(new Date());
		prestamo.setDevuelto(false);
		return null;
	}
}
