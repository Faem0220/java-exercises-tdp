/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiscografica;

/**
 *
 * @author faem
 */
public class Discografica {
    private String nombre;
    private String ciudad;
    private String nombreDueño;
    private Solista[] solistas;
    private int cantSolistas;
    private Banda[] bandas;
    private int cantBandas;

    public Discografica(String nombre, String ciudad, String nombreDueño) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.nombreDueño = nombreDueño;
        solistas = new Solista[50];
        bandas = new Banda[50];
    }
    public void AgregarSolista(Solista solista){
        if(cantSolistas < solistas.length){
            solistas[cantSolistas] = solista;
            cantSolistas += 1;
        }
    }
    
    public void AgregarBanda(Banda banda){
        if(cantBandas < bandas.length){
            bandas[cantBandas] = banda;
            cantBandas += 1;
        }
    }
    
    public int CantSolistasInstrumento(String instrumento){
        int cant = 0;
        for(int i=0; i<cantSolistas; i++){
            if(solistas[i].getInstrumento().equals(instrumento)){
                cant += 1;
            }
            
        }
        return cant;
    }
    
    public String BandaMasIntegrantes(){
        int maxIntegrantes = -1;
        String nombreMax = "";
        for(int i = 0; i < cantBandas; i ++){
            if(bandas[i].getCantIntegrantes() > maxIntegrantes){
                maxIntegrantes = bandas[i].getCantIntegrantes();
                nombreMax = bandas[i].getNombre();
            }   
        }
        return nombreMax;
    }
    
    public int CantBandasMismaCiudad(){
        int cant = 0;
        for(int i = 0; i < cantBandas; i++){
            if(bandas[i].getCiudad().equals(this.ciudad)){
                cant += 1;
            }
        }
        return cant;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public Solista[] getSolistas() {
        return solistas;
    }

    public void setSolistas(Solista[] solistas) {
        this.solistas = solistas;
    }

    public int getCantSolistas() {
        return cantSolistas;
    }

    public void setCantSolistas(int cantSolistas) {
        this.cantSolistas = cantSolistas;
    }

    public Banda[] getBandas() {
        return bandas;
    }

    public void setBandas(Banda[] bandas) {
        this.bandas = bandas;
    }

    public int getCantBandas() {
        return cantBandas;
    }

    public void setCantBandas(int cantBandas) {
        this.cantBandas = cantBandas;
    }
    
    
    
    
    
}
