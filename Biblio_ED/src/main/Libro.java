package main;

import java.util.Date;

public class Libro {

	private int id;
	private String nombre;
	private int num_pag;
	private Date fecha_Publi;

	public int getId(int i) {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre(String string) {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum_pag(int i) {
		return num_pag;
	}

	public void setNum_pag(int num_pag) {
		this.num_pag = num_pag;
	}

	public Date getFecha_Publi(Date date) {
		return fecha_Publi;
	}

	public void setFecha_Publi(Date fecha_Publi) {
		this.fecha_Publi = fecha_Publi;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", num_pag=" + num_pag + ", fecha_Publi=" + fecha_Publi + "]";
	}
}
