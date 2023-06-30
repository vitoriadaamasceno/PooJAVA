/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author damascenovi
 */
public abstract class Fisica extends Pessoa {

    protected Genero genero;
    protected EstadoCivil estadocivil;
    protected LocalDate dataNascimento;

    public Fisica(Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.genero = genero;
        this.estadocivil = estadocivil;
        this.dataNascimento = dataNascimento;
    }

    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenero = " + genero.getNome()
                + "\nEstadocivil = " + estadocivil.getNome()
                + "\nDataNascimento = " + Util.formatarData(dataNascimento)
                + "\nIdade = " + getIdade();
    }

}
