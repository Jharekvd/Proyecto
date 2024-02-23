package Insti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Persona> list = new ArrayList<Persona>();
		int op = 4;
		do {
			System.out.println("1)Introduce un Alumno");
			System.out.println("2)Introduce un Profesor");
			System.out.println("3)Mostrar todos los alumnos y profesores");
			System.out.println("4)Salir del programa");
			op = sc.nextInt();
			switch (op) {
			case 1:
				Persona a = new Alumno();
				if (a instanceof Alumno) {
					Alumno a1 = (Alumno) a;
					System.out.println("Introduce el nombre ");
					a1.setNombre(sc.next());
					System.out.println("Introduce la edad ");
					a1.setEdad(sc.nextInt());
					System.out.println("Introduce el numero Identificativo ");
					a1.setNumEst(sc.nextInt());
					list.add(a);
					a1.saludar(a);
					a1.realizarAccionEspecial(a);
				}
				break;
			case 2:
				Persona p = new Profesor();
				if (p instanceof Profesor) {
					Profesor p1 = (Profesor) p;
					System.out.println("Introduce el nombre ");
					p1.setNombre(sc.next());
					System.out.println("Introduce la edad ");
					p1.setEdad(sc.nextInt());
					System.out.println("Materia que realiza");
					p1.setMateria(sc.next());
					list.add(p);
					p1.saludar(p);
					p1.realizarAccionEspecial(p);
				}
				break;
			case 3:
				for (Persona persona : list) {
					System.out.println(persona.toString());
				}
				break;
			default:
				System.out.println("No hay un metodo asignado al numero introducido");
				break;
			}
		} while (op != 4);
		sc.close();
	}

}
