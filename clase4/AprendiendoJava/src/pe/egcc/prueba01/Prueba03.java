/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba01;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Alumno
 */
public class Prueba03 {
    public static void main(String[] args) {
        //Con Landan
        int[] notas = {18,15,6,7,12,14,16};
        
        IntStream datos = Arrays.stream(notas);
        System.out.println("Cantidad: " + Arrays.stream(notas).count());
        System.out.println("Mayor: " + Arrays.stream(notas).max());
        System.out.println("Menor: " + Arrays.stream(notas).min());
        System.out.println("Promedio: " + Arrays.stream(notas).average());
        System.out.println("Lista: " + Arrays.stream(notas).toString());
        
    }
}
