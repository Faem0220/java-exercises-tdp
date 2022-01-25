/*
3- Realice un programa que instancie un estacionamiento llamado “ABC”, ubicado en
“12 e/ 45 y 46”, con apertura a las “6:00” y cierre a las “22:00”. Este estacionamiento
tendrá 3 pisos y 3 plazas por piso.
Registre 6 autos en el estacionamiento (ingresando patente, dueño, piso y plaza por
teclado). Asuma que el lugar ingresado está desocupado y es válido.
Luego, muestre la representación String del estacionamiento en consola.
Para finalizar, lea una patente por teclado e informe si dicho auto se encuentra en el
estacionamiento o no. En caso de encontrarse, la información a imprimir es el piso y
plaza que ocupa.
 */
package ejerciciosteoria2;
import PaqueteLectura.Lector;
public class Ejercicio03 {

    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento("ABC",
                                                              "12 e/ 45 y 46",
                                                              "6:00","22:00",
                                                               3,3);
        for(int i=0; i <6; i++){
            System.out.println("Ingrese patente: ");
            int patente = Lector.leerInt();
            System.out.println("Ingrese dueño: ");
            String dueño = Lector.leerString();
            System.out.println("Ingrese piso: ");
            int piso = Lector.leerInt();
            System.out.println("Ingrese plaza: ");
            int plaza = Lector.leerInt();
         
            estacionamiento.registrarAuto(new Auto(dueño,patente), piso, plaza);
        }
        System.out.println(estacionamiento.toString());
        
        System.out.println("Ingrese una patente a buscar: ");
        System.out.println(estacionamiento.getUbicacionAuto(Lector.leerInt()));
  
    } 
}
