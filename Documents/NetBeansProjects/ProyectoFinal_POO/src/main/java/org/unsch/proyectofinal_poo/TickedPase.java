
package org.unsch.proyectofinal_poo;

public class TickedPase {
    private int idTickedPase;
    private String tipo; //pase o ticked
    private double precio;
    private int duracionDias;
    private int cantidad; 

    public TickedPase(int idTickedPase, String tipo, double precio, int duracionDias, int cantidad) {
        this.idTickedPase = idTickedPase;
        this.tipo = tipo;
        this.precio = precio;
        this.duracionDias = duracionDias;
        this.cantidad = cantidad;
    }
    
    //GETTERS

    public int getIdTickedPase() {
        return idTickedPase;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public int getCantidad() {
        return cantidad;
    }
    //SETTERS

    public void setIdTickedPase(int idTickedPase) {
        this.idTickedPase = idTickedPase;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //METODOS 
    public void registraTickedPase(){
        
    }
    
    public double calcularCostoPorDia(){
        return cantidad*precio;
    }
    
    public void mostrarInformacion(){
        
    }
}

