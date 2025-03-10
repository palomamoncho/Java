import java.util.Scanner;

public class CalculadoraPrecioFinal {

    static final double IVA = 0.21;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Introduce el descuento en porcentaje (ej. 20 para un 20%): ");
        double descuento = scanner.nextDouble();
        double precioFinal = calcularPrecioFinal(precio, descuento);

        System.out.println("El precio final después de aplicar el descuento y el IVA es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double precio, double descuento) {
        double precioConDescuento = precio - (precio * descuento / 100);

        double precioConIVA = precioConDescuento * (1 + IVA);

        return precioConIVA;
    }
}