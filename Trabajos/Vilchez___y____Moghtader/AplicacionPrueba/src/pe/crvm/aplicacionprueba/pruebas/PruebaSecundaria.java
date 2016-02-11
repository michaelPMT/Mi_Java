

package pe.crvm.aplicacionprueba.pruebas;


import pe.crvm.aplicacionprueba.service.MatriculaSecundaria;

/**
 *
 * @author Carlos
 */
public class PruebaSecundaria {
    public static void main(String[] args) {
           MatriculaSecundaria secun = new MatriculaSecundaria("Carlos", "Vilchez Malasquez", 73035009, "10/02/2016", "Los Chasquis 1118",
                   4588900, "5to", "B");
           
           System.out.println(secun.toString());
    }
}
