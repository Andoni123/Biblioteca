package sql_Biblio;

import java.util.Date;

public class Prestamo {
	
	private int id_socio;
	private boolean devuelto;
	private int id_libro;
	private Date fecha;
	
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	public boolean isDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
