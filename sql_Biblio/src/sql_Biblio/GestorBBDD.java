package sql_Biblio;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sql_Biblio.Conector;
import sql_Biblio.Libro;

public class GestorBBDD extends Conector {

	
	// lector
	public static ArrayList<Libro> getLibros() {

		ArrayList<Libro> libros = new ArrayList<>();
		String sql = "SELECT * FROM libros";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Libro l = new Libro();

				l.setId(rs.getInt("id"));
				l.setTitulo(rs.getString("titulo"));
				l.setAutor(rs.getString("autor"));
				l.setNum_pag(rs.getInt("num_pag"));

				libros.add(l);
			}
		} catch (SQLException e) {
			System.out.println("te revento get libros maquina");
			e.printStackTrace();
		}

		return libros;
	}

	public static void insertarLibro(Libro libro) throws SQLException {
		String sql = "INSERT INTO libros (titulo,autor,num_pag) VALUES (?,?,?) ";
		PreparedStatement pst = con.prepareStatement(sql);

		try {
			pst.setString(1, libro.getTitulo());
			pst.setString(2, libro.getAutor());
			pst.setInt(3, libro.getNum_pag());

			pst.execute();

		} catch (SQLException e) {
			System.out.println("se tea jodido  insertarLibro");
			e.printStackTrace();
			pst.execute();
		}
	}
	public static Libro modificarLibro(Libro libro, int id) throws SQLException {
		String sql ="UPDATE libros SET titulo=?,autor=?,num_pag=? WHERE id=?";
		PreparedStatement pst = con.prepareStatement(sql);

					try {
						pst.setString(1, libro.getTitulo());
						pst.setString(2, libro.getAutor());
						pst.setInt(3, libro.getNum_pag());
						pst.setInt(4, id);
		
					
						pst.execute();
		
					} catch (SQLException e) {
						System.out.println("Peto en modificarLibro");
						e.printStackTrace();
					}
		
				return libro;

	}
	// socios

	public static ArrayList<Socio> getSocios() {

		ArrayList<Socio> socios = new ArrayList<>();
		String sql = "SELECT * FROM socios";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Socio s = new Socio();

				s.setId(rs.getInt("id"));
				s.setNombre(rs.getString("nombre"));
				s.setApellido(rs.getString("apellido"));
				s.setDireccion(rs.getString("direccion"));
				s.setPoblacion(rs.getString("poblacion"));
				s.setProvincia(rs.getString("provincia"));
				s.setDni(rs.getString("dni"));

				socios.add(s);
			}
		} catch (SQLException e) {
			System.out.println("te revento get socios maquina");
			e.printStackTrace();
		}

		return socios;
	}
	
	public static void insertarSocio(Socio socio) throws SQLException {
		String sql = "INSERT INTO socios (nombre,apellido,direccion,poblacion,provincia,dni) VALUES (?,?,?,?,?,?) ";
		PreparedStatement pst = con.prepareStatement(sql);

		try {
			pst.setString(1, socio.getNombre());
			pst.setString(2, socio.getApellido());
			pst.setString(3, socio.getDireccion());
			pst.setString(4, socio.getPoblacion());
			pst.setString(5, socio.getProvincia());
			pst.setString(6, socio.getDni());




			pst.execute();

		} catch (SQLException e) {
			System.out.println("se tea jodido  insertarSocio");
			e.printStackTrace();
			pst.execute();
		}
	}

	//prestamos
	public static ArrayList<Prestamo> getPrestamos() {

		ArrayList<Prestamo> prestamos = new ArrayList<>();
		String sql = "SELECT * FROM prestamos";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Prestamo p = new Prestamo();

				p.setId_libro(rs.getInt("id_libro"));
				p.setId_socio(rs.getInt("id_socio"));
				p.setFecha(rs.getDate("fecha"));
				p.setDevuelto(rs.getBoolean("devuelto"));

				prestamos.add(p);
			}
		} catch (SQLException e) {
			System.out.println("te revento get prestamos maquina");
			e.printStackTrace();
		}

		return prestamos;
	}
	public static void insertarPrestamo(Prestamo prestamo) throws SQLException {
		String sql = "INSERT INTO prestamos (id_libro,id_socio,fecha,devuelto) VALUES (?,?,?,?) ";
		PreparedStatement pst = con.prepareStatement(sql);

		try {
			pst.setInt(1, prestamo.getId_libro());
			pst.setInt(2, prestamo.getId_socio());
			pst.setDate(3, (Date) prestamo.getFecha());
			pst.setBoolean(4, prestamo.isDevuelto());
			
			pst.execute();

		} catch (SQLException e) {
			System.out.println("se tea jodido  insertarPrestamo");
			e.printStackTrace();
			pst.execute();
		}
	}

