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
public class Cochera {
    Sector inferior;
    Sector superior;
    
    public Cochera(double costoPorHoraInf, double costoPorHoraSup){
        this.inferior = new Sector("Inferior",costoPorHoraInf);
        this.superior = new Sector("Superior",costoPorHoraSup);
    }
    

    public int IngresarEnSector(String sector,Coche C){
        if (sector.equals("Inferior")){
           return inferior.IngresarCoche(C);
        }
        else{
            return superior.IngresarCoche(C);
        }
    }
    public int IngresarPorTiempo(Coche C){
        if(C.getCantHoras() < 24){
            return inferior.IngresarCoche(C);
        }
        else{
            return superior.IngresarCoche(C);
        }
    }
    public String SectorConMasCoches(){
        if(inferior.getCantCoches() > superior.getCantCoches()){
            return inferior.getNombre();
        }
        else{
            return superior.getNombre();
        }
    }
}
