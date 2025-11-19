
package org.unsch.proyectofinal_poo.menu;

import org.unsch.proyectofinal_poo.menu.Menu;

public class MenuEspecial extends Menu{
    private String actividad;
    private String segundo;
    private String sopa;
    private String postre;

    public MenuEspecial(String actividad, String Segundo, String sopa, String postre, double precio, String bebida, String descripcion, int calorias, int carbohidratos, int proteinas, int grasas) {
        super(precio, bebida, descripcion, calorias, carbohidratos, proteinas, grasas);
        this.actividad = actividad;
        this.segundo = Segundo;
        this.sopa = sopa;
        this.postre = postre;
    }
  
    public String getHoarioServicio(){
        return "11:30 AM - 2:00 PM";
    }
    
     @Override
    public void mostrarMenuCompleto() {
        System.out.println("MENU ESPECIAL");
        System.out.println("=" .repeat(40));
        System.out.println("Actividad: " + actividad);
        System.out.println("Sopa: " + sopa);
        System.out.println("Segundo: " + segundo);
        System.out.println("Postre: " + postre);
        System.out.println("Bebida: " + getBebida());
        System.out.println("Descripcion: " + getDescripcion());
        System.out.println("Precio: S/." + getPrecio());
        mostrarInformacionNutricional();
        System.out.println("=" .repeat(40));
    }
    
    //GETTERS

    public String getActividad() {
        return actividad;
    }

    public String getSegundo() {
        return segundo;
    }

    public String getSopa() {
        return sopa;
    }

    public String getPostre() {
        return postre;
    }
    //SETTERS

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public void setSopa(String sopa) {
        this.sopa = sopa;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }
    
}
