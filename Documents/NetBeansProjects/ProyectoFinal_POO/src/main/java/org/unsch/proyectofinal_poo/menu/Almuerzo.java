
package org.unsch.proyectofinal_poo.menu;

import org.unsch.proyectofinal_poo.menu.Menu;

public class Almuerzo extends Menu{
    private String segundo;
    private String sopa;
    private String postre;
    
    //CONSTRUCTOR
    public Almuerzo(String segundo, String sopa, String Postre, double precio, String bebida, String descripcion, int calorias, int carbohidratos, int proteinas, int grasas) {
        super(precio, bebida, descripcion, calorias, carbohidratos, proteinas, grasas);
        this.segundo = segundo;
        this.sopa = sopa;
        this.postre = Postre;
    }

    public String getHorarioServicio(){
        return "11:30 AM - 2:00 PM";
    }
     @Override
    public void mostrarMenuCompleto() {
        System.out.println("ALMUERZO");
        System.out.println("=" .repeat(40));
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
