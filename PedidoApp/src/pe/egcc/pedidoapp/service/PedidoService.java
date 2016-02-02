/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pedidoapp.service;

/**
 *
 * @author Alumno
 */
public class PedidoService {
    private static double igv = 0.18;
    public double CalcularImporte(double importe){
        double impuesto;
        impuesto = importe * igv;
        return impuesto;
    }
    public double Calculartotal(double importe){
        double total;
        total = importe + CalcularImporte(importe);
        return total;
    }
}