//		public void insertarLibro(Libro libro) throws SQLException {
//			String sql ="INSERT INTO libros (titulo,autor,num_pag) VALUES (?,?,?) ";
//
//			try {
//				PreparedStatement pst = con.prepareStatement(sql);
//				pst.setString(1, libro.getTitulo());
//				pst.setString(2, libro.getAutor());
//				pst.setInt(3, libro.getNum_pag());
//
//				pst.execute();
//			} catch (SQLException e) {
//				System.out.println("Peto en insertarLibro");
//				e.printStackTrace();
//				pst.execute();
//		}
//
//	}
//
//		public void eliminarLibro(int id) throws SQLException {
//			String sql ="DELETE FROM libros WHERE id=?";
//
//			try {
//				PreparedStatement pst = con.prepareStatement(sql);
//				pst.setInt(1, id);
//
//				pst.execute();
//
//			} catch (SQLException e) {
//				System.out.println("Peto en eliminarLibro");
//				e.printStackTrace();
//				pst.execute();
//
//		}
//
//
//	}
//
//	public Libro getLibro(int id) {
//		Libro libro = new Libro();
//		String sql= "SELECT * FROM libros WHERE id=?";
//
//
//		try {
//			PreparedStatement pst = cn.prepareStatement(sql);
//			pst.setInt(1, id);
//		public Libro getLibro(int id) {
//			Libro libro = new Libro();
//			String sql= "SELECT * FROM libros WHERE id=?";
//
//			ResultSet rs = pst.executeQuery();
//
//			rs.next();
//			libro.setId(rs.getInt("id"));
//			libro.setTitulo(rs.getString("titulo"));
//			libro.setAutor(rs.getString("autor"));
//			libro.setNum_pag(rs.getInt("num_pag"));
//			try {
//				PreparedStatement pst = cn.prepareStatement(sql);
//				pst.setInt(1, id);
//
//				ResultSet rs = pst.executeQuery();
//
//				rs.next();
//				libro.setId(rs.getInt("id"));
//				libro.setTitulo(rs.getString("titulo"));
//				libro.setAutor(rs.getString("autor"));
//				libro.setNum_pag(rs.getInt("num_pag"));
//
//
//			} catch (SQLException e) {
//				System.out.println("Peto en getLibro");
//				e.printStackTrace();
//			}
//			return libro;
//
//		} catch (SQLException e) {
//			System.out.println("Peto en getLibro");
//			e.printStackTrace();
//		}
//		return libro;
//
//	}
//

//
//		try {
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(sql);
//		public void modificarLibro(int id,Libro l) {
//			String sql ="UPDATE libros SET titulo=?,autor=?,num_pag=? WHERE id=?";
//
//			while (rs.next()) {
//				Libro l = new Libro();
//			try {
//				PreparedStatement pst = cn.prepareStatement(sql);
//				pst.setString(1, l.getTitulo());
//				pst.setString(2, l.getAutor());
//				pst.setInt(3, l.getNum_pag());
//				pst.setInt(4, id);
//
//				l.setId(rs.getInt("id"));
//				l.setTitulo(rs.getString("titulo"));
//				l.setAutor(rs.getString("autor"));
//				l.setNum_pag(rs.getInt("num_pag"));
//				pst.execute();
//
//				libros.add(l);
//			} catch (SQLException e) {
//				System.out.println("Peto en modificarLibro");
//				e.printStackTrace();
//			}
//		} catch (SQLException e) {
//			System.out.println("Peto en getLibros");
//			e.printStackTrace();
//		}
//
//		return libros;
//	}
//
//	public void modificarLibro(int id,Libro l) {
//		String sql ="UPDATE libros SET titulo=?,autor=?,num_pag=? WHERE id=?";
//
//		try {
//			PreparedStatement pst = cn.prepareStatement(sql);
//			pst.setString(1, l.getTitulo());
//			pst.setString(2, l.getAutor());
//			pst.setInt(3, l.getNum_pag());
//			pst.setInt(4, id);
//	//Socios
//		public ArrayList<Socio> getSocios(){
//			ArrayList<Socio> socios = new ArrayList<>();
//			String sql = "SELECT * FROM socios";
//
//			try {
//				Statement st = cn.createStatement();
//				ResultSet rs = st.executeQuery(sql);
//
//				while(rs.next()) {
//					Socio s = new Socio();
//
//					s.setId(rs.getInt("id"));
//					s.setNombre(rs.getString("nombre"));
//					s.setApellido(rs.getString("apellido"));
//					s.setDireccion(rs.getString("direccion"));
//					s.setDni(rs.getString("dni"));
//					s.setPoblacion(rs.getString("poblacion"));
//					s.setProvincia(rs.getString("provincia"));
//
//					socios.add(s);
//				}
//			} catch (SQLException e) {
//				System.out.println("Peto en getSocios");
//				e.printStackTrace();
//			}
//
//			pst.execute();
//
//		} catch (SQLException e) {
//			System.out.println("Peto en modificarLibro");
//			e.printStackTrace();
//			return socios;
//		}
//
//
//	}

}
