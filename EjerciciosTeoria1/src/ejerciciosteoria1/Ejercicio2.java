package ejerciciosteoria1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        boolean [][] estacionamiento = new boolean[5][10];
        GeneradorAleatorio.iniciar();
        int patente = GeneradorAleatorio.generarInt(10);
        while(patente != 0){
            System.out.println("Ingrese el piso: ");
            int piso = Lector.leerInt();
            System.out.println("Ingrese la plaza: ");
            int plaza = Lector.leerInt();
            estacionamiento[piso][plaza] = true;
            System.out.println("Patente "+patente+" fue asignada a "+"la plaza "+plaza+" del piso "+piso);
            patente = GeneradorAleatorio.generarInt(10);
        }
        // b.-----------------------------------------------
        int i;
        int j;
        int count = 0;
        int max = -1;
        for (i=0; i<5; i++){
            if(count > max){
                max = i;
            }
            count = 0;
            for(j=0; j<10; j++){
                if (estacionamiento[i][j] == true)
                    count++;
            }
            System.out.println("En el piso "+ i + "hay "+ count+ " autos.");
        }
        System.out.println("El piso más ocupado es: " + (max-1));
    }
    
}
