
package reservascine;

import java.util.Scanner;


public class Reservascine {

  
    public static void main(String[] args) {
      
     Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        Sala resolver = new Sala(1, 10);
        
        do{
       System.out.println("Bienvenido al Cinemark");
            System.out.println("La sala cuenta con 10 asientos");
       System.out.println("1. apartar asientos");
       System.out.println("2. Salir");
       opcion = sc.nextInt();
        
        switch (opcion) {
         case 1:
         resolver.agregarAsientos();
         break;
         case 2:
         System.out.println("Deteniendo programa");
         break;
         default:
         System.out.println("opcion incorrecta");
         break;
        }
        } while(opcion != 2);
        
     
    }
    
    }

    

