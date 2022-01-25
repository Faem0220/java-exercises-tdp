/*
d) Realice un programa que instancie un evento ocasional. Lea desde el teclado el día del
evento, el nombre de quien lo contrata, el motivo, la banda y el listado de temas a tocar.
Luego imprima el costo del evento e invoque el mensaje actuar del evento.
A continuación instancie una gira, leyendo desde el teclado el nombre de la gira, la banda,
el listado de temas y el listado de ciudades con sus correspondientes días. Luego imprima
el costo de la gira e invoque al mensaje actuar de la misma hasta finalizar la gira.
 */
package repaso02;
import PaqueteLectura.Lector;
public class Repaso02 {
    public static void main(String[] args) {
        //LECTURA DE EVENTO OCASIONAL
        System.out.println("Ingrese la información del evento ocasional: ");
        System.out.println("Día: ");
        String dia = Lector.leerString();
        System.out.println("Nombre de quien contrata: ");
        String nombreContrata = Lector.leerString();
        System.out.println("Motivo: ");
        String motivo = Lector.leerString();
        System.out.println("Banda: ");
        String banda = Lector.leerString();
        System.out.println("Cantidad de temas: ");
        int cantTemas = Lector.leerInt();
        //INSTANCIA DE EVENTO OCASIONAL
        EventoOcasional evento = new EventoOcasional(banda,cantTemas,motivo,nombreContrata,dia);
        //LISTADO DE TEMAS PARA EVENTO OCASIONAL
        System.out.println("Listado de temas:");
        for(int i = 0; i < cantTemas; i++){
            System.out.println("Ingrese nombre de tema: ");
            evento.agregarTema(Lector.leerString());
        }
        System.out.println("Costo: " + evento.calcularCosto());
        evento.actuar();
        
        //LECTURA DE GIRA
        System.out.println("Ingrese la información de la gira: ");
        System.out.println("Nombre de la gira: ");
        String nombre = Lector.leerString();
        System.out.println("Nombre de la banda: ");
        banda = Lector.leerString();
        System.out.println("Cantidad de temas: ");
        cantTemas = Lector.leerInt();
        System.out.println("Cantidad de fechas: ");
        int cantFechas = Lector.leerInt();
        //INSTANCIA DE GIRA
        Gira gira = new Gira(banda,cantTemas,nombre,cantFechas);
        //LECTURA DE TEMAS PARA GIRA
        System.out.println("Listado de temas:");
        for(int i = 0; i < cantTemas; i++){
            System.out.println("Ingrese nombre de tema: ");
            gira.agregarTema(Lector.leerString());
        }
        //LECTURA DE FECHAS PARA GIRA
        System.out.println("Listado de fechas:");
        for(int i=0; i < cantFechas; i++){
            System.out.println("Ingrese ciudad: ");
            String ciudad = Lector.leerString();
            System.out.println("Ingrese día: ");
            dia = Lector.leerString();
            gira.agregarFecha(ciudad,dia);
        }
        System.out.println("Costo: " + gira.calcularCosto());
        gira.actuar();
        
        
        
        
        
    }
    
}
