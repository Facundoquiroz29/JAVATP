package ar.com.gugler.sgc.modelo;
import java.util.ArrayList;

public class Curso extends Asignatura implements Administrable {

	private Integer cupo;
	
	public Curso() {
		super();
		this.cupo = 0;
	}
	
	public Curso(Integer codigo, String nombre, Integer cupo) {
		super(codigo, nombre);
		this.cupo = cupo;
	}

	public Integer getCupo()
	{
		return cupo;
	}
	
	public void setCupo(Integer cupo)
	{
		this.cupo = cupo;
	}
	
	public void agregarAlumno(Alumno alumno) 
	{
		if(alumno == null)
			return;
		if(getAlumnos() == null)
		{
			setAlumnos(new ArrayList<>());
		}
		
		if(!getAlumnos().contains(alumno) && admiteInscripciones()) {
			getAlumnos().add(alumno); 
			cupo--;
		}
		
	}
	
	public void eliminarAlumno(Alumno alumno)
	{
		if(alumno == null)
			return;
		if(getAlumnos() == null || getAlumnos().isEmpty()) 
			return;
		if(getAlumnos().remove(alumno))
			cupo++;
	}
	
	
	public boolean admiteInscripciones(){
		if(getAlumnos() == null)
			return true;
		if(getAlumnos().size() >= cupo) {
			System.out.println("Error, cupos llenos.");
			return false;
		}
		return true;
	}
	

	@Override
	public String toString() {
		return "Curso: \n" +
				"	Cupos: " + this.cupo + " / Codigo: " + getCodigo() + " / Nombre: " + getNombre()+ "\n" +
				"	Profesor: " + getProfesor().getNombres() + " " + getProfesor().getApellido();  
	}
}

