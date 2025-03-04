
package fizzbuzz;

import java.util.Scanner;


public class Fizzbuzz {

  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero inicial");
        int inicio = sc.nextInt();
        System.out.println("ingrese el numero final");
        int fin = sc.nextInt();
        
    ClaseFizzbuzz fizbuz = new ClaseFizzbuzz();
    fizbuz.numeros(inicio, fin);
    
   
        
    }
  
}
