/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba01;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alumno
 */
public class Prueba08 {
    public static void main(String[] args) {
        
        Map<String,Object> datos = new HashMap<>();
        
        datos.put("001", "Aun no enseñan bien");
        datos.put("002", "Mis espectativas cambiaron");
        datos.put("003", "Creo que nunca volveria");
        datos.put("004", "En especial por el profesor coronel");
        
        for (String key : datos.keySet()) {
            System.out.println(key + " " + datos.get(key));
        }
        System.out.println("---------------------");
        datos.put("002", "Aun no enseñan bien");
        for (String key : datos.keySet()) {
            System.out.println(key + " " + datos.get(key));
        }
    }
    
}
