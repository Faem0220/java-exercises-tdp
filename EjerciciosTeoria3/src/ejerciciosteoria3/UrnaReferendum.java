/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosteoria3;

/**
 *
 * @author faem
 */
public class UrnaReferendum extends Urna {
    private int votosAFavor;
    private int votosEnContra;
    
    public UrnaReferendum(int numeroUrna){
        super(numeroUrna);
        this.votosAFavor = 0;
        this.votosEnContra = 0;
    }

    public int getVotosFavor() {
        return votosAFavor;
    }

    public int getVotosContra() {
        return votosEnContra;
    }

    public void votarAFavor(){
        this.votosAFavor++;
    }
    
    public void votarEnContra(){
        this.votosEnContra++;
    }
 
    @Override
    public int calcularGanador(){
        if(this.votosAFavor > this.votosEnContra && this.votosAFavor > this.getVotosBlanco())
            return 1;
        else if (this.votosEnContra > this.votosAFavor && this.votosEnContra > this.getVotosBlanco())
            return 0;
        else if(this.votosAFavor == this.votosEnContra && this.getVotosBlanco() > this.votosAFavor)
            return -1;
        else 
            return -2;
    }
 
    @Override
    public int calcularTotalVotos(){
        return (this.votosAFavor + this.votosEnContra + super.getVotosBlanco());
    }  
}
