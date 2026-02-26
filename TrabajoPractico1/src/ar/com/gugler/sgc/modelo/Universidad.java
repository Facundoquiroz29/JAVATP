package ar.com.gugler.sgc.modelo;

public class Universidad {
	public static void mostrarInformacion(Persona f)
	{
		if(f != null)
		{
			System.out.println(f.mostrarInformacion());
		} else {
			System.out.println("Error: la persona es nula.");
		}
	}
}
