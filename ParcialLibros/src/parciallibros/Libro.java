/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallibros;

/**
 *
 * @author faem
 */
public abstract class Libro {
    private String titulo;
    private double precio;
    private String[] autores;
    private int cantAutores;

    public Libro(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
        this.autores = new String[8];
    }
    
    public void AgregarAutor(String nombre){
        autores[cantAutores] = nombre;
        cantAutores++;
    }
    
    public abstract double PrecioFinal();

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantAutores() {
        return cantAutores;
    }
    
    public String toString(){
       String aux = "Titulo: " + this.titulo + "\n" + "Autores: \n";
       for(int i=0; i<cantAutores; i++){
           aux += autores[i] + "\n";
       }
       return aux + " Precio final: " + this.PrecioFinal();
    }
    
    
    
}
