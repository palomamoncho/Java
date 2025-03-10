// Definir una clase llamada Animal
class Animal {
    // Definir un método que emite un sonido
    public void emitirSonido() {
        System.out.println("El animal hace un sonido");
    }
}

public class EjemploAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal(); // Crear un objeto de tipo Animal
        animal.emitirSonido(); // Llamar al método emitirSonido
    }
}
