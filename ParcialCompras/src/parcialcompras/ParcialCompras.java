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
public class ParcialCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CompraMayorista mayorista = new CompraMayorista(1,3,555);
        CompraMinorista minorista = new CompraMinorista(2,3,true);
        
        mayorista.AgregarProducto(new Producto(545,1000.0,1200.0));
        mayorista.AgregarProducto(new Producto(555,900.0,1000.0));
        mayorista.AgregarProducto(new Producto(777,500.0,600.0));
        
        minorista.AgregarProducto(new Producto(111,100.0,120.0));
        minorista.AgregarProducto(new Producto(222,90.0,100.0));
        minorista.AgregarProducto(new Producto(333,50.0,60.0));
        
        System.out.println(mayorista.toString());
        System.out.println(minorista.toString());
        
    }
    
}
