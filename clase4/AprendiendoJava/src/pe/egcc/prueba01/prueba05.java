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
public class prueba05 {
    public static void main(String[] args) {
        int[] datos = {10,78,36,25,78,65,14,95};
        
        for (int dato : datos) {
            System.out.println( dato +" ");
        }
        System.out.println("-----");
        
        Arrays.sort(datos);
        for (int dato : datos) {
            System.out.println(dato +" ");
        }
        System.out.println("");
    }
}
