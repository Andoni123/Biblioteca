package sql_Biblio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorSocio {

	private static GestorBBDD gestor = new GestorBBDD();

	public static void run(Scanner scan) throws SQLException {
		Menu.mostrarMenuSocios();
		int opcion;
		do {
			Menu.mostrarMenuSocios();
			 opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.INSERTARSOCIO:
				Socio socio = FormulariosDeDatos.pedirDatosSocio(scan);
				GestorBBDD.insertarSocio(socio);
				break;
			case Menu.VERSOCIO:
				gestor.conectar();
				ArrayList<Socio> socios = GestorBBDD.getSocios();
				Visor.mostrarSocios(socios);
				gestor.cerrar();
				break;
			case Menu.SALIR:
				System.out.println("Salir...");
			}

		} while (opcion != Menu.SALIR);
	}
}
