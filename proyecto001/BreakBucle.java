public class BreakBucle {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.println("Iteración números: " + contador);
            contador++;
            break;
        } while (contador <= 5);
        System.out.println("Fin de bucle.");
    }
}