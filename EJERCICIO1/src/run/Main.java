package run;

import models.Carrera;
import models.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Estudiante> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n ----- MENÚ -----");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir del sistema");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el código del estudiante: ");
                    String codigo = sc.nextLine();

                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese el nombre de la carrera: ");
                    String nombreCarrera = sc.nextLine();

                    System.out.print("Ingrese la duración de la carrera en años: ");
                    int duracion = sc.nextInt();

                    System.out.print("Ingrese el promedio: ");
                    float promedio = sc.nextFloat();
                    sc.nextLine();

                    Carrera carrera = new Carrera(nombreCarrera, duracion);
                    Estudiante estudiante = new Estudiante(codigo, nombre, promedio, carrera);
                    lista.add(estudiante);
                    System.out.println("Estudiante registrado con éxito!");
                    break;
                case 2:
                    int aprobados = 0;
                    int reprobados = 0;

                    for (Estudiante e : lista) {
                        System.out.println("\nCódigo: " + e.getCodigo());
                        System.out.println("Nombre: " + e.getNombre());
                        System.out.println("Carrera: " + e.getCarrera().getNombre());
                        System.out.println("Promedio: " + e.getPromedio());

                        if (e.aprobar()) {
                            System.out.println("El estudiante ha aprobado");
                            aprobados++;
                        } else {
                            System.out.println("El estudiante ha reprobado");
                            reprobados++;
                        }
                    }
                    System.out.println("\nTotal aprobados: " + aprobados);
                    System.out.println("Total reprobados: " + reprobados);
                    break;
                case 3:
                    System.out.println("Ha salido del sistema!");
                    break;
                default:
                    System.out.println("La opción ingresada es inválida!");
            }
        } while (opcion != 3);
        sc.close();
    }
}


