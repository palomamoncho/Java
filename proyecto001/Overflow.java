public class Overflow {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Valor máximo de un int: " + maxValue);
        // Sumamos 1 al valor máximo, lo que causa un overflow
        int overflowedValue = maxValue + 1;

        System.out.println("Valor después del overflow: " + overflowedValue);
    }
}