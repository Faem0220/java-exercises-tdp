
package repaso03;

public abstract class Coro {
    private String nombre;
    private Director director;
    private int cantActual;
    
    public Coro(String nombre, Director director){
        this.setNombre(nombre);
        this.setDirector(director);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    
    public abstract void agregarCorista(Corista corista);
    public abstract boolean estaLleno();
    public abstract boolean estaBienFormado();

    @Override
    public String toString() {
        return "nombre=" + nombre + ", director: \n " + director.toString();
    }
    
    
    
}
