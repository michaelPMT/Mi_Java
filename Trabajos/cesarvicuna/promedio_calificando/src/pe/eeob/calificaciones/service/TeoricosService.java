/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.calificaciones.service;

import pe.eeob.calificaciones.dto.dtoNotas;

/**
 *
 * @author Cesar Vicuña
 */
public class TeoricosService extends ConsolidadoAbstract{

    @Override
    public float Ponderado(dtoNotas dto1) {
        float nponderado;
        //proceso
        CriteriosEvaluacion c1 = new CriteriosEvaluacion();

        nponderado = ( c1.CritTeo[0]*dto1.getNeparcial() +
                        c1.CritTeo[1]*dto1.getNefinal() + 
                        c1.CritTeo[2]*dto1.getNproyecto() ) / 
                        c1.suma(c1.CritTeo[0], c1.CritTeo[1], c1.CritTeo[2]);
        //reporte
        return nponderado;
    }
    
}
