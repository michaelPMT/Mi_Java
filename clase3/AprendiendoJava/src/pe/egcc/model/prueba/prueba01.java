/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.model.prueba;

import pe.egcc.model.Clase4;

/**
 *
 * @author Alumno
 */
public class prueba01 {
    public static void main(String[] args) {
        int s, d;
        Clase4 bean = new Clase4();
        s = bean.sumar(5, 8);
        d = bean.Restar(4, 3);
        System.out.println("La suma de 5 y 8 es : " + s);
        System.out.println("LA Resta de 4 y 3 son : " + d);
    }
    
}
