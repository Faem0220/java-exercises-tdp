/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialcompras;

/**
 *
 * @author faem
 */
public class CompraMinorista extends Compra{
    private boolean esJubilado;
    
    public CompraMinorista(int numero, int cantProductos, boolean esJubilado){
        super(numero,cantProductos);
        setEsJubilado(esJubilado);
    }

    public boolean isEsJubilado() {
        return esJubilado;
    }

    public void setEsJubilado(boolean esJubilado) {
        this.esJubilado = esJubilado;
    }
    
    public double PrecioAPagar(){
        double suma = 0;
        for(int i = 0; i < this.getCantProductos(); i++){
            suma += this.getProductos()[i].getPrecioMayorista();
        }
        if(this.esJubilado)
            return (suma - (suma * 0.1));
        else
            return suma;
    }
    
    public String toString(){
       String aux = super.toString() + 
               " Precio a pagar=" + this.PrecioAPagar() + 
               " esJubilado=" + this.isEsJubilado();
       return aux;
    }
    
}
