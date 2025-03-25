
package accesotienda;

import java.util.Scanner;


public class Accesotienda {

   
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        Tienda tienda = new Tienda(true); 

        while (true) {
            System.out.println("\nNuevo intento de acceso:");

            System.out.print("¿El cliente tiene membresía? (true/false): ");
            boolean tieneMembresia = sc.nextBoolean();

            System.out.print("¿El cliente es empleado? (true/false): ");
            boolean esEmpleado = sc.nextBoolean();

            Cliente cliente = new Cliente(tieneMembresia, esEmpleado);
            boolean acceso = tienda.permitirAcceso(cliente);

            if (acceso) {
                System.out.println("Acceso permitido. ¡Bienvenido!");
            } else {
                System.out.println("Acceso denegado.");
            }

            System.out.print("¿Desea realizar otra prueba? (true/false): ");
            boolean continuar = sc.nextBoolean();
            if (!continuar) {
                break;
            }
        }

        sc.close();
        System.out.println("Sistema de control de acceso finalizado.");
    }
    }
    

