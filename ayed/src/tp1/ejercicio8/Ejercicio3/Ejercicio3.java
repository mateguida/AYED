package tp1.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Estudiante[] vecEstudiantes = new Estudiante[2];
		Profesor[] vecProfesores = new Profesor[3];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			//vecEstudiantes[i] = new Estudiante();
			System.out.println("Cargando estudiante" + (i+1));
			System.out.print("Nombre: ");
			vecEstudiantes[i].setNombre(s.next());
			System.out.print("Apellido: ");
			vecEstudiantes[i].setApellido(s.next());
			System.out.print("Email: ");
			vecEstudiantes[i].setEmail(s.next());
			System.out.print("Direccion: ");
			vecEstudiantes[i].setDireccion(s.next());
			System.out.print("Comision: ");
			vecEstudiantes[i].setComision(s.nextInt());
		}
		
		for(int i = 0; i < 3; i++) {
			vecProfesores[i] = new Profesor();
			System.out.println("Cargando Profesor" + (i+1));
			System.out.print("Nombre: ");
			vecProfesores[i].setNombre(s.next());
			System.out.print("Apellido: ");
			vecProfesores[i].setApellido(s.next());
			System.out.print("Email: ");
			vecProfesores[i].setEmail(s.next());
			System.out.print("Facultad: ");
			vecProfesores[i].setFacultad(s.next());
			System.out.print("Catedra: ");
			vecProfesores[i].setCatedra(s.nextInt());
		}
		
		for(int i = 0; i < 2; i++) {
			System.out.println(vecEstudiantes[i].tusDatos());
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(vecProfesores[i].tusDatos());
		}
		
		s.close();
	}

}
