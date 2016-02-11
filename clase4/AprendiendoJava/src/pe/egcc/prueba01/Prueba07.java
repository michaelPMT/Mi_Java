/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Prueba07 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        lista.add("Sistemas Uni");
        lista.add("No saben mucho");
        lista.add("No enseñan bien");
        lista.add("Se dedican en facebook");
        
        for (String nombre : lista) {
            System.out.println(nombre +"");
        }
        
    }
}
