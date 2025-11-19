
package org.unsch.proyectofinal_poo.menu;

import org.unsch.proyectofinal_poo.menu.Menu;

public class Cena extends Menu{
    private String platoPrincipal;
    private String postre;

    //Constructor

    public Cena(String platoPrincipal, String postre, double precio, String bebida, String descripcion, int calorias, int carbohidratos, int proteinas, int grasas) {
        super(precio, bebida, descripcion, calorias, carbohidratos, proteinas, grasas);
        this.platoPrincipal = platoPrincipal;
        this.postre = postre;
    }    
    public String getHorarioServicio(){
        return "5:30 PM - 8:30 PM";
    }
    //METODO HEREDADO
     @Override
    public void mostrarMenuCompleto() {
        System.out.println("CENA");
        System.out.println("=" .repeat(40));
        System.out.println("Plato Principal: " + platoPrincipal);
        System.out.println("Postre: " + postre);
        System.out.println("Bebida: " + getBebida());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Precio: S/." + getPrecio());
        mostrarInformacionNutricional();
        System.out.println("=" .repeat(40));
    }
    //GETTERS
    public String getPlatoPrincipal() {
        return platoPrincipal;
    }

    public String getPostre() {
        return postre;
    }
    //SETTERS

    public void setPlatoPrincipal(String platoPrincipal) {
        this.platoPrincipal = platoPrincipal;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }
    
}
