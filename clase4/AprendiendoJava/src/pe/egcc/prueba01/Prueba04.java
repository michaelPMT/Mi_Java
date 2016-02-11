/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba01;

/**
 *
 * @author Alumno
 */
public class Prueba04 {
    public static void main(String[] args) {
        /**
         * Por ser String una clase se dice que es un arreglo
         * de apuntadore que inicialmente apuntan a null.
         */
        String[] lista = new String[5];
        
        for (String string : lista) {
            System.out.println("cad");
        }
        
        lista[2] = "Gustavo";
        lista[3] = "Claudia";
                
        }
}
