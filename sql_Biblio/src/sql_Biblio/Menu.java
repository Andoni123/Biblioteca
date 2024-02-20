package sql_Biblio;

public class Menu {
	public static final int LIBROS=1;
	public static final int PRESTAMOS=2;
	public static final int SOCIOS=3;
	public static final int SALIR=0;
	
	public static final int INSERTARLIBRO=1;
	public static final int ELIMINARLIBRO=2;
	public static final int VERLIBRO=3;
	public static final int VERLIBROS = 4;
	
	public static final int VERSOCIO=1;
	public static final int INSERTARSOCIO=2;
	
	public static final int PRESTAR=1;
	
	public static void mostrarMenuBiblioteca() {
		
		//menu
		System.out.println("---Menu---");
		System.out.println(SALIR +"-Salir");
		System.out.println(LIBROS + " Gestionar Libros");
		System.out.println(PRESTAMOS +" Gestionar Prestamos");
		System.out.println(SOCIOS +" Gestionar Socios");
	}
	public static void mostrarMenuLibros(){
		System.out.println("---Menu De Libros---");
		System.out.println(SALIR +"-Salir");
		System.out.println(INSERTARLIBRO + " Insertar libro");
		System.out.println(ELIMINARLIBRO +" Eliminar libro");
		System.out.println(VERLIBROS +" Ver libros");
	}
	public static void mostrarMenuSocios(){
		System.out.println("---Menu De Socios---");
		System.out.println(SALIR +"-Salir");
		System.out.println(VERSOCIO + " Ver socios");
		System.out.println(INSERTARSOCIO +" Insertar nuevo socio");
		}
	public static void mostrarMenuPrestamos(){
		System.out.println("---Menu De Prestamos---");
		System.out.println(SALIR +" Salir");
		System.out.println(PRESTAR + " Realizar Un Prestamo");
		}
	

}
