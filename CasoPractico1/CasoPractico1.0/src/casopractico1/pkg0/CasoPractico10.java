
package casopractico1.pkg0;

  import javax.swing.JOptionPane;
public class CasoPractico10 {

    
    public static void main(String[] args) {
        
   
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente: "));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        Cliente cliente = new Cliente(cedula, nombre);

        int respuesta;
        boolean continuar = true;

        while (continuar) {
            int numeroFactura = Integer.parseInt(JOptionPane.showInputDialog("Número de factura: "));
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Monto de la factura: "));
            int mesFactura = Integer.parseInt(JOptionPane.showInputDialog("Mes de la factura: "));
            int anioFactura = Integer.parseInt(JOptionPane.showInputDialog("Año de la factura: "));
            int estadoFactura = Integer.parseInt(JOptionPane.showInputDialog("Estado de la factura (1: Pagada, 2: No pagada):"));

            Factura factura = new Factura(numeroFactura, montoFactura, mesFactura, anioFactura, estadoFactura);
            cliente.agregarFactura(factura);

            respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otra factura?\n1. Sí\n2. No"));
            continuar = (respuesta == 1);
        }

        double deudaTotal = cliente.calculoDeuda();
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Número de meses para el plan de pago fraccionado:"));
        cliente.generarCobroFraccionado(meses);

        JOptionPane.showMessageDialog(null, "Deuda Total: " + deudaTotal);
        double montoTotalPagado = cliente.montoTotalFacturasPagadas();
        JOptionPane.showMessageDialog(null, "Monto total de facturas pagadas: " + montoTotalPagado);
    }
}
 
        
    
    

