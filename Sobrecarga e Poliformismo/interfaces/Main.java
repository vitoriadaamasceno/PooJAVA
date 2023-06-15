package interfaces;

public class Main {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        PitbullEnraivado pit = new PitbullEnraivado();

        System.out.println("Cachorro: " + dog.emitirSom() + "- Ele come: " + dog.comer());
        System.out.println("Gato: " + cat.emitirSom() + "- Ele come: " + cat.comer());
        System.out.println("Pitbull Enraivado: " + pit.emitirSom() + "- Ele come: " + pit.comer());
    }
}
