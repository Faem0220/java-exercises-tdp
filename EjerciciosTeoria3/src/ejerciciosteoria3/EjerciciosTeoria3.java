/*
II) Realice un programa que instancie una urna electoral para la mesa “203” con 5 listas y una urna de
referéndum para la mesa “203”. Luego, lea DNIs de personas que llegan a votar a la mesa, hasta que se ingresa
el DNI 0 (el cual no debe procesarse). Cada persona vota en ambas urnas de la siguiente manera. Para la urna
electoral, la persona ingresa un nro. “N”: si “N” corresponde a una lista válida se debe votar por la lista “N” y en
caso contrario se debe votar en blanco. Para la urna de referéndum, la persona ingresa un número “M”: si “M”
es positivo se debe votar a favor, si es negativo se debe votar en contra, y si es 0 debe votar en blanco. Al
finalizar la votación, calcular la opción ganadora en ambas urnas y mostrar el resultado en consola. Además
mostrar para cada urna el porcentaje de votos que obtuvo la opción ganadora respecto al total de votos.
 */
package ejerciciosteoria3;
import PaqueteLectura.GeneradorAleatorio;
public class EjerciciosTeoria3 {

    public static void main(String[] args) {
        UrnaElectoral urnaElectoral = new UrnaElectoral(203,5);
        UrnaReferendum urnaReferendum = new UrnaReferendum(203);
        GeneradorAleatorio.iniciar();
        int dni = GeneradorAleatorio.generarInt(20);
        while(dni != 0){
            System.out.println("Dni: "+ dni);
            // Voto en urna electoral
            int lista = GeneradorAleatorio.generarInt(6);
            if(urnaElectoral.validarNumeroDeLista(lista)){
                urnaElectoral.votarPorLista(lista);
                System.out.println("Voto por lista: "+lista);
            }
            else{
                urnaElectoral.votarEnBlanco();
                System.out.println("Voto en blanco");
            }
            // Voto en urna referendum
            int opcionReferendum = GeneradorAleatorio.generarInt(20)-7;
            if(opcionReferendum > 0){
                urnaReferendum.votarAFavor();
                System.out.println("Voto a favor");
            }
            else if(opcionReferendum < 0){
                urnaReferendum.votarEnContra();
                System.out.println("Voto en contra");
            }
            else{
                urnaReferendum.votarEnBlanco();
                System.out.println("Voto en blanco");
            }
            
            dni = GeneradorAleatorio.generarInt(20);  
        }
        
        System.out.println("----ELECCIONES POR LISTAS----");
        int listaGanadora = urnaElectoral.calcularGanador();
        System.out.println("La lista ganadora de las elecciones es: " + listaGanadora);
        if(listaGanadora >=0)
            System.out.println("Porcentaje de victoria: " + 
                (urnaElectoral.devolverVotosPorLista(listaGanadora)  * 100) / urnaElectoral.calcularTotalVotos()+"%");
        else
            System.out.println("Porcentaje de victoria: " + 
                (urnaElectoral.getVotosBlanco()  * 100) / urnaElectoral.calcularTotalVotos()+"%");
        
        System.out.println("----ELECCIONES POR REFERENDUM----");
        int referendumGanador = urnaReferendum.calcularGanador();
        System.out.println("La opción ganadora del referendum es: " + referendumGanador);
        switch(referendumGanador){
            case 1: System.out.println("Porcentaje de victoria: " + (urnaReferendum.getVotosFavor() * 100)/urnaReferendum.calcularTotalVotos()+"%");
                    break;
            case 0: System.out.println("Porcentaje de victoria: " + (urnaReferendum.getVotosContra() * 100)/urnaReferendum.calcularTotalVotos()+"%");
                    break;
            case -2: System.out.println("Porcentaje de victoria: " + (urnaReferendum.getVotosBlanco() * 100)/urnaReferendum.calcularTotalVotos()+"%");
                    break;
        }       
    }
    
}
