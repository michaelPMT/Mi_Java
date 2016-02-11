/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba01;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Prueba06 {
    public static void main(String[] args) {
        List lista = new ArrayList<>();
        
        lista.add(456);
        lista.add(453.12);
        lista.add("Michael");
        lista.add(new Date());
        
        for (Object obj : lista) {
            System.out.println(obj + "");
        }
        
    }
    
}
