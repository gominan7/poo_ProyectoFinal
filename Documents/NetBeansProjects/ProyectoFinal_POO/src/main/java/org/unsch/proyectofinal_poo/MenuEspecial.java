
package org.unsch.proyectofinal_poo;

public class MenuEspecial extends Menu{
    private String motivoEspecial;
    private String Segundo;
    private String sopa;
    private String postre;

    public MenuEspecial(String motivoEspecial, String Segundo, String sopa, String postre, double precio, String bebida, String descripcion) {
        super(precio, bebida, descripcion);
        this.motivoEspecial = motivoEspecial;
        this.Segundo = Segundo;
        this.sopa = sopa;
        this.postre = postre;
    }
    
    public String getHoarioServicio(){
        return "11:30 AM - 2:00 PM";
    }
    
    @Override
    public double calcularPrecio(){
        return getPrecio();
    }
}
