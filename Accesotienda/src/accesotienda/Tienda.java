
package accesotienda;


public class Tienda {
  
 private boolean horarioAtencion;

 public Tienda(boolean horarioAtencion) {
 this.horarioAtencion = horarioAtencion;
   }

 public boolean permitirAcceso(Cliente cliente) {
 return (cliente.tieneMembresia() && horarioAtencion) || cliente.esEmpleado();
   }
}


