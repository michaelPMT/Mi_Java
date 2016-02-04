/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.egcc.app.model.prueba;

import p.egcc.app.model.producto;

/**
 *
 * @author Alumno
 */
public class prueba04 {
    public static void main(String[] args) {
        producto prod1 = new producto();
        
        
          
        
    mostrar(prod1);   
    }
    producto prod1 = new producto("Televisor", 100, 3567.34, true);
    
    private static void mostrar(producto prod1) {
        System.out.println("Nombre: " + prod1.getNombre());
        System.out.println("Precio: " + prod1.getPrecio());
        System.out.println("Stock: " + prod1.getStock());
        System.out.println("Activo: " + prod1.isActivo());
        System.out.println(""+ prod1);
    }
              
        
}
