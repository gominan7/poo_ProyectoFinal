
package org.unsch.proyectofinal_poo;
//HERENCIA: UsuarioSistema<---Nutricionista
public class Nutricionista extends UsuarioSistema{
    //Atributos propios
    private String profesion;
    private String horarioLaboral;
    private double sueldo;

    //CONSTRUCTOR
    public Nutricionista(String profesion, String horarioLaboral, double sueldo, String nombre, String apellidos, String dni, String celular, String correo) {
        super(nombre, apellidos, dni, celular, correo);//Atributos heredados
        this.profesion = profesion;
        this.horarioLaboral = horarioLaboral;
        this.sueldo = sueldo;
    }
    
    //Metodo Heredado
    @Override
    public void ingresarSistema(){
        
    }
    //Metodos propios
    public void crearMenu(){
        
    }
    public void editarMenu(){
        
    }
    public void generarReporteNutricional(){
        
    }
    public void verInformacionNutricional(){
        
    }
    
}
