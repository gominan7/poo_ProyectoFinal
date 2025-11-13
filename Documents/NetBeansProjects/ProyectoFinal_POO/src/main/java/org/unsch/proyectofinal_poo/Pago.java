
package org.unsch.proyectofinal_poo;

public class Pago {
    private String idPago;
    private double monto;
    private String fecha;
    private String metodoPago;
//CONSTRUCTOR
    public Pago(String idPago, double monto, String fecha, String metodoPago) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
    }
    //GETTERS

    public String getIdPago() {
        return idPago;
    }

    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
    
    //SETTERS

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    //METODOS
    public void registrarPago(){
        
    }
    
    public void confirmarPago(){
        
    }
    public void generarRecibo(){
        
    }
    
}
