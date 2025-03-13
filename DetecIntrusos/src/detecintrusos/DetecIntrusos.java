
package detecintrusos;

import java.util.Scanner;

public class DetecIntrusos {

   
    public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    SensorMovimiento sensor1 = new SensorMovimiento();
    SensorMovimiento sensor2 = new SensorMovimiento();
    SensorMovimiento sensor3 = new SensorMovimiento();
    Alarma alarma = new Alarma();
    boolean esDeNoche = true; 
        
    while (true) {
    System.out.println("Menú:");
    System.out.println("1. Activar Alarma");
    System.out.println("2. Desactivar Alarma");
    System.out.println("3. Simular Sensores");
    System.out.println("4. Salir");
    System.out.print("Seleccione una opción: ");
            
    int opcion = sc.nextInt();
            
     switch (opcion) {
     case 1:
     alarma.activar();
     break;
     case 2:
     alarma.desactivar();
     break;
     
     case 3:
     if (alarma.estaActivada()) {
     int detecciones = 0;
     if (sensor1.detectarMovimiento()) detecciones++;
     if (sensor2.detectarMovimiento()) detecciones++;
     if (sensor3.detectarMovimiento()) detecciones++;
                        
     if (detecciones >= 2 && esDeNoche) {
      System.out.println("¡Intruso detectado! Alarma activada.");
      } 
     else {
     System.out.println("No se detectó intrusión.");
      }
      } 
     else {
      System.out.println("La alarma está desactivada.");
      }
      break;
      
     case 4:
     System.out.println("Saliendo...");
     sc.close();
     return;
     default:
     System.out.println("Opción no válida.");
            }
        }
    }
        
    }
    

