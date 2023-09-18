public class Televisao {

    private boolean ligada;
    private int canal;
    private int volume;

    public Televisao() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 0;
    }


    public void LigarDesligar() {
        ligada = !ligada;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }


    public int AlterarCanal(int canal) {
        switch (canal) {
            case 1:
        		this.canal = canal;
                return canal;
            case 3:
		        this.canal = canal;
                return canal;
            case 5:
		        this.canal = canal;
                return canal;
            case 7:
		        this.canal = canal;
                return canal;
            case 11:
		        this.canal = canal;
                return canal;
            default:
                return -1;
        }

    }
    
    public void AumentarVolume(){
        if(ligada== true && volume<100){		
            volume ++;
        }
    }
    
    public void DiminuirVolume(){
        if(ligada== true && volume > 0){
            volume --;
        }
    }

}
