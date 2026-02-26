package ar.com.gugler.sgc.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Profesor extends Persona{
	
	private String cuil;
	private Date fechaIngreso;
	
	public Profesor() {
		super();
	}
	
	public Profesor(String numeroDocumento, String apellido, String nombres, Date fechaNacimiento, String domicilio, String telefono, String correoElectronico, String cuil, Date fechaIngreso) {
		super(numeroDocumento, apellido, nombres, fechaNacimiento, domicilio, telefono, correoElectronico);
		this.cuil = cuil;
		this.fechaIngreso = fechaIngreso;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	public String mostrarInformacion() {
		SimpleDateFormat Dateformat = new SimpleDateFormat("dd/MM/yyyy");
		//fecha ingreso
		String FechaIngresoFormateada = Dateformat.format(fechaIngreso);
		//fecha nacimiento
		String FechaNacimientoFormateada = Dateformat.format(getFechaNacimiento());
		//----------------
		return "Profesor:\n" + 
				" Cuil: " + cuil + "\n" + 
				" Fecha de Ingreso: " + FechaIngresoFormateada + "\n" + 
				" Numero Documento: " + getNumeroDocumento() + "\n" + 
				" Apellido: " + getApellido() + "\n" +
				" Nombre: " + getNombres() + "\n" +
				" Fecha Nacimiento: " + FechaNacimientoFormateada + "\n" +
				" Domicilio: " + getDomicilio() + "\n" + 
				" Telefono: " + getTelefono() + "\n" +
				" Correo Electronico: " + getCorreoElectronico() + "\n" ; 
	}
	
}