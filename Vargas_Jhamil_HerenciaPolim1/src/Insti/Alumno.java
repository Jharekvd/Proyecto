package Insti;

public class Alumno extends Persona {
	private int numEst;
	
	public int getNumEst() {
		return numEst;
	}

	public void setNumEst(int numEst) {
		this.numEst = numEst;
	}

	
	@Override
	public String toString() {
		return super.toString()+"Alumno [numEst=" + numEst + "]";
	}

	@Override
	public void saludar(Persona persona) {
		if (persona instanceof Alumno) {
			Alumno a = (Alumno) persona;
		System.out.println("Hola,soy "+a.getNombre()+" con el numero de estudiante "+a.getNumEst());
		}
		
	}

	@Override
	public void realizarAccionEspecial(Persona persona) {
		if (persona instanceof Alumno) {
			Alumno a = (Alumno) persona;
			if (a.getEdad()<18) {
				System.out.println("Hola soy menor de edad");
			} else {
				System.out.println("Hola soy mayor de edad");
			}
		}
		
	}
	
}
