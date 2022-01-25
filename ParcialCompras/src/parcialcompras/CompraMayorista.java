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
public class CompraMayorista extends Compra{
    private int cuitComprador;
    
    public CompraMayorista(int numero, int cantProductos, int cuitComprador){
        super(numero,cantProductos);
        setCuitComprador(cuitComprador);
    }

    public int getCuitComprador() {
        return cuitComprador;
    }

    public void setCuitComprador(int cuitComprador) {
        this.cuitComprador = cuitComprador;
    }
    
    @Override
    public double PrecioAPagar(){
        double suma = 0;
        for(int i = 0; i < this.getCantProductos(); i++){
            suma += this.getProductos()[i].getPrecioMayorista();
        }
        return (suma - (suma * 0.21));
    }
    
    public String toString(){
       String aux = super.toString() + 
               " Precio a pagar=" + this.PrecioAPagar() + 
               " CUIT=" + this.getCuitComprador();
       return aux;
        
    }
    
    
    
}
