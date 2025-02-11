public class Main2 {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        System.out.printLn("Valor máximo de un int: " + maxValue);
        // Sumamos 1 al valor máximo, lo que causa un overflow
        int overflowedValue = maxValue + 1;

        System.out.println("Valor después del overflow: " + overflowedValue);
    }
}