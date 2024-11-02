/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();

        boolean salir = false;
        
        while (!salir) {
            System.out.println("\nSistema de Gestión de Empleados\n Empresa Juan Cabrera ");
            System.out.println("Presione1- Agregar Empleado");
            System.out.println("Presione2-Mostrar Empleados");
            System.out.println("Presione3- Salir");
            System.out.print("Indica la opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    
                    System.out.print("Edad del empleado: ");
                    int edad = scanner.nextInt();
                    
                    System.out.print("Salario del empleado: ");
                    double salario = scanner.nextDouble();
                    
                    Empleado empleado = new Empleado(nombre, edad, salario);
                    gestor.agregarEmpleado(empleado);
                    break;
                
                case 2:
                    gestor.mostrarEmpleados();
                    break;
                
                case 3:
                    System.out.println("Gracias por preferirnos");
                    salir = true;
                    break;
                
                default:
                    System.out.println("Esa opción no figura en el sistema.");
            }
        }
        
        scanner.close();
    }
}

