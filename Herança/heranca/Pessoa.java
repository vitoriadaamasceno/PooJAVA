package heranca;
//Declaração de Variaveis
public abstract class Pessoa {
    protected String nome;
    protected String numero;
    //Construtor
    public Pessoa(String nome, String numero) {
            super();
            this.nome = nome;
            this.numero = numero;
    }
    //Getter e Setter
    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public String getNumero() {
            return numero;
    }

    public void setNumero(String numero) {
            this.numero = numero;
    }
       //ToString
    @Override
    public String toString() {
        return "\nNome=" + nome +
               "\nNumero=" + numero ;
    }
        
        
}
