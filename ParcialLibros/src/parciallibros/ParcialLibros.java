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
public class ParcialLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LibroElectronico lElectronico = new LibroElectronico("Coso",400.0,"pdf",5.0);
       LibroImpreso lImpreso = new LibroImpreso("Lala",2000.0,true);
       
       lElectronico.AgregarAutor("Pedro G.");
       lElectronico.AgregarAutor("Manuel G.");
       lElectronico.AgregarAutor("Juan G.");
       
       lImpreso.AgregarAutor("Coso autor 1");
       lImpreso.AgregarAutor("Coso autor 2");
       lImpreso.AgregarAutor("Coso autor 3");
       
       System.out.println(lElectronico.toString());
       System.out.println(lImpreso.toString());
    }
    
}
