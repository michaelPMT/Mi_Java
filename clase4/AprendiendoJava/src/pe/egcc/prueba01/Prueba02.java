/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba01;

import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class Prueba02 {
    public static void main(String[] args) {
        
        /**
         * Arreglo de tipo primitivo.
         * El valor por defecto es 0.
         */
        int notas[];
        notas = new int[5];
        
        //Recorrido indexado
        
        for (int i = 0; i < notas.length; i++) {
            int nota = notas[i];
            System.out.println(""+ nota);
        }
        System.out.println("------------------");
        
        notas[1] = notas[3]/3;
        //Recorrido
        Arrays.stream(notas).forEach(n -> System.out.println(n));
        System.out.println("-------------");
        
               
    }
    
}
