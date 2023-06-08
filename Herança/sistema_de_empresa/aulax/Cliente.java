/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulax;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica {
    private int protoloAtendimento;

    public Cliente(int protoloAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.protoloAtendimento = protoloAtendimento;
    }

    public int getProtoloAtendimento() {
        return protoloAtendimento;
    }

    public void setProtoloAtendimento(int protoloAtendimento) {
        this.protoloAtendimento = protoloAtendimento;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nProtoloAtendimento=" + protoloAtendimento + '}';
    }
    
}
