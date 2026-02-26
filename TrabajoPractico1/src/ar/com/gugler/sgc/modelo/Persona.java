package ar.com.gugler.sgc.modelo;
import java.util.Date;


public abstract class Persona {
	private String numeroDocumento;
	private String apellido;
	private String nombres;
	private Date fechaNacimiento;
	private String domicilio;
	private String telefono;
	private String correoElectronico;
	
	public Persona() {
		super();
	}
	 public Persona(String numeroDocumento, String apellido, String nombres, Date fechaNacimiento, String domicilio, String telefono, String correoElectronico)
	 {
		 super();
		 this.numeroDocumento = numeroDocumento;
		 this.apellido = apellido;
		 this.nombres = nombres;
		 this.fechaNacimiento = fechaNacimiento;
		 this.domicilio = domicilio;
		 this.telefono = telefono;
		 this.correoElectronico = correoElectronico;
	 }
	public abstract String mostrarInformacion();
	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombre(String nombres) {
		this.nombres = nombres;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	//getters and setters
	
	
	
	
}
