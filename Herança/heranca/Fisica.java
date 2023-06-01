package heranca;

import java.time.LocalDate;
import java.time.Period;
//Declaração de variaveis 
public class Fisica extends Pessoa {
	private String cpf;
	private String rg;
	private LocalDate dataNascimento;
    //Construtor
    public Fisica(String cpf, String rg, LocalDate dataNascimento, String nome, String numero) {
        super(nome, numero);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
    //Get e Setter
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    //ToString
    @Override
    public String toString() {
        return super.toString() +
                "\nCpf=" + cpf + 
                "\nrg=" + rg + 
                "\nDataNascimento=" + dataNascimento+
                "\nIdade=" + this.getIdade();
    }

}
