
package org.unsch.proyectofinal_poo.Usuario;
//HERENCIA: UsuarioSistema<---Nutricionista

import org.unsch.proyectofinal_poo.Usuario.UsuarioSistema;

public class Nutricionista extends UsuarioSistema{
    //Atributos propios
    private String especialidad;
    private String horarioLaboral;
    private double sueldo;

    //CONSTRUCTOR
    public Nutricionista(String especialidad, String horarioLaboral, double sueldo, String nombre, String apellidos, String dni, String celular, String correo) {
        super(nombre, apellidos, dni, celular, correo);//Atributos heredados
        this.especialidad = especialidad;
        this.horarioLaboral = horarioLaboral;
        this.sueldo = sueldo;
    }
    
    //Metodo Heredado
    @Override
    public void ingresarSistema(){
        System.out.println("=== INGRESO AL SISTEMA - NUTRICIONISTA ===");
        System.out.println("Nutricionista: " + getNombreCompleto());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Horario: " + horarioLaboral);
        System.out.println("Sistema de gestion nutriional activo");
        System.out.println("---------------------------------------");
    }
    //Metodos propios
    public void crearMenu(){
        System.out.println("=== CREACION DE MENU NUTRICIONAL ===");
        System.out.println("Nutricionista: " + getNombreCompleto());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Procesando creación de menu...");
        System.out.println("Analisis de requerimientos nutricionales");
        System.out.println("Seleccion de ingredientes balanceados");
        System.out.println("Calculo de valores nutricionales");
        System.out.println("Menu creado exitosamente");
        System.out.println("Código de menu: MENU-" + (int)(Math.random() * 1000));
        System.out.println("-----------------------------------------");
    }
    public void editarMenu(){
        System.out.println("=== EDICION DE MENU NUTRICIONAL ===");
        System.out.println("Nutricionista: " + getNombreCompleto());
        System.out.println("Cargando menu actual...");
        System.out.println("Modificando componentes nutricionales...");
        System.out.println("Actualizacion de ingredientes completada");
        System.out.println("Revisión de valores nutricionales");
        System.out.println("Menu actualizado correctamente");
        System.out.println("-----------------------------------------");
    }
    public void generarReporteNutricional(){
        
    }
    public void verInformacionNutricional(){
        System.out.println("=== INFORMACION NUTRICIONAL ===");
        System.out.println("Especialista: " + getNombreCompleto());
        System.out.println("Generando reporte nutricional...");
        System.out.println("Calorias totales por porción");
        System.out.println("Distribucion de macronutrientes");
        System.out.println("Vitaminas y minerales");
        System.out.println("Recomendaciones dieteticas");
        System.out.println("Reporte generado exitosamente");
        System.out.println("-----------------------------------------");
    }
    //GETTERS

    public String getEspecialidad() {
        return especialidad;
    }

    public String getHorarioLaboral() {
        return horarioLaboral;
    }

    public double getSueldo() {
        return sueldo;
    }
    //SETTERS

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return String.format("Nutricionista: %s, Especialidad: %s, Horario: %s"
                + ", sueldo: S/ .%2f", getNombreCompleto(), especialidad, horarioLaboral
        , sueldo);
    }
}
