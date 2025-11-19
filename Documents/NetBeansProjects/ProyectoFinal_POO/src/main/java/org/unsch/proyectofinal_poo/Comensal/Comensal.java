
package org.unsch.proyectofinal_poo.Comensal;
//Clase padre: Comensal
public abstract class Comensal {
    //Encapsulamiento: atributos privados
    private String nombre;
    private String apellidos;
    private String dni;
    private String correo;
    private String celular;

    //Constructor de la clase padre
    public Comensal(String nombre, String apellidos, String dni, String correo, String celular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
    }
    //División de responsabilidad
    //Metodo propio de la clase padre, la cual heredaran las clases hijas y las implementaran
    //a su modo.
    public abstract void ingresarSistema();
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }
    //se protege el objeto de los usuarios
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")){
            throw new IllegalArgumentException("El nombre solo puede contener letras");
        }
        this.nombre = nombre.trim();
    }

    public void setApellidos(String apellidos) {
        
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getNombreCompleto(){
            return nombre + " " + apellidos;
    }
    
    //Metodo Sobreescrito
    @Override
    public String toString(){
        return String.format("dni=%s, nombre=%s, correo=%s}",
                 dni, getNombreCompleto(), correo);
    }
}
