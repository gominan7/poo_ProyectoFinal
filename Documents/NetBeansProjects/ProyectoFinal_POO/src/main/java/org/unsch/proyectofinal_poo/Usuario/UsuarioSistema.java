
package org.unsch.proyectofinal_poo.Usuario;

//ABSTRACCION:nuestra clase sera abstracta al tomar como algo
//general a nustra clase UsuarioSistema
public abstract class UsuarioSistema {
    //ENCAPSULAMIENTO: atributos privados
    private String nombre;
    private String apellidos;
    private String dni;
    private String celular;
    private String correo;
    
    //CONSTRUCTOR

    public UsuarioSistema(String nombre, String apellidos, String dni, String celular, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.celular = celular;
        this.correo = correo;
    }
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }
    //SETTERS

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre.trim();
    }

    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.trim().isEmpty()){
            throw new IllegalArgumentException("Los apellidos no pueden estar vacios");
        }
        this.apellidos = apellidos.trim();
    }

    public void setDni(String dni) {
        if (dni == null || dni.trim().isEmpty()){
            throw new IllegalArgumentException("El DNI no puede estar vacio");
        }
        this.dni = dni.trim();
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //DIVISION DE RESPONSABILIDAD: metodo de la clase padre, las
    //clases hijas la heredaran y ellos implementaran la forma de 
    //ingresar al sistema.
    
    public abstract void ingresarSistema();
    
    //División de responsabilidad
    public String getNombreCompleto(){
        return nombre + " " + apellidos;
    }
    
    //Metodo heredado de la clase Objet
    @Override
    public String toString(){
        return String.format("Usuario: %s, DNI: %s, Correo: %s",
                getNombreCompleto(), dni, correo);
    }
    
    
}
