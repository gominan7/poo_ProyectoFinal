
package org.unsch.proyectofinal_poo;

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
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //DIVISION DE RESPONSABILIDAD: metodo de la clase padre, las
    //clases hijas la heredaran y ellos implmntaran la forma de 
    //ingresar al sistema.
    
    public abstract void ingresarSistema();
    
    
}
