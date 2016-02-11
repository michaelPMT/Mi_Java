/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entity.entity;

/**
 *
 * @author Patrick
 */
public class modelo {
    private entity nota = new entity();

    public modelo() {
    }
    
    public void Registro(entity n){
        nota = n;
    }
    
    public entity Consultar(){
        return nota;
    }
    
    public void promedio(double nota1 ,double nota2,double nota3){
        nota.setPromedio((nota1+nota2+nota3)/3);
    }
    public void promedio(double nota1,double nota2,double nota3,double nota4){
        if(nota1<=nota2 && nota1<=nota3 && nota1<=nota4){
            nota.setPromedio((nota2+nota3+nota4)/3);
         }
        if(nota2<=nota1 && nota2<=nota3 && nota2<=nota4){
            nota.setPromedio((nota1+nota3+nota4)/3);
        }
        if(nota3<=nota1 && nota3<=nota2 && nota3<=nota4){
            nota.setPromedio((nota1+nota2+nota4)/3);
        }
        if(nota4<=nota1 && nota4<=nota2 && nota4<=nota3){
            nota.setPromedio((nota1+nota2+nota3)/3);
        }
    }
    
    
    public void promedio(double nota1,double nota2,double nota3,double nota4,double nota5){
       if(nota1<=nota2 && nota1<=nota3 && nota1<=nota4 && nota1<=nota5){
            nota.setPromedio((nota2+nota3+nota4+nota5)/4);
        }
        if(nota2<=nota1 && nota2<=nota3 && nota2<=nota4 && nota2<=nota5){
            nota.setPromedio((nota1+nota3+nota4+nota5)/4);
        }
        if(nota3<=nota1 && nota3<=nota2 && nota3<=nota4 && nota3<=nota5){
            nota.setPromedio((nota1+nota2+nota4+nota5)/4);
        }
        if(nota4<=nota1 && nota4<=nota2 && nota4<=nota3 && nota4<=nota5){
            nota.setPromedio((nota1+nota2+nota3+nota5)/4);
        }
        if(nota5<=nota1 && nota5<=nota2 && nota5<=nota3 && nota5<=nota4){
            nota.setPromedio((nota1+nota2+nota3+nota4)/4);
        }
        
    }
    public void promedio(double nota1,double nota2,double nota3,double nota4,double nota5,double nota6){
        if(nota1<=nota2 && nota1<=nota3 && nota1<=nota4 && nota1<=nota5 && nota1<=nota6){
            nota.setPromedio((nota2+nota3+nota4+nota5+nota6)/5);
        }
        if(nota2<=nota1 && nota2<=nota3 && nota2<=nota4 && nota2<=nota5 && nota2<=nota6){
            nota.setPromedio((nota1+nota3+nota4+nota5+nota6)/5);
        }
        if(nota3<=nota1 && nota3<=nota2 && nota3<=nota4 && nota3<=nota5 && nota3<=nota6){
            nota.setPromedio((nota1+nota2+nota4+nota5+nota6)/5);
        }
        if(nota4<=nota1 && nota4<=nota2 && nota4<=nota3 && nota4<=nota5 && nota4<=nota6){
            nota.setPromedio((nota1+nota2+nota3+nota5+nota6)/5);
        }
        if(nota5<=nota1 && nota5<=nota2 && nota5<=nota3 && nota5<=nota4 && nota5<=nota6){
            nota.setPromedio((nota1+nota2+nota3+nota4+nota6)/5);
        }
        if(nota6<=nota1 && nota6<=nota2 && nota6<=nota3 && nota6<=nota4 && nota6<=nota5){
            nota.setPromedio((nota1+nota2+nota3+nota4+nota5)/5);
        }
    }
    
}
