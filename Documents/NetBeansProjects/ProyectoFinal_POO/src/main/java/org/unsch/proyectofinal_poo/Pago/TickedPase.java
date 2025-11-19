package org.unsch.proyectofinal_poo.Pago;

import org.unsch.proyectofinal_poo.Comensal.Comensal;
import java.time.LocalDateTime;

public class TickedPase {
    //Encapsulamiento:Atributos privados
    private String idTickedPase;
    private Comensal comensal;
    private LocalDateTime fechaHora;
    private String tipoServicio; // Desayuno, Almuerzo, Cena
    private double precio;
    private int cantidad;
    private double precioUnitario;
    private double total;
    private String medioPago;
    private String moneda;

    // CONSTRUCTOR
    public TickedPase(Comensal comensal, String tipoServicio, double precio,
                      int cantidad, double precioUnitario, String medioPago) {

        setComensal(comensal);
        setTipoServicio(tipoServicio);
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);

        this.idTickedPase = generarNumeroTicked();
        this.fechaHora = LocalDateTime.now();
        this.precio = precio;
        this.total = calcularTotal();
        this.medioPago = (medioPago != null && !medioPago.isEmpty()) ? medioPago : "No especificado";
        this.moneda = "Soles";
    }

    // MÉTODOS PRIVADOS
    //División de responsabilidad
    //Proteger al usuario de los objetos
    private String generarNumeroTicked() {
        String serie = "B001";
        String numero = String.format("%08d", (int)(Math.random() * 100000000));
        return serie + "_" + numero;
    }
    //proteger al usuario de los objetos
    private double calcularTotal() {
        return cantidad * precioUnitario;
    }

    // SETTERS CON VALIDACIÓN
    //Proteger al objeto del los usuarios
    public void setComensal(Comensal comensal) {
        if (comensal == null) {
            throw new IllegalArgumentException("El comensal no puede ser nulo");
        }
        this.comensal = comensal;
    }

    public void setTipoServicio(String tipoServicio) {
        if (tipoServicio == null || tipoServicio.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de servicio no puede estar vacío");
        }

        if (!tipoServicio.matches("(?i)Desayuno|Almuerzo|Cena")) {
            throw new IllegalArgumentException("El tipo de servicio debe ser Desayuno, Almuerzo o Cena");
        }

        this.tipoServicio = tipoServicio;
    }
    
    public void setCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que 0");
        }
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario <= 0) {
            throw new IllegalArgumentException("El precio unitario debe ser mayor que 0");
        }
        this.precioUnitario = precioUnitario;
    }

    // ==========================
    // GETTERS
    // ==========================

    public String getIdTickedPase() {
        return idTickedPase;
    }

    public Comensal getComensal() {
        return comensal;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getTotal() {
        return total;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public String getMoneda() {
        return moneda;
    }

    // MÉTODO UTILITARIO

    @Override
    public String toString() {
        return """
                --------- TICKET DE SERVICIO DE COMEDOR ---------
                Ticket: %s
                Fecha y hora: %s

                Comensal: %s
                Servicio: %s
                Cantidad: %d
                Precio Unitario: %.2f
                Total: %.2f %s

                Medio de Pago: %s
                --------------------------------------------------
                """.formatted(
                idTickedPase,
                fechaHora,
                comensal.getNombre(),
                tipoServicio,
                cantidad,
                precioUnitario,
                total,
                moneda,
                medioPago
        );
    }
}

