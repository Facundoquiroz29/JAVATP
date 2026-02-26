package ar.com.gugler.sgc.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alumno extends Persona {
	
	private String legajo;
	
	public Alumno() {
		super();
	}
	
	public Alumno(String numeroDocumento, String apellido, String nombres, Date fechaNacimiento, String domicilio, String telefono, String correoElectronico, String legajo){
		 super(numeroDocumento, apellido, nombres, fechaNacimiento, domicilio, telefono, correoElectronico);
		 this.legajo = legajo;
	}
	
	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	@Override
	public boolean equals(Object fff) {
	    if (this == fff) return true;
	    if (!(fff instanceof Alumno)) return false;
	    Alumno otro = (Alumno) fff;
	    return getLegajo() != null && getLegajo().equals(otro.getLegajo()); 
	    //comparamos con numero de legajo porque es una cualidad unica del alumno
	    //dni puede haber repetidos
	}

	@Override
	public String mostrarInformacion() {
		//Formateamos la fecha
		SimpleDateFormat Dateformat = new SimpleDateFormat("dd/MM/yyyy");
		String FechaFormateada = Dateformat.format(getFechaNacimiento());
		//-------------------.
		return "Alumno:\n" + 
				" legajo: " + legajo + "\n" + 
				" Numero Documento: " + getNumeroDocumento() + "\n" + 
				" Apellido: " + getApellido() + "\n" +
				" Nombre: " + getNombres() + "\n" +
				" Fecha Nacimiento: " + FechaFormateada + "\n" +
				" Domicilio: " + getDomicilio() + "\n" + 
				" Telefono: " + getTelefono() + "\n" +
				" Correo Electronico: " + getCorreoElectronico() + "\n" ; 
	}
}
