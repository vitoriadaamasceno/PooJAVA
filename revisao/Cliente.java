/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

import java.time.LocalDate;

/**
 *
 * @author damascenovi
 */
public class Cliente extends Fisica{
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadocivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\nCliente" + super.toString() + "\nProtocoloAtendimento=" + protocoloAtendimento ;
    }
    
    
    
}
