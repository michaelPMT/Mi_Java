/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.model;

/**
 *
 * @author Alumno
 */
public class Clase1 {
    
    protected final String Ciudad = "Lima";
    
    public Clase1(){
        System.out.println("Hola Javeros De SistemasUNI");
        System.out.println("Promo");
    }
    
    public Clase1(String nombre){
        System.out.println("Hola amiga(o) " + nombre);
        System.out.println("Nos vemos en Java ");
    }
    
    public int sumar(int n1, int n2){
        int value;
        value = n1+ n2;
        return value;
    }
    
    public int Restar(int n1, int n2){
        int value;
        value = n1- n2;
        return value;
    }
}
