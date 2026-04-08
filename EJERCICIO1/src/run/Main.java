package run;

import models.Carrera;
import models.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Estudiante> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n ---Menú---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Nombre de la carrera: ");
                    String nombreCarrera = sc.nextLine();

                    System.out.print("Duración (años): ");
                    int duracion = sc.nextInt();

                    System.out.print("Promedio: ");
                    float promedio = sc.nextFloat();
                    sc.nextLine();

                    Carrera carrera = new Carrera(nombreCarrera, duracion);
                    Estudiante estudiante = new Estudiante(codigo, nombre, promedio, carrera);

                    lista.add(estudiante);

                    System.out.println("Estudiante registrado.");
                    break;


    }
}
