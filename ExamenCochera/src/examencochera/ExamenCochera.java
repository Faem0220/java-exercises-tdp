/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencochera;

/**
 *
 * @author faem
 */
public class ExamenCochera {

  
    public static void main(String[] args) {
        Cochera cochera  = new Cochera(250.0,220.0);
        cochera.IngresarPorTiempo(new Coche("GNH324",22));
        cochera.IngresarPorTiempo(new Coche("GMM334",2));
        cochera.IngresarEnSector("Superior", new Coche("TTT789",23));
        cochera.IngresarEnSector("Inferior", new Coche("AAA323",1));
        
        System.out.println(cochera.SectorConMasCoches());
        
    }
    
}
