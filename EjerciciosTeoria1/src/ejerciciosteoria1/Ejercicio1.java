package ejerciciosteoria1;

import PaqueteLectura.GeneradorAleatorio;
public class Ejercicio1 {

    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int patente = GeneradorAleatorio.generarInt(10);
        while(patente != 0){
            if (patente % 2 == 0)
                System.out.println("Patente: " + patente + " tiene permitido el paso.");   
            else
                System.out.println("Patente: " + patente + " NO tiene permitido el paso.");    
            patente = GeneradorAleatorio.generarInt(10);    
        }
    } 
}
