public class prueba {
    public static boolean prueba(int a, int b) {
        return a > b;
    } 
    public static void main(String[] args) {
        boolean resultado;
        int a = 10;
        int b = 6;
        resultado = esMayor(a,b);
        if (resultado) {
            System.out.println(a + "es mayor que" + b);
        } else {
            System.out.println(b + "es mayor o igual que" + a);
        }
    }
}