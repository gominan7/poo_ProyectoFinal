
package org.unsch.proyectofinal_poo.Comensal;
//La clase Personal de Seguridad Hereda de la clase Comensal

import org.unsch.proyectofinal_poo.Comensal.Comensal;

public class PersonlSeguridad extends Comensal{
    //Encapsulamiento: Atributos privados y propios (programar por diferencia)
    private String codigoEmpleado;
    private String turno;
    private String areaAsignada;

    public PersonlSeguridad(String codigoEmpleado, String turno, String areaAsignada, String nombre, String apellidos, String dni, String correo, String celular) {
        super(nombre, apellidos, dni, correo, celular); //Atributos que se heredan de la clase padre
        this.codigoEmpleado = codigoEmpleado;
        this.turno = turno;
        this.areaAsignada = areaAsignada;
    }
        
    
    @Override
    public void ingresarSistema(){
        System.out.println("=== INGRESO DE PERSONAL DE SEGURIDAD ===");
        System.out.println("Personal: " + getNombreCompleto());
        System.out.println("Código: " + codigoEmpleado);
        System.out.println("Turno: " + turno);
        System.out.println("Área: " + areaAsignada);
    }
    //GETTERS
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public String getTurno() {
        return turno;
    }

    public String getAreaAsignada() {
        return areaAsignada;
    }
    //SETTERS
    public void setCodigoEmpleado(String codigoEmpleado) {
        if (codigoEmpleado == null || codigoEmpleado.trim().isEmpty()){
            throw new IllegalArgumentException("El código de empleado no puede estar vacío");
        }
        if (!codigoEmpleado.matches("SEG\\d{4}")){
            throw new IllegalArgumentException("Formato de código inválido. Debe ser SEGxxxx");
        }
        this.codigoEmpleado = codigoEmpleado.trim().toUpperCase();
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = areaAsignada;
    }
    //metodo sobreescrito
    @Override
    public String toString() {
        return String.format("PersonalSeguridad{código=%s, nombre=%s, turno=%s, área=%s}",
                codigoEmpleado, getNombreCompleto(), turno, areaAsignada);
    }
}
