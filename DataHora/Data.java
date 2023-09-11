/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataHora;

/**
 *
 * @author damascenovi
 */
public class Data {
    public int dia;
    public int mes;
    public int ano;
    public int ultimoDia = 0;
    
    public boolean validaData(int dia, int mes, int ano){
        
        if (ano < 0 || ano > 9999)
            return false;
        
        if (mes < 1 || mes > 12)
            return false;
        
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            this.ultimoDia=30;
        }else{
            if (mes == 2){
                if ((ano % 4 == 0) && (ano % 100 != 0) || ano % 400 == 0) {
                    this.ultimoDia = 29;
                }else{
                    this.ultimoDia = 28;
                }
            }else{
                this.ultimoDia=31;
            }
        }
        
        if (dia < 1 || dia > this.ultimoDia)
            return false;
        
        return true;
            
    }
    
    public Data(int dia, int mes, int ano) {    
        if (validaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        }
    }        

    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setData(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        
    }
    
    public boolean passaTempo (int quantDias){
        if (quantDias > 0)
            return false;
            
        
        this.dia = this.dia + quantDias;
        
        if (this.dia > this.ultimoDia){
            this.dia = this.dia - this.ultimoDia;
            this.mes = this.mes + 1;
            if (this.mes > 12){
                this.mes = this.mes - 12;
                this.ano = this.ano + 1;
            }
        }
        
        return true;
        
    }
    
}