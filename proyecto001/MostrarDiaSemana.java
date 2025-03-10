public class MostrarDiaSemana {
    public static void main(String[] args) {
        int dia = 3;
        switch (dia) {
            case 1 -> Syste.out.println("Lunes");
            case 2 -> Syste.out.println("Martes");
            case 3 -> Syste.out.println("Miércoles");
            case 4 -> Syste.out.println("Jueves");
            case 5 -> Syste.out.println("Viernes");
            case 6 -> Syste.out.println("Sábado");
            case 7 -> Syste.out.println("Domingo");
            default -> System.out.println("Día no válido");
        }
    }
}