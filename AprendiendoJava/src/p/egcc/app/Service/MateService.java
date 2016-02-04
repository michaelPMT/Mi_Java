/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.egcc.app.Service;

/**
 *
 * @author Alumno
 */
public class MateService {
    public int promedio(int n1, int n2){
        System.out.println("Caso 1");
        int pr;
        pr = (n1 + n2)/2;
        return pr;
    }
    
    public double promedio(double n1, int n2){
        System.out.println("Caso 2");
        double pr;
        pr = (n1 + n2)/2;
        return pr;
    }
    
    public double promedio(int n1, double n2){
        System.out.println("Caso 3");
        double pr;
        pr = (n1 + n2)/2;
        return pr;
    }
    
    public double promedio(double n1, double n2){
        System.out.println("Caso 4");
        double pr;
        pr = (n1 + n2)/2;
        return pr;
    }
}
