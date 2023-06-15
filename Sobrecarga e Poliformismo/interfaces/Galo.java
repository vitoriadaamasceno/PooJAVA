
package interfaces;

public class Galo implements Animal{
   @Override
    public String emitirSom() {
        return "Cocorico";
    }

    @Override
    public String comer() {
        return "Milho";
    }
}
