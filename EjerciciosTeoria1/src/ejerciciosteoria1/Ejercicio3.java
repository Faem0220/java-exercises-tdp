package ejerciciosteoria1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ejercicio3 {

    public static void main(String[] args) {
       Auto[][] estacionamiento = new Auto[5][10];
       GeneradorAleatorio.iniciar();
       int patente = GeneradorAleatorio.generarInt(10);
       while(patente != 0){
            System.out.println("Ingrese el piso: ");
            int piso = Lector.leerInt();
            System.out.println("Ingrese la plaza: ");
            int plaza = Lector.leerInt();
            System.out.println("Ingrese el dueño: ");
            String dueño = Lector.leerString();
            estacionamiento[piso][plaza] = new Auto();
            estacionamiento[piso][plaza].setPatente(patente);
            estacionamiento[piso][plaza].setDueño(dueño);          
            System.out.println("Patente "+patente+" fue asignada a "+"la plaza "+plaza+" del piso "+piso);
            patente = GeneradorAleatorio.generarInt(10);
        }
        int i;
        int j;
        for (i=0; i<5; i++)
            for(j=0;j<10;j++){
                if(estacionamiento[i][j] != null)
                System.out.println("En la plaza "+j+" del piso "+i+
                                    " se encuentra el auto: "+  
                                      estacionamiento[i][j].toString());
            }
    }
    
}
