
package ejerciciosteoria3;

public abstract class Urna {
    private int numeroUrna;
    private int votosBlanco;
    
    public Urna(int numeroUrna){
        setNumeroUrna(numeroUrna);
        //this.numeroUrna = numeroUrna;
}

    public int getNumeroUrna() {
        return numeroUrna;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    private void setNumeroUrna(int numeroUrna) {
        this.numeroUrna = numeroUrna;
    }

    public void votarEnBlanco() {
        this.votosBlanco++;
    }
    
    public abstract int calcularGanador();
    
    public abstract int calcularTotalVotos();
    
    
    
}
