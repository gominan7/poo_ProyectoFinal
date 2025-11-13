
package org.unsch.proyectofinal_poo;

public abstract class Menu {
    private double precio;
    private String bebida;
    private String descripcion;

    public Menu(double precio, String bebida, String descripcion) {
        this.precio = precio;
        this.bebida = bebida;
        this.descripcion = descripcion;
    }
    //para calcular el precio del menu
    public abstract double calcularPrecio();


    //GETTERS

    public double getPrecio() {
        return precio;
    }

    public String getBebida() {
        return bebida;
    }
    //SETTERS

    public void setPrecio(double precio) {
        if (precio < 0){
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        
        this.precio = precio;
    }

    public void setBebida(String bebida) {
        if (bebida == null || bebida.trim().isEmpty()) {
            throw new IllegalArgumentException("La bebida no puede estar vacía");
        }
        
        this.bebida = bebida.trim();
    }
    
    //DIVISION DE RESPONSABILIDAD
}
