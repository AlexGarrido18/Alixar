package Eclipse;

public class Factura {

	public static void main(String[] args) {

		double precio = 200;
		int unidades = 1;
		double iva = 21;
		double descuento = 10;

		double subtotal = calcularSubtotal(precio, unidades);

		double importeDescuento = calcularDescuento(subtotal, descuento);

		double baseImponible = subtotal - importeDescuento;

		double importeIva = calcularIVA(baseImponible, iva);

		double total = baseImponible + importeIva;

		mostrarFactura(precio, unidades, subtotal, importeDescuento, importeIva, total);
	}

	public static double calcularSubtotal(double precio, int unidades) {

		double resultado = precio * unidades;

		return resultado;
	}

	public static double calcularDescuento(double subtotal, double porcentaje) {

		double descuento;

		descuento = subtotal * porcentaje / 100;

		return descuento;
	}

	public static double calcularIVA(double base, double porcentaje) {

		double iva = base * porcentaje / 100;

		return iva;
	}

	public static void mostrarFactura(double precio,
                                      int unidades,
                                      double subtotal,
                                      double descuento,
                                      double iva,
                                      double total) {

        System.out.println("====== FACTURA ======");
        System.out.println("Precio: " + precio + " €");
        System.out.println("Unidades: " + unidades);
        System.out.println("Subtotal: " + subtotal + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("IVA: " + iva + " €");
        System.out.println("TOTAL: " + total + " €");

        if (total > 500) {
            System.out.println("Pedido con importe elevado");
        }
        else {
            System.out.println("Pedido normal");
        }
    }
} 
