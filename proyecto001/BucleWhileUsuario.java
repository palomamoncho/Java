import java.util.Scanner;
public class BucleWhileUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escribe algo (o 'salir' para terminar): ");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                System.out.println("Has escrito" + entrada);
            }
        }
        System.out.println("Programa terminado.");
        scanner.close();
    }
}