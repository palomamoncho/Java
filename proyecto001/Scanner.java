import java.util.Scanner;
public class Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();
        System.out.print("Introduce tu ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.println("Resumen de datos integrados: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + "años");
        System.out.println("Altura: " + altura + "metros");
        scanner.close();
        }
}