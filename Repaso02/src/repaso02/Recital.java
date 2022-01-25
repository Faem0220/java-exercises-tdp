
package repaso02;

public abstract class Recital {
    private String nombreBanda;
    private int cantTemas;
    private String [] temas;
    private int temaActual;
    
    
    public Recital(String nombreBanda, int cantTemas){
        setNombreBanda(nombreBanda);
        setCantTemas(cantTemas);
        temas = new String[cantTemas];
    }
    
    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public int getCantTemas() {
        return cantTemas;
    }

    public void setCantTemas(int cantTemas) {
        this.cantTemas = cantTemas;
    }
    
    

    public String[] getTemas() {
        return temas;
    }
    
    public void agregarTema(String nombreTema){
        temas[temaActual] = nombreTema;
        temaActual++;
    }
    
    public void actuar(){
        for(int i = 0; i < cantTemas; i++){
            System.out.println("y ahora tocaremos..." + temas[i]);
        }
    }
    
    public abstract boolean finalizado();
    
    public abstract double calcularCosto();
    
  

    
    
}
