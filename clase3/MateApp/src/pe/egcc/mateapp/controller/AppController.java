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
    
}
