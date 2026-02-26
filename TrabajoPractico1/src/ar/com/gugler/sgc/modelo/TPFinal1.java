package ar.com.gugler.sgc.modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TPFinal1 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy"); 
			
		//CREAR ALUMNOS Y PROFESOR
	        Alumno alumno1 = new Alumno("41754346", "Messi", "Lionel Andres", SDF.parse("24/06/1987"),
	                "Belgrano 234", "3435-558899", "messilionelelmascapo@gmail.com", "ABCD1");

	        Alumno alumno2 = new Alumno("87654321", "Maradona", "Diego Armando", SDF.parse("30/10/1960"),
	                "Avenida Facundo Suviria 742", "3435-773322", "armandoparedes@gmail.com", "ABCD2");
	        
	        
	        Profesor profesor = new Profesor("41754346", "Quiroz", "Facundo Daniel", SDF.parse("29/04/1970"),
	                "San Luis 110", "3454-668866", "facundoquirxz@gmail.com", "20-41754346-6", SDF.parse("02/11/2011"));

	        //MOSTRAR INFORMACION
	        Universidad.mostrarInformacion(alumno1);
	        Universidad.mostrarInformacion(alumno2);
	        Universidad.mostrarInformacion(profesor);

	        //CREAR CURSO
	        Curso curso = new Curso(101, "Programación en Java", 24);
	        curso.setProfesor(profesor);

	        //AGREGAMOS ALUMNOS
	        curso.agregarAlumno(alumno1);
	        curso.agregarAlumno(alumno2);
	        
	        //curso.eliminarAlumno(alumno1);
	        
	        //IMPRIMIMOS CURSO
	        System.out.println(curso);
	    
	        /*for(int i = 0; i < curso.getAlumnos().size(); i++)
	        {
	        	 System.out.println(curso.getAlumnos().get(i).mostrarInformacion());
	        }*/
		}
	
	
	//configando github nuevos cambios ultimos notebok windwos , ultimo cambio real notebook
	//buenas noches
	
}
