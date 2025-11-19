
package org.unsch.proyectofinal_poo.menu;

import org.unsch.proyectofinal_poo.menu.Menu;

public class Desayuno extends Menu{
    private String acompaniamento;
    private String fruta;

    //CONSTRUCTOR
    public Desayuno(String acompaniamento, String fruta, double precio, String bebida, String descripcion, int calorias, int carbohidratos, int proteinas, int grasas) {
        super(precio, bebida, descripcion, calorias, carbohidratos, proteinas, grasas);
        this.acompaniamento = acompaniamento;
        this.fruta = fruta;
    }
    
    public String getHorarioServicio(){
        return "6:30 AM - 8:30 AM";
    }
     @Override
    public void mostrarMenuCompleto() {
        System.out.println("DESAYUNO");
        System.out.println("=" .repeat(40));
        System.out.println("Bebida: " + getBebida());
        System.out.println("Acompanamiento: " + acompaniamento);
        System.out.println("Fruta: " + fruta);
        System.out.println("Descripcion: " + getDescripcion());
        System.out.println("Precio: S/." + getPrecio());
        mostrarInformacionNutricional();
        System.out.println("=" .repeat(40));
    }
    //GETTERS específicos

    public String getAcompaniamento() {
        return acompaniamento;
    }

    public String getFruta() {
        return fruta;
    }
    //SETTERS

    public void setAcompaniamento(String acompaniamento) {
        this.acompaniamento = acompaniamento;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }
    

       
}
