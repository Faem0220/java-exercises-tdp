
package repasoej01;
public class Proyecto {
    private String nombre;
    private int codigo;
    private String director;
    
    private int cantInvestigadores;
    private Investigador[] investigadores;
    
    public Proyecto(String nombre, int codigo){
        this.nombre = nombre;
        this.codigo = codigo;
        investigadores = new Investigador[50];
    }
    
    public void setDirector(String director){ 
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
    

    public int getCantInvestigadores() {
        return cantInvestigadores;
    }
    
    
    public Investigador[] getInvestigadores(){
        return investigadores;
    }
    
    public void agregarInvestigador(Investigador investigador){
        if(this.cantInvestigadores < 50){
            investigadores[cantInvestigadores] = investigador;
            cantInvestigadores++;
        }
        
    }
    
    public double dineroTotalOtorgado(){
        double total = 0;
        for(int i=0; i<cantInvestigadores; i++){
            
            if(investigadores[i].getCantSubsidios() > 0){
                
                for(int j=0; j<investigadores[i].getCantSubsidios();j++){
                    
                    if(investigadores[i].getSubsidios()[j].isOtorgado())
                        total += investigadores[i].getSubsidios()[j].getMonto();  
                }
            }
                
        }
        return total;
    }
    
    public int cantDeSubsidios(String nombreYApellido){
        int i = 0;
        while(i < cantInvestigadores && investigadores[i].getNombreYApellido().equals(nombreYApellido))
            i++;
        if(i < cantInvestigadores)
            return investigadores[i].getCantSubsidios();
        else
            return 0;
    }
    public void otorgarTodos(String nombreYApellido){
        int i = 0;
        while(i < cantInvestigadores && !investigadores[i].getNombreYApellido().equals(nombreYApellido))
            i++;
        if(i < cantInvestigadores)
            if(investigadores[i].getCantSubsidios() > 0)
                for(int j=0; j< investigadores[i].getCantSubsidios(); j++)
                    investigadores[i].getSubsidios()[j].setOtorgado(true);       
    }
    
    @Override
    public String toString(){
        String aux = "";
        aux += "Nombre proyecto: " + nombre + " Código: " + codigo + 
                "\n" + "Director: " + this.director + 
                "  Dinero otorgado: " + dineroTotalOtorgado() + "\n" + "INVESTIGADORES\n" ;
        
        for(int i=0; i< cantInvestigadores; i++){
            aux += "Investigador: " + investigadores[i].toString() + "\n";
            double total = 0;
            if(investigadores[i].getCantSubsidios() > 0){
                for(int j=0; j<investigadores[i].getCantSubsidios();j++){
                    if(investigadores[i].getSubsidios()[j].isOtorgado())
                        total += investigadores[i].getSubsidios()[j].getMonto();  
                }
                aux += " Dinero de subsidios otorgado: " + total + "\n" + "\n";
            }
        }
        return aux;
        
    }

}
