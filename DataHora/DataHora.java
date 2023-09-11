/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataHora;

/**
 *
 * @author damascenovi
 */
public class DataHora extends Data {
    private int hora;
    private int minuto;
    private int segundo;
    
    public boolean validaHora(int hora, int minuto, int segundo){
        
        if (hora < 0 || hora > 59 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59)
            return false;
        
        
        return true;
            
    }
    
    public DataHora (int dia, int mes, int ano, int hora, int minuto, int segundo) {    
        super (dia, mes, ano);
        
        if (getDia() != 0 && validaHora (hora, minuto, segundo)){
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }else{
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }        

    
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setDataHora(int dia, int mes, int ano, int hora, int minuto, int segundo) {
        if (validaData(dia, mes, ano) && validaHora (hora, minuto, segundo)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
        
    }
    
    @Override
    public void setData(int dia, int mes, int ano) {
        // De acordo com a especificação, não é possível alterar somente a data
        
    }
    
}