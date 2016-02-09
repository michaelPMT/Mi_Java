/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.egcc.app.principal.pruba01;

import p.egcc.app.principal.dto.PagoDto;
import p.egcc.app.service.service;

/**
 *
 * @author Alumno
 */
public class pruba {
    public static void main(String[] args) {
        //Dato
        PagoDto dto = new PagoDto();
        dto.setHorasDia(6);
        dto.setDias(20);
        dto.setPagoHora(140.2);
        //Proceso
        service servi = new service();
        servi.Procesar(dto);
        //Reporte
        System.out.println("Ingresos " + dto.getIngresos());
        System.out.println("Renta " + dto.getRenta());
        System.out.println("Neto " + dto.getNeto()); 
    }
    
}
