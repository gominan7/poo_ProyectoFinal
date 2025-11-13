
package org.unsch.proyectofinal_poo;

public class Almuerzo extends Menu{
    private String segundo;
    private String sopa;
    private String Postre;
    
    //CONSTRUCTOR

    public Almuerzo(String segundo, String sopa, String Postre, double precio, String bebida, String descripcion) {
        super(precio, bebida, descripcion);
        this.segundo = segundo;
        this.sopa = sopa;
        this.Postre = Postre;
    }
    public String getHorarioServicio(){
        return "11:30 AM - 2:00 PM";
    }
    
    @Override
    public double calcularPrecio(){
        double precioFinal = getPrecio();
        return precioFinal;
    }
    
}
