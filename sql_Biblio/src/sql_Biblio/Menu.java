package sql_Biblio;

public class Menu {
	public static final int LIBROS=1;
	public static final int PRESTAMOS=2;
	public static final int SOCIOS=3;
	public static final int SALIR=0;
	
	public static final int INSERTARL=1;
	public static final int ELIMINARL=2;
	public static final int VERL=3;
	
	public static final int VERS=1;
	public static final int INSERTARS=2;
	
	public static final int PRESTAR=1;
	
	public static void mostrarMenuBiblioteca() {
		
		//menu
		System.out.println("---Menu---");
		System.out.println(SALIR +"-Salir");
		System.out.println(LIBROS + "-Gestionar Libros");
		System.out.println(PRESTAMOS +"-Gestionar Prestamos");
		System.out.println(SOCIOS +"-Gestionar Socios");
	}
	public static void mostrarMenuLibros(){
		System.out.println("---Menu De Libros---");
		System.out.println(SALIR +"-Salir");
		System.out.println(INSERTARL + "Insertar libro");
		System.out.println(PRESTAMOS +"Eliminar libro");
		System.out.println(SOCIOS +"Ver libros");
	}
	public static void mostrarMenuSocios(){
		System.out.println("---Menu De Socios---");
		System.out.println(SALIR +"-Salir");
		System.out.println(VERS + "Ver socios");
		System.out.println(INSERTARS +"Insertar nuevo socio");
		}
	public static void mostrarMenuPrestamos(){
		System.out.println("---Menu De Prestamos---");
		System.out.println(SALIR +"-Salir");
		System.out.println(PRESTAR + "Realizar Un Prestamo");
		}
	

}
