
package org.unsch.proyectofinal_poo;
//HERENCIA: UsuarioSistema<---Comensal
public class Estudiante extends Comensal{
    private String codigoEstudiante;
    private String facultad;
    private String escuelaProfesional;
    private String direccion;
//CONSTRUCTOR
    public Estudiante(String codigoEstudinte, String facultad, String escuelaProfesional, String direccion, String nombre, String apellidos, String dni, String celular, String correo) {
        super(nombre, apellidos, dni, celular, correo);//Atributos heredados
        this.codigoEstudiante = codigoEstudinte;
        this.facultad = facultad;
        this.escuelaProfesional = escuelaProfesional;
        this.direccion = direccion;
    }
    
//GETTERS

    public String getCodigoEstudinte() {
        return codigoEstudiante;
    }

    public String getFacultad() {
        return facultad;
    }

    public String getEscuelaProfesional() {
        return escuelaProfesional;
    }

    public String getDireccion() {
        return direccion;
    }
   
//SETTERS

    public void setCodigoEstudinte(String codigoEstudinte) {
        this.codigoEstudiante = codigoEstudinte;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setEscuelaProfesional(String escuelaProfesional) {
        this.escuelaProfesional = escuelaProfesional;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

 //METODO HEREDADO
    @Override
    public void ingresarSistema(){
        System.out.println("=== INGRESO DE ESTUDIANTE AL SISTEMA ===");
        System.out.println("Estudiante: " + getNombreCompleto());
        System.out.println("Código: " + codigoEstudiante);
        System.out.println("Escuela: " + escuelaProfesional);
        System.out.println("Ingreso exitoso al sistema del comedor");
    };
    
//METODOS PROPIOS
    public void consultarMenu(){
        
    }
    
    public void comprarTicked(){
        System.out.println("=== COMPRA DE TICKET ===");
        System.out.println("Estudiante: " + getNombreCompleto());
        System.out.println("Se ha generado el ticket para el almuerzo del día.");
        System.out.println("Código de ticket: TCK-" + (int)(Math.random() * 10000));
        System.out.println("-----------------------------------------");
    }
    
    public void pagarTicked(){
         System.out.println("=== PAGO DE TICKET ===");
        System.out.println("Procesando pago...");
        System.out.println("Pago realizado con éxito.");
        System.out.println("Gracias por usar el servicio del comedor universitario.");
        System.out.println("-----------------------------------------");
    } 
    
    
    
    
}
