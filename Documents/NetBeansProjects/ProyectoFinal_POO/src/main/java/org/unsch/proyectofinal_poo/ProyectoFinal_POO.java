
package org.unsch.proyectofinal_poo;

public class ProyectoFinal_POO {

    public static void main(String[] args) {
        //PRUEBA DE LA CLASE PADRE COMENSAL Y SUS CLASES HIJAS
        System.out.println("=== SISTEMA DE COMEDOR UNIVERSITARIO ===");
        System.out.println();
        
        //Creamos un estudiante
        System.out.println("1. REGISTRO DE ESTUDIANTE");
        Estudiante estudiante = new Estudiante("27202109", "Ingenireria de minas geologia y civil"
        , "Ingenieria de sistemas", "Av. Ccochapampa", "Jorge", "Berrocal Yucra", "74694165"
        , "967743346", "jorge.berrocal.27@unsch.edu.pe");
        
        //Probar métodos del estudiante
        estudiante.ingresarSistema();
        System.out.println();
        estudiante.comprarTicked();
        estudiante.pagarTicked();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        //Crear personal de seguridad
        System.out.println("2. REGISTRO DE PERSONAL DE SEGURIDAD");
        PersonlSeguridad personalSeguridad = new PersonlSeguridad(
        "SEG1234", "Manana", "Puerta 1", "Carlos", "Rodriguez Lopez"
                , "87654321", "carlos.rodriguez@unsch.edu.pe", "912345678");
        
        //Probar métodos del personal de seguridad
        personalSeguridad.ingresarSistema();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        //Demostrar Polimorfismo-SUSTITUIBILIDAD
        System.out.println("3. DEMOSTRACION DE POLIMORFISMO");
        Comensal[] comensales = new Comensal[2];
        comensales[0] = estudiante;
        comensales[1] = personalSeguridad;
        
        for (Comensal comensal : comensales){
            System.out.println("--- Procesando comensal ---");
            comensal.ingresarSistema();
            System.out.println("DNI: " + comensal.getDni());
            System.out.println("Nombre completo: " + comensal.getNombreCompleto());
            
            System.out.println("Correo: " + comensal.getCorreo());
            System.out.println();
        }
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Probar validaciones
        System.out.println("4. PRUEBA DE VALIDACIONES");
        try {
            estudiante.setNombre("Ana123"); // Esto debería lanzar una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
        
        try {
            personalSeguridad.setCodigoEmpleado("ABC123"); // Esto debería lanzar una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Mostrar información usando toString()
        System.out.println("5. INFORMACIÓN DE LOS COMENSALES");
        System.out.println("Estudiante: " + estudiante.toString());
        System.out.println("Personal Seguridad: " + personalSeguridad.toString());
        
        System.out.println("\n=== PROGRAMA FINALIZADO ===");
        
    }
}
