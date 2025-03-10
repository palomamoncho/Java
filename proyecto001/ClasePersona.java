class Persona {
    String nombre;
    int edad;
    static String nombrePersona = "Persona";
    void presentarse() {
        System.out.println("Tú nombre es " + nombre + " y tu edad es:" + edad);
    }
}
public class ClasePersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println(Persona.nombrePersona);
        persona.nombre = "Paloma";
        persona.edad = 22;
        persona.presentarse();
    }
}