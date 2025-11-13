
package org.unsch.proyectofinal_poo;

public class Desayuno extends Menu{
    private String acompaniamento;
    private String fruta;

    //CONSTRUCTOR

    public Desayuno(String acompaniamento, String fruta, double precio, String bebida, String descripcion) {
        super(precio, bebida, descripcion);
        this.acompaniamento = acompaniamento;
        this.fruta = fruta;
    }
    
    public String getHorarioServicio(){
        return "6:30 AM - 8:30 AM";
    }
    
    //METODO HEREDADO: Redefinido
    @Override
    public double calcularPrecio(){
        double precioFinal = getPrecio();
        return precioFinal;
    }
    
}
