
package ejerciciosteoria3;

public class UrnaElectoral extends Urna {
    private int cantListas;
    private int[] votos;
  
    public UrnaElectoral(int numeroUrna, int cantListas){
        super(numeroUrna);
        this.cantListas = cantListas;
        this.votos = new int[cantListas];
    }

    public int getCantListas() {
        return cantListas;
    }
    
    public boolean validarNumeroDeLista(int numeroLista){
        return ((this.cantListas > numeroLista) && (numeroLista >=0));
    }
    
    public void votarPorLista(int numeroLista){
            this.votos[numeroLista]++;          
    }
    public int devolverVotosPorLista(int numeroLista){
            return (this.votos[numeroLista]);  
    }

    
    @Override
    public int calcularGanador(){
        int max = -2;
        int listaMax = -2;
        int i;
        for(i=0; i < cantListas; i++){
            if(votos[i] > max){
                max = votos[i];
                listaMax = i;
            }   
        }
        if (max > this.getVotosBlanco())
            return listaMax;
        else
            return -1;
    }
    
    @Override
    public int calcularTotalVotos(){
        int total = 0;
        for(int i=0; i<cantListas; i++){
            total += votos[i];
        }
        return (total += super.getVotosBlanco());
    }
}
