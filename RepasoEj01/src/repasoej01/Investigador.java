
package repasoej01;

public class Investigador {
    private String nombreYApellido;
    private int categoria;
    private String especialidad;
    private int cantSubsidios;
    private Subsidio[] subsidios;

    public Investigador(String nombreYApellido,int categoria, String especialidad) {
        this.nombreYApellido = nombreYApellido;
        this.categoria = categoria;
        this.especialidad = especialidad;
        cantSubsidios = 0;
        subsidios = new Subsidio[5];
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    
    public int getCantSubsidios(){
        return cantSubsidios;
    }
    
    public Subsidio[] getSubsidios(){
        return subsidios;
    }


    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void agregarSubsidio(Subsidio subsidio){
        if(cantSubsidios < 5){
            subsidios[cantSubsidios] = subsidio;
            cantSubsidios++;
        }
    }
    
    @Override
    public String toString(){
        return nombreYApellido + " " + categoria;
    }
    
    
}
