
package reservascine;


public class Asientos {
   private static int numeroAsiento;
    private static boolean reservado;
    
    
    public Asientos(int danumeroAsiento, boolean dareservado){
        
        Asientos.numeroAsiento = danumeroAsiento;
        Asientos.reservado = dareservado;
        
    }
    
    public void reservar(){
        Usuario metoreserva = new Usuario("cristianb@gmail.com", "446545");
        
        metoreserva.reservarAsiento();
        
        
    }
    
    public void liberar(){
        
    }
    
}
