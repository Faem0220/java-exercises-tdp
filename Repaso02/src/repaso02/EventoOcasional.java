
package repaso02;

public class EventoOcasional extends Recital{
    private String motivo;
    private String nombreContrata;
    private String dia;
    private boolean finalizado;
    
    public EventoOcasional(String nombreBanda, int cantTemas, 
                           String motivo, String nombreContrata, String dia){
        super(nombreBanda,cantTemas);
        this.setMotivo(motivo);
        this.setNombreContrata(nombreContrata);
        this.setDia(dia);
    }
    
    public void actuar(){
        if(motivo.equals("show de beneficiencia"))
            System.out.println("Recuerden colaborar con " + nombreContrata);
        else if(motivo.equals("show de TV"))
            System.out.println("Saludos amigos televidentes");
        else
            System.out.println("Un feliz cumpleaños para " + nombreContrata);
        super.actuar();
        setFinalizado(true);
    }
    
    public boolean finalizado(){
          return finalizado;  
    }
    

    @Override
    public double calcularCosto(){
        if(motivo.equals("show de beneficiencia"))
            return 0;
        else if(motivo.equals("show de TV"))
            return 50000;
        else
            return 150000;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNombreContrata() {
        return nombreContrata;
    }

    public void setNombreContrata(String nombreContrata) {
        this.nombreContrata = nombreContrata;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
    
    
    
}
