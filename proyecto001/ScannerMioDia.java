import java.util.Scanner;
public class ScannerMioDia{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); // Supongamos que 3 representa el miércoles
System.out.print("introduce un dia de la semana:");
int dia = scanner.nextInt();
switch (dia) {
case 1:
System.out.println("Lunes");
break;
case 2:
System.out.println("Martes");
break;
case 3:
System.out.println("Miércoles");
break;
case 4:
System.out.println("Jueves");
break;
case 5:
System.out.println("Viernes");
break;
case 6:
System.out.println("Sábado");
break;
case 7:
System.out.println("Domingo");
break;
default:
System.out.println("Día no válido");
}
}
}