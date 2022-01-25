
package ejerciciodiscografica;

/**
 * @author faem
 */
import PaqueteLectura.Lector;
public class EjercicioDiscografica {

    public static void main(String[] args) {
        Discografica discografica;
        //Instancia discográfica
        String nombre = Lector.leerString();
        String ciudad = Lector.leerString();
        String nombreDueño = Lector.leerString();
        discografica = new Discografica(nombre,ciudad,nombreDueño);
        
        // Agrega Solistas
        int cantTemas = Lector.leerInt();
        while( cantTemas != 0){
            String nombreSolista = Lector.leerString();
            String instrumento = Lector.leerString();
            discografica.AgregarSolista(new Solista(nombreSolista,instrumento,cantTemas));
            cantTemas = Lector.leerInt();
        }
        // Agrega Bandas
        int cantIntegrantes = Lector.leerInt();
        while(cantIntegrantes != 0){
            String nombreBanda = Lector.leerString();
            String ciudadBanda = Lector.leerString();
            discografica.AgregarBanda(new Banda(nombreBanda,ciudad,cantIntegrantes));
            cantIntegrantes = Lector.leerInt();
        }
        //Informa métodos
        System.out.println("Cantidad de bandas:" + discografica.getCantBandas());
        System.out.println("Cantidad de solistas que tocan la guitarra: " + discografica.CantSolistasInstrumento("Guitarra"));
        System.out.println("Banda con más integrantes: " + discografica.BandaMasIntegrantes());
        System.out.println("Cantidad de bandas de la misma ciudad de discográfica: " + discografica.CantBandasMismaCiudad() );  
    }
    
}
