package sql_Biblio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorPrestamo {

	public static void run(Scanner scan) throws SQLException {
		int opcion;
		do {
			Menu.mostrarMenuPrestamos();
			opcion= Integer.parseInt(scan.nextLine());
			switch(opcion) {
			case Menu.SALIR:
				System.out.println("Salir...");
				break;
			case Menu.INSERTARPRESTAMO:
				Conector.conectar();
				Prestamo prestamo = FormulariosDeDatos.pedirDatosPrestamo(scan);
				GestorBBDD.insertarPrestamo(prestamo);
				Conector.cerrar();
				break;
			case Menu.VERPRESTAMOS:
				Conector.conectar();
				ArrayList<Prestamo> prestamos = GestorBBDD.getPrestamos();
				Visor.mostrarPrestamos(prestamos);
				Conector.cerrar();
				break;
			
			}
			
			}while(opcion!= Menu.SALIR);
	
	}
}
