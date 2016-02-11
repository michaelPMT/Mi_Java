

package pe.crvm.aplicacionprueba.service;

/**
 *
 * @author Carlos
 */
public abstract class MatriculaAbstract {
    
    protected String Nombre;
    protected String Apellidos;
    protected int DNI;
    protected String Fecha;
    protected String Direccion;
    protected int Telefono;
    protected String Grado;
    protected String Seccion;

    public MatriculaAbstract(String Nombre, String Apellidos, int DNI, String Fecha, String Direccion, int Telefono, String Grado, String Seccion) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.Fecha = Fecha;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Grado = Grado;
        this.Seccion = Seccion;
    }
    
    
    
    public final double COSTO_PRIMARIA= 200;
    protected final double COSTO_SECUNDARIA= 300;
    
    protected final double DSC_PRIMARIA=0.2;
    protected final double DSC_SECUNDARIA=0.1;
    
    protected abstract double Pago();
    protected abstract double Descuento();
    protected abstract double PagoTotal();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }
    
    
    
    
    
}
