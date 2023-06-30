/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package revisao;

/**
 *
 * @author damascenovi
 */
public enum Setor_Juridica {
    TECNOLOGIA("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material de Construçao"),
    MATERIA_PRIMA("Materia Prima"),
    ALIMENTICIO("Alimenticio");
    
    protected String nome;
    

    private Setor_Juridica(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }
}
