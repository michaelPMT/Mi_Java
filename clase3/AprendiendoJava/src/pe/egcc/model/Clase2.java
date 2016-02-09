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
public class Clase2 extends Clase1{
    
    protected final String Ciudad = "Chiclayo";

    public Clase2() {
        super("Alejandra");
    }

    @Override
    public int sumar(int n1, int n2) {
        System.out.println("Ciudad OLD: " + Ciudad);
        System.out.println("Ciudad NEW: " + super.Ciudad);
        int value;
        value = (n1 + n2)/(n1 - n2);
        return value;
    }
    
    public int potencia(int b, int e){
        int p = 1;
        for (int i = 1; i < e; i++) {
            p *= b;
        }
        return p;
    }
    
    
    }

