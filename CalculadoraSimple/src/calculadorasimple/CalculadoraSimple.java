
package calculadorasimple;

import java.util.Scanner;

public class CalculadoraSimple {

    public static void main(String[] args) {
        Calculadora logica = new Calculadora();
        LogicaCalculadora calculadora1 = new LogicaCalculadora(logica);
        calculadora1.iniciarCalculadora();
    }
    
}

  
    

