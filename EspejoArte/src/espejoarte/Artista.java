/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espejoarte;

/**
 *
 * @author faem
 */
public class Artista {
    private String nombreArtistico;
    private String nombreObra;

    public Artista(String nombreArtistico, String nombreObra) {
        this.nombreArtistico = nombreArtistico;
        this.nombreObra = nombreObra;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    
    
    
}
