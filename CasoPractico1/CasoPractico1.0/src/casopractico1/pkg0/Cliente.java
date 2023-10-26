
package casopractico1.pkg0;

import javax.swing.JOptionPane;


public class Cliente {

    private String nombre;
    private int cedula;
    private double deudaTotal;
    private double montoTotalPagado;

    public Cliente(int cedula, String nombre) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.deudaTotal = 0.0;
        this.montoTotalPagado = 0.0;
    }

    

    public void agregarFactura(Factura factura) {
        if (factura.getEstado() == 2) {
            deudaTotal += factura.getMonto();
        } else if (factura.getEstado() == 1) {
            montoTotalPagado += factura.getMonto();
        }
    }

    public double calculoDeuda() {
        return deudaTotal;
    }

    public double montoTotalFacturasPagadas() {
        return montoTotalPagado;
    }

    public void generarCobroFraccionado(int meses) {
        double intereses = deudaTotal * 0.05;
        double cuotaMensual = (deudaTotal + intereses) / meses;

        JOptionPane.showMessageDialog(null, "Plan de pago para " + nombre + " (Cédula: " + cedula + "):");
        for (int i = 1; i <= meses; i++) {
            String fechaPago = obtenerFechaPago(i);
            JOptionPane.showMessageDialog(null, "Cuota " + i + ": $" + cuotaMensual + " Fecha de pago: " + fechaPago);
        }
    }

    private String obtenerFechaPago(int cuota) {
        int mesActual = 6; // Empezamos desde julio
        int anioActual = 2023;
        int mes = mesActual + cuota - 1;
        int anio = anioActual + (mes / 12);
        mes = (mes % 12) + 1;

        return mes + "/" + anio;
    }
}

    
    

