
package org.unsch.proyectofinal_poo;

public class Cena extends Menu{
    private String platoPrincipal;
    private String postre;

    public Cena(String platoPrincipal, String postre, double precio, String bebida, String descripcion) {
        super(precio, bebida, descripcion);
        this.platoPrincipal = platoPrincipal;
        this.postre = postre;
    }
    
    public String getHorarioServicio(){
        return "5:30 PM - 8:30 PM";
    }
    //METODO HEREDADO
    public double calcularPrecio(){
        double precioFinal = getPrecio();
        return precioFinal;
        
    }
    
}
