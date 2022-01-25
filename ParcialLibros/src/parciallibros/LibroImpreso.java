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
public class LibroImpreso extends Libro{
    private boolean esTapaDura;
    
    public LibroImpreso(String titulo, double precio,boolean esTapaDura){
        super(titulo,precio);
        this.esTapaDura = esTapaDura;
    }
    
    public double PrecioFinal(){
        if(this.esTapaDura){
            return this.getPrecio() + 500;
        }
        else{
            return this.getPrecio();
        }
               
    }
    
    
}
