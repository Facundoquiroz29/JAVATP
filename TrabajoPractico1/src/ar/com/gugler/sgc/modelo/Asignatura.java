package ar.com.gugler.sgc.modelo;

import java.util.List;

public class Asignatura {
	private Integer codigo;
	private String nombre;
	private List<Alumno> alumnos;
	private Profesor profesor;

	public Asignatura(){
		super();
	}
	public Asignatura(Integer codigo, String nombre) {
	this.codigo = codigo;
	this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Asignatura: \n"
				+ "		Codigo: " + getCodigo() + ".	Nombre: " + getNombre();
	}
}
