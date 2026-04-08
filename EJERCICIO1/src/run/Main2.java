package run;

import models.Cliente;
import models.Cuenta;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CREACIÓN DE CUENTA ===");

        System.out.print("Ingrese identificación: ");
        String id = sc.nextLine();

        System.out.print("Ingrese nombres: ");
        String nombres = sc.nextLine();

        System.out.print("Ingrese apellidos: ");
        String apellidos = sc.nextLine();

        Cliente cliente = new Cliente(id, nombres, apellidos);

        System.out.print("Ingrese número de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.print("Ingrese saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        Cuenta cuenta = new Cuenta(numeroCuenta,saldoInicial, cliente);

        ejecutarMenu(cuenta, sc);
    }

    public static void ejecutarMenu(Cuenta cuenta, Scanner sc) {
    }
    }
