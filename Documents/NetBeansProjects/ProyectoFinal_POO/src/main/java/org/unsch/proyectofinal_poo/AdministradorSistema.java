
package org.unsch.proyectofinal_poo;

public class AdministradorSistema extends UsuarioSistema{
    private String Profesion;
    private String horarioLaboral;

    //CONSTRUCTOR
    public AdministradorSistema(String Profesion, String horarioLaboral, String nombre, String apellidos, String dni, String celular, String correo) {
        super(nombre, apellidos, dni, celular, correo);
        this.Profesion = Profesion;
        this.horarioLaboral = horarioLaboral;
    }
    
    //METODO HEREDADO
    @Override
    public void ingresarSistema(){
    };
    
    //METODO PROPIO
    public void gestionarUsuarios(){
        
    }
    public void generarReportes(){
        
    }
    
    public void verReportes(){
        
    }
    
    
}
