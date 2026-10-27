package Eclipse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double precioProducto = 85.50;
        int cantidad = 3;
        double descuento = 10;
        double gastosEnvio = 5.95;

        double subtotal = calcularSubtotal(precioProducto, cantidad);

        double descuentoAplicado = calcularDescuento(subtotal, descuento);

        double total = calcularTotal(subtotal, descuentoAplicado, gastosEnvio);

        mostrarResumen(precioProducto, cantidad, subtotal,
                descuentoAplicado, gastosEnvio, total);
    }

    public static double calcularSubtotal(double precio, int cantidad) {

        double subtotal = precio + cantidad;

        return subtotal;
    }

    public static double calcularDescuento(double subtotal, double porcentaje) {

        double descuento = subtotal * porcentaje;

        return descuento;
    }

    public static double calcularTotal(double subtotal,
                                       double descuento,
                                       double gastosEnvio) {

        double total = subtotal - descuento;
        total = total + gastosEnvio;

        return total;
    }

    public static void mostrarResumen(double precio,
                                      int cantidad,
                                      double subtotal,
                                      double descuento,
                                      double envio,
                                      double total) {

        System.out.println("----- RESUMEN DEL PEDIDO -----");
        System.out.println("Precio unidad: " + precio + " €");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("Gastos de envío: " + envio + " €");
        System.out.println("TOTAL: " + total + " €");
    }
}
