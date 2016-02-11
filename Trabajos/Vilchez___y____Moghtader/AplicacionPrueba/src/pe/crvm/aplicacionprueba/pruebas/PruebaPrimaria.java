

package pe.crvm.aplicacionprueba.pruebas;

import pe.crvm.aplicacionprueba.service.MatriculaPrimaria;

/**
 *
 * @author Carlos
 */
public class PruebaPrimaria {
    public static void main(String[] args) {
           MatriculaPrimaria prim = new MatriculaPrimaria("Gerson", "Moghtader", 73046001, "09/02/2016", "Las Magnolias 123",
                   4591746, "4to", "B");
           
           System.out.println(prim.toString());
    }
}
