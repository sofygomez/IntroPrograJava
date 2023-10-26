
package casopractico1.pkg0;


public class Factura {

    private int numero;
    private double monto;
    private int mes;
    private int anio;
    private int estado; // 1: Pagada, 2: No pagada

    public Factura(int numero, double monto, int mes, int anio, int estado) {
        this.numero = numero;
        this.monto = monto;
        this.mes = mes;
        this.anio = anio;
        this.estado = estado;
    }

    // Getters para numero, monto, mes, anio y estado

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}

    
    

