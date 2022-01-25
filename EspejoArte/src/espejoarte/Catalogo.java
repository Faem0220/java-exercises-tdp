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
public class Catalogo {
    private Artista[] artistas;
    private int cantArtistas;
    
    public Catalogo(){
        artistas = new Artista[15];
    }
    
    public void AgregarArtista(Artista artista){
        this.artistas[cantArtistas] = artista;
        cantArtistas++;
    }
    
    public Artista BuscarPorObra(String obra){
        int indice = 0;
        for(int i = 0; i < cantArtistas; i++){
            if(this.artistas[i].getNombreObra().equals(obra)){
                indice = i;
            }
        }
        return artistas[indice];
    
    }

    public int getCantArtistas() {
        return cantArtistas;
    }

    public void setCantArtistas(int cantArtistas) {
        this.cantArtistas = cantArtistas;
    }
    
    
    
}
