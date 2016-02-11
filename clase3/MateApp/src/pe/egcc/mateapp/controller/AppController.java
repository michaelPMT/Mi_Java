/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.mateapp.controller;

import pe.egcc.mateapp.service.MyMath;

/**
 *
 * @author Alumno
 */
public class AppController {

    public long factorial(int n) {
       return MyMath.factorial(n);
    }
    
    public int mcd(int n1, int n2) {
        return MyMath.mcd(n1, n2);
    }
    
    public int mcm(int n1, int n2){
        return MyMath.mcm(n1, n2);
    }
    
    public String fibonacci(int n){
        return MyMath.fibonacci(n);
    }
    
    public boolean primo(int n1){
        return MyMath.primo(n1);
    }
}
