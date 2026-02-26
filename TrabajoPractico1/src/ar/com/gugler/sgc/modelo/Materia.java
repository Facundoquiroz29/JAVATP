package ar.com.gugler.sgc.modelo;

public class Materia extends Asignatura {
	private Integer anio;
	
	public Materia(){
		super();
	}
	public Materia(Integer codigo, String nombre, Integer anio) {
		super(codigo, nombre);
		this.anio = anio;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	
	@Override
	public String toString() {
		return "Materia: \n" +
				"	Codigo: " + getCodigo() + 
				"	Nombre: " + getNombre()	+
				" 	Anio: " + this.anio;
	}
	
	
}
