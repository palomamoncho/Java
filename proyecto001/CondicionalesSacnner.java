import java.util.Scanner;

public class CondicionalesScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
        // Ejemplo 2 : Uso de if - else
        System.out.println("Introduce un número: ");
        int numero = Scanner next.Int();
        if  (numero % 2 == 0) {
            System.out.println("El número es par.");
            { else {
                System.out.println("El número es impar.");
            }
            // Ejemplo 3: Uso de if - else if - else
            System.out.print("Introduce tu nota (0-100):");
            int nota = scanner.nextInt();

            if (nota >= 90) {
                System.out.println("Tienes una calificación de Sobresaliente.");
            } else if (nota >= 70) {
                System.out.println("Tienes una calificación de Notable.");
            } else if (nota >= 50) {
                System.out.println("Tienes una calificación de Aprobado.");
            } else {
                System.out.println("Has suspendido. Necesitas mejorar");
            }
            scanner.close();
            }
        }
    }
}