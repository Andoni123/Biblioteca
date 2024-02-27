package sql_Biblio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * 
 */
public class Conector {
	private static final String HOST="localhost";
	private static final String BBDD="biblioteca";
	private static final String USER="root";
	private static final String PASSWORD="";
	private static final Scanner scan = new Scanner (System.in);
	
	protected static Connection con;

	public static void conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jbc:mysql://localhost/biblioteca";
			con = DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BBDD,USER,PASSWORD);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void cerrar() {
		
	}
}