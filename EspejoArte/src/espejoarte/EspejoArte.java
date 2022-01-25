

package espejoarte;

/**
 *
 * @author faem
 */
public class EspejoArte {

    public static void main(String[] args) {
       Catalogo catalogo = new Catalogo();
       
       catalogo.AgregarArtista(new Artista("Kike","Insomnio"));
       
       catalogo.AgregarArtista(new Artista("Filn","el grito"));
       
       if(catalogo.BuscarPorObra("el grito") != null){
           System.out.println(catalogo.BuscarPorObra("el grito").getNombreArtistico());
       }
       
       
       
    }
    
}
