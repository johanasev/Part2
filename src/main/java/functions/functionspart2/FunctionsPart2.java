/*
Segunda parte:

- Crear una clase coche.
- Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
- Una función que incremente el número de puertas que tiene el coche.
- Crear un objeto miCoche en el main y añadir una puerta.
- Mostrar el número de puertas que tiene el objeto.

* @author Johanasev
 */

package functions.functionspart2;


public class FunctionsPart2 {

    public static void main(String[] args) {
        
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
       
        System.out.println(miCoche.puertas);
    }
    
        public static class Coche{
        public int puertas =0;
        
        public void AgregarPuerta(){
            this.puertas++;
            
        }
    }
}
