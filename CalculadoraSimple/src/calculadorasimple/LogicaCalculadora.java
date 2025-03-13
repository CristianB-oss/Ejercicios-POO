
package calculadorasimple;
import java.util.Scanner;

public class LogicaCalculadora {
    
  private Calculadora  logica;
  private Scanner sc ;
       


public LogicaCalculadora(Calculadora logica){

this.logica = logica;
this.sc= new Scanner(System.in);

}

 public void iniciarCalculadora() {
        char continuar = 's';
        while (continuar == 's') {
            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();
            System.out.print("Ingrese la operación (+, -, *, /): ");
            char operacion = sc.next().charAt(0);

            double resultado = 0;
            if (operacion == '+') {
                resultado = logica.sumar(num1, num2);
            } 
            else if (operacion == '-') {
                resultado = logica.restar(num1, num2);
            } 
            else if (operacion == '*') {
                resultado = logica.multiplicar(num1, num2);
            } 
            else if (operacion == '/') {
             
            if (num2 == 0) {
             System.out.println("No se puede dividir por cero.");
             continue; 
                }
                resultado = logica.dividir(num1, num2);
            } else {
                System.out.println("Operación no válida.");
                continue;
            }

            System.out.println("El resultado es: " + resultado);
            System.out.print("¿Desea realizar otra operación? (s/n): ");
            continuar = sc.next().charAt(0);
        }

        System.out.println("Gracias por usar la calculadora.");
    }
}


