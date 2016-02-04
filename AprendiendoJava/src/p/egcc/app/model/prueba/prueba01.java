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
public class prueba01 {
    
    public static void main(String[] args) {
        producto prod1 = new producto();
        
        mostar(prod1);
        prod1.setNombre("Laptop");
        prod1.setPrecio(5000);
        System.out.println("--------------------");
        
        
        mostar(prod1);
    }

    private static void mostar(producto prod1){
        System.out.println("Nombre: " + prod1.getNombre());
        System.out.println("Precio: " + prod1.getPrecio());
        System.out.println("Stock: " + prod1.getStock());
        System.out.println("Activo: " + prod1.isActivo());
    }
}
