package Insti;

public class Profesor extends Persona {
	private String materia;
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}


	@Override
	public String toString() {
		return super.toString()+"Profesor [materia=" + materia + "]";
	}

	@Override
	public void saludar(Persona persona) {
		if (persona instanceof Profesor) {
			Profesor p = (Profesor)persona;
			System.out.println("Hola soy el profesor "+p.getNombre()+" y doy clase de "+p.getMateria());
		}
		
	}

	@Override
	public void realizarAccionEspecial(Persona persona) {
		if (persona instanceof Profesor) {
			Profesor p = (Profesor)persona;
			System.out.println("Hola soy el profesor "+p.getNombre()+" ,doy clase de "+p.getMateria()+" y tengo "+p.getEdad()+" edad.");
		}
		
	}
}
