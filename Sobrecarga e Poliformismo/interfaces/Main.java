package interfaces;

public class Main {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        Gato cat = new Gato();

        System.out.println("Cachorro: " + dog.emitirSom() + "- Ele come: " + dog.comer());
        System.out.println("Gato: " + cat.emitirSom() + "- Ele come: " + cat.comer());

    }
}
