
package interfaces;

public class Pato implements Animal{

    @Override
    public String emitirSom() {
        return "CuaCua";
    }

    @Override
    public String comer() {
        return "Ração";
    }
    
}
