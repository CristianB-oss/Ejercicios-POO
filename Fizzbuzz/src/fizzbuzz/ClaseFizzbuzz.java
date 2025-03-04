package fizzbuzz;

public class ClaseFizzbuzz {
 
    
 public String resultado(int numero) {
    if (numero % 3 == 0 && numero % 5 == 0) {
      return "FizzBuzz";
    } else if (numero % 3 == 0) {
      return "Fizz";
    } else if (numero % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(numero);
    }
  }
      
    
public void numeros(int inicio, int fin){
   
    for (int i = inicio; i <= fin; i++) {
        System.out.println(resultado(i));
    }  
}
        
        
        
}
