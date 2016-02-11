/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entity.entity;
import Modelo.modelo;

/**
 *
 * @author Patrick
 */
public class controlador {
    static modelo not = new modelo();
    
    public static void Registro(entity n){
        not.Registro(n);
    }
    
    public static entity Consultas(){
        return not.Consultar();
    }    
    public static void Promedio3(double no1, double no2, double no3){
        not.promedio(no1, no2, no3);
    }
    
    public static void Promedio4(double no1, double no2, double no3, double no4){
        not.promedio(no1, no2, no3, no4);
    }
    
    public static void Promedio5(double no1, double no2, double no3, double no4,double no5){
        not.promedio(no1, no2, no3, no4, no5);
    }
    
    public static void Promedio6(double no1, double no2, double no3, double no4,double no5, double no6){
        not.promedio(no1, no2, no3, no4, no5, no6);
    }
}
