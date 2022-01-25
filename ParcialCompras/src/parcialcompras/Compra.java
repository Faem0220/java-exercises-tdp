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
public abstract class Compra {
    private int numero;
    private Producto[] productos;
    private int cantProductos;  
    
    public Compra(int numero, int cantProductos){
        setNumero(numero);
        productos = new Producto[cantProductos];
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void AgregarProducto(Producto producto){
        this.productos[cantProductos] = producto;
        this.cantProductos++;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    
    
    public abstract double PrecioAPagar();

    @Override
    public String toString() {
        String aux = "numero=" + numero + "\n";
        aux += "Productos: \n";
        for(int i = 0; i < cantProductos; i++){
            aux += "Codigo=" + this.productos[i].getCodigo() + 
                    " Precio Mayorista=" + this.productos[i].getPrecioMayorista() +
                    " Precio Minorista=" + this.productos[i].getPrecioMinorista() + "\n";  
        }
        return aux;
    }
    
    
    
    
}
