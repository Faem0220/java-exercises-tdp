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
public class LibroElectronico extends Libro{
    private String formato;
    private double tamañoMB;
    
    public LibroElectronico(String titulo, double precio,String formato,double tamañoMB){
        super(titulo,precio);
        this.formato = formato;
        this.tamañoMB = tamañoMB;
    }
    
    public double PrecioFinal(){
        return (this.getPrecio() + (this.tamañoMB * 2.5));
    }
    
}
