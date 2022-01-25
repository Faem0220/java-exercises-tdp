/*
 c. Escriba un programa que instancie cuatro coros y que los vaya almacenando en un
arreglo. El tipo de cada uno de los cuatro coros es leído por teclado. Una vez leído el
tipo de coro se deberá leer o bien la cantidad de coristas (en el caso del coro
semicircular) o la cantidad de hileras e integrantes por hilera (en el caso del coro por
hileras). Luego se deberá crear la cantidad de coristas necesarios, leyendo sus datos, y
almacenándolos en el coro. Finalmente imprima toda la información de los cuatro
coros indicando si están bien formados o no.
 */
package repaso03;
import PaqueteLectura.Lector;
public class Repaso03 {

    public static void main(String[] args) {
        Coro[] coros = new Coro[4];
    
        for(int i = 0; i < 4; i++){
            System.out.println("Ingrese nombre del coro:");
            String nombreCoro = Lector.leerString();
            System.out.println("Ingrese datos del director:");
            System.out.println("Nombre:");
            String nombreDirector = Lector.leerString();
            System.out.println("dni:");
            int dniDirector = Lector.leerInt();
            System.out.println("edad:");
            int edadDirector = Lector.leerInt();
            System.out.println("antiguedad:");
            int antiguedadDirector = Lector.leerInt();
            Director director = new Director(nombreDirector,dniDirector,edadDirector,antiguedadDirector);
            
            System.out.println("Ingrese tipo de coro(Semicircular o Hilera): ");
            String tipo = Lector.leerString();
            if(tipo.equals("Semicircular")){
                System.out.println("Ingrese cantidad de coristas");
                int cantCoristas = Lector.leerInt();
                coros[i] = new CoroSemicircular(nombreCoro,director,cantCoristas);
    
                System.out.println("Ingrese información de coristas");
                for(int j=0; j < cantCoristas; j++){
                    System.out.println("Nombre:");
                    String nombreCorista = Lector.leerString();
                    System.out.println("Dni:");
                    int dniCorista = Lector.leerInt();
                    System.out.println("Edad:");
                    int edadCorista = Lector.leerInt();
                    System.out.println("Tono fundamental:");
                    int tonoFundamental = Lector.leerInt();
                    coros[i].agregarCorista(new Corista(nombreCorista,dniCorista,edadCorista,tonoFundamental));
                }
            }
            else{
                System.out.println("Ingrese la cantidad de hileras");
                int cantHileras = Lector.leerInt();
                System.out.println("Ingrese la cantidad de integrantes por hilera");
                int cantIntegrantesHilera = Lector.leerInt();
                coros[i] = new CoroHileras(nombreCoro, director,cantHileras,cantIntegrantesHilera);
                
                System.out.println("Ingrese información de coristas:");
                for(int j=0; j < (cantHileras*cantIntegrantesHilera); j++){
                    System.out.println("Nombre:");
                    String nombreCorista = Lector.leerString();
                    System.out.println("Dni:");
                    int dniCorista = Lector.leerInt();
                    System.out.println("Edad:");
                    int edadCorista = Lector.leerInt();
                    System.out.println("Tono fundamental:");
                    int tonoFundamental = Lector.leerInt();
                    coros[i].agregarCorista(new Corista(nombreCorista,dniCorista,edadCorista,tonoFundamental));
                }
            }
              
        }
        System.out.println("Información de todos los coros:");
        for(int i=0; i<4; i++){
            coros[i].toString();
            System.out.println("Está bien formado?");
            coros[i].estaBienFormado();
        }
        
    
    }
}
