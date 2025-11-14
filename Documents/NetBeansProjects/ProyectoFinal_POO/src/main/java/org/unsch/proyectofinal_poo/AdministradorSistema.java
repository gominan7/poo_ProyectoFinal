
package org.unsch.proyectofinal_poo;

public class AdministradorSistema extends UsuarioSistema{
    private String profesion;
    private String horarioLaboral;

    //CONSTRUCTOR
    public AdministradorSistema(String Profesion, String horarioLaboral, String nombre, String apellidos, String dni, String celular, String correo) {
        super(nombre, apellidos, dni, celular, correo);
        this.profesion = Profesion;
        this.horarioLaboral = horarioLaboral;
    }
    
    //METODO HEREDADO
    @Override
    public void ingresarSistema(){
        System.out.println("=== INGRESO AL SISTEMA - ADMINISTRADOR ===");
        System.out.println("Administrador: " + getNombreCompleto());
        System.out.println("Horario: " + horarioLaboral);
        System.out.println("Acceso completo al sistema activado");
        System.out.println("-----------------------------------------");
    };
    
    //METODO PROPIO
    public void gestionarUsuarios(){
        System.out.println("=== GESTION DE USUARIOS ===");
        System.out.println("Administrador: " + getNombreCompleto());
        System.out.println("Accediendo a modulo de usuarios...");
        System.out.println("Lista de usuarios del sistema");
        System.out.println("Permisos y roles");
        System.out.println("Historial de actividades");
        System.out.println("Gestion de usuarios completada");
        System.out.println("-----------------------------------------");
    }
    public void generarReportes(){
        System.out.println("=== GENERACION DE REPORTES ===");
        System.out.println("Administrador: " + getNombreCompleto());
        System.out.println("Generando reportes del sistema...");
        System.out.println("Reporte de uso del comedor");
        System.out.println("Reporte de inventario");
        System.out.println("Reporte financiero");
        System.out.println("Reporte de asistencia");
        System.out.println("Todos los reportes generados exitosamente");
        System.out.println("-----------------------------------------");
    }
    
    public void verReportes(){
        System.out.println("=== VISUALIZACION DE REPORTES ===");
        System.out.println("Administrador: " + getNombreCompleto());
        System.out.println("Cargando reportes existentes...");
        System.out.println("Reportes diarios disponibles");
        System.out.println("Reportes semanales archivados");
        System.out.println("Reportes mensuales consolidados");
        System.out.println("Visualización completada");
        System.out.println("-----------------------------------------");
    }
    //GETTERS

    public String getProfesion() {
        return profesion;
    }

    public String getHorarioLaboral() {
        return horarioLaboral;
    }
    
    //SETTERS
    public void setHorarioLaboral(String horarioLaboral){
        this.horarioLaboral = horarioLaboral;
    }
    @Override
    public String toString() {
        return String.format("Administrador: %s, Profesión: %s, Horario: %s",
                getNombreCompleto(), profesion, horarioLaboral);
    }
}
