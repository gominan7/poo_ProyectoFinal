
package org.unsch.proyectofinal_poo.menu;

public abstract class Menu {
    private double precio;
    private String bebida;
    private String descripcion;
    private int calorias;
    private int carbohidratos;
    private int proteinas;
    private int grasas;

    public Menu(double precio, String bebida, String descripcion, int calorias, int carbohidratos, int proteinas, int grasas) {
        this.precio = precio;
        this.bebida = bebida;
        this.descripcion = descripcion;
        this.calorias = calorias;
        this.carbohidratos = carbohidratos;
        this.proteinas = proteinas;
        this.grasas = grasas;
    }
    //División de Responsabilidad: Método abstracto
    //que cada tipo de menú implementará
    public abstract void mostrarMenuCompleto();
    
//GETTERS
    public double getPrecio() {
        return precio;
    }

    public String getBebida() {
        return bebida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCalorias() {
        return calorias;
    }

    public int getArbohidratos() {
        return carbohidratos;
    }

    public int getProteinas() {
        return proteinas;
    }

    public int getGrasas() {
        return grasas;
    }
    
    //SETTERS
    //Proteger al objeto de los usuarios
    public void setPrecio(double precio) {
        if (precio < 0){
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setCarbohidratos(int carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }
    //Método para mostrar información nutricional común
    public void mostrarInformacionNutricional(){
        System.out.println("Calorias: " + calorias + " kcal");
        System.out.println("Carbohidratos: " + carbohidratos + "g");
        System.out.println("Proteinas: " + proteinas + "g");
        System.out.println("Grasas: " + grasas + " g");
    }
     @Override
    public String toString() {
        return String.format("Menú [Precio: S/.%.2f, Calorías: %d kcal]", 
                 precio, calorias);
    }
}
