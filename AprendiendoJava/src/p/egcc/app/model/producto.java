/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.egcc.app.model;

/**
 *
 * @author Alumno
 */
public class producto {
    private String nombre;
    private int stock;
    private double precio;
    private boolean activo;

    public producto(){
        this.nombre = "Curso de Java";
        this.precio = 300;
        this.stock = 20;
        this.activo = true;
        System.out.println("Objeto Creado.");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.err.println("Chao objeto.");
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
