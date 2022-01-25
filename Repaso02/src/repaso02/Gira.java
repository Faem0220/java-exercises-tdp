
package repaso02;

public class Gira extends Recital{
    private String nombre;
    private int cantFechas;
    private Fecha[] fechas;
    private int fechaActual;
    private int dimLFechas;
    
    public Gira(String nombreBanda, int cantTemas,
                String nombre, int cantFechas){
        super(nombreBanda,cantTemas);
        setNombre(nombre);
        setCantFechas(cantFechas);
        fechas = new Fecha[cantFechas];
    }
    
    public void agregarFecha(String ciudad, String dia){
        fechas[dimLFechas] = new Fecha(ciudad,dia);
        dimLFechas++;
    }
    
    @Override
    public void actuar(){
        System.out.println("Buenas noches " + fechas[this.fechaActual].getCiudad());
        super.actuar();
        this.fechaActual++;
        
    }
    
    @Override
    public boolean finalizado(){
        return this.fechaActual == this.dimLFechas;
    }
    
    @Override
    public double calcularCosto(){
        return cantFechas * 30000;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantFechas() {
        return cantFechas;
    }

    public void setCantFechas(int cantFechas) {
        this.cantFechas = cantFechas;
    }
    
    
    public Fecha[] getFechas() {
        return fechas;
    }

    public void setFechas(Fecha[] fechas) {
        this.fechas = fechas;
    }

    public int getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(int fechaActual) {
        this.fechaActual = fechaActual;
    }
    
    
    
}
