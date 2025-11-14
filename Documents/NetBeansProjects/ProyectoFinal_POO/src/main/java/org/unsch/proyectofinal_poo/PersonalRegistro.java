
package org.unsch.proyectofinal_poo;

public class PersonalRegistro extends UsuarioSistema{

    public PersonalRegistro(String nombre, String apellidos, String dni, String celular, String correo) {
        super(nombre, apellidos, dni, celular, correo);
    }

    @Override
    public void ingresarSistema() {
        System.out.println("=== INGRESO AL SISTEMA - PERSONAL DE REGISTRO ===");
        System.out.println("Bienvenido(a): " + getNombreCompleto());
        System.out.println("DNI: " + getDni());
        System.out.println("Sistema de registro de comensales activo");
        System.out.println("-----------------------------------------");
    }

    public void registrarIngreso() {
        System.out.println("=== REGISTRO DE INGRESO DE COMENSAL ===");
        System.out.println("Personal responsable: " + getNombreCompleto());
        System.out.println("Procesando registro de comensal...");
        System.out.println("Datos personales verificados");
        System.out.println("Informacion de contacto confirmada");
        System.out.println("Registro completado exitosamente");
        System.out.println("Numero de registro: REG-" + (int)(Math.random() * 10000));
        System.out.println("-----------------------------------------");
    }

    public void consultarRegistros() {
        System.out.println("=== CONSULTA DE REGISTROS ===");
        System.out.println("Consultando base de datos de comensales...");
        System.out.println("Mostrando ultimos 10 registros...");
        System.out.println("Registros cargados correctamente");
        System.out.println("-----------------------------------------");
    }
}
