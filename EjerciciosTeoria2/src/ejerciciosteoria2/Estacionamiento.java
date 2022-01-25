
/*
 2- Definir una clase para representar Estacionamientos. Un estacionamiento conoce su
nombre, dirección, hora de apertura y hora de cierre, y almacena para cada número de
piso (1..N) y número de plaza (1..M), el auto que ocupa dicho lugar.
a) Provea getters/setters adecuados.
b) Implemente un constructor que reciba nombre y dirección, e inicie el
estacionamiento con hora de apertura “8:00”, hora de cierre “21:00”, y para 5 pisos y
10 plazas por piso. El estacionamiento inicialmente no tiene autos.
c) Implemente un segundo constructor que reciba nombre, dirección, hora de
apertura, hora de cierre, el número de pisos (N) y el número de plazas por piso (M)
e inicie el estacionamiento con los datos recibidos, y sin autos.
d) Implemente métodos para:
- Dado un auto A, un número de piso X y un número de plaza Y, registrar al auto en
el estacionamiento en el lugar X,Y. Suponga que X, Y son válidos y que el lugar
está desocupado.
- Dada una patente, obtener un String que contenga el número de piso y plaza
donde está dicho auto. En caso de no encontrarse, retornar el mensaje “Auto
Inexistente”.
- Obtener un String con la representación del estacionamiento. Ejemplo: “Piso 1
Plaza 1: libre Piso 1 Plaza 2: representación del auto … Piso 2 Plaza 1: libre … etc”
 * @author faem
 */
package ejerciciosteoria2;
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private String horaApertura;
    private String horaCierre;
    private Auto[][] lugar;
    private int cantPisos;
    private int cantPlazas;
//---------------Constructor-----------------------------------------//
    //b.----------------------------------------------//
    //@params nombre,direccion
    public Estacionamiento(String nombre,String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        horaApertura = "8:00";
        horaCierre = "21:00";
        cantPisos = 5;
        cantPlazas = 10;
        lugar = new Auto[cantPisos][cantPlazas];
        
    }
    //c.--------------------------------------------------//
    public Estacionamiento(String nombre,
                           String direccion,
                           String horaApertura,
                           String horaCierre,
                           int cantPisos,
                           int cantPlazas){
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.cantPisos = cantPisos;
        this.cantPlazas = cantPlazas;
        lugar = new Auto[cantPisos][cantPlazas];
    }
//------------------Métodos-------------------------------------//
   
    
    
    
    
//a.------------------------------------------------------//
//----------------------Getters------------------------------//
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getHoraApertura(){
        return horaApertura;
    }
    public String getHoraCierre(){
        return horaCierre;
    }
    public int getCantPisos(){
        return cantPisos;
    }
    public int getCantPlazas(){
        return cantPlazas;
    }
    /*
    - Obtener un String con la representación del estacionamiento. Ejemplo: “Piso 1
    Plaza 1: libre Piso 1 Plaza 2: representación del auto … Piso 2 Plaza 1: libre … etc”
    */
    @Override
    public String toString(){
        String output = "";
        for(int piso=0; piso < cantPisos; piso++){
            for(int plaza=0; plaza < cantPlazas; plaza++){
                if(lugar[piso][plaza] == null)
                    output += " Piso "+piso+" Plaza "+plaza+" : Libre \n";
                else
                    output += " Piso "+piso+" Plaza "+plaza+" : "+lugar[piso][plaza].toString()+"\n";
            }
        }
        return output;
    }
    /*
    - Dada una patente, obtener un String que contenga el número de piso y plaza
    donde está dicho auto. En caso de no encontrarse, retornar el mensaje “Auto
    Inexistente”.
    */

    public String getUbicacionAuto(int patente){
        int piso = 0, plaza = 0;
        boolean esta = false;
        while(!esta && piso < cantPisos){
            plaza = 0;
             while(!esta && plaza < cantPlazas){
                 if ((lugar[piso][plaza] != null &&(lugar[piso][plaza].getPatente() == patente)))
                    esta = true;
                 plaza++;   
             }
             if (!esta)
                piso++;
        }
        if(esta)
           return "El auto está en el piso " + piso + " plaza " + plaza;
        else 
            return "Auto inexistente";   
    }
//--------------Setters------------------------------------//
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setHoraApertura(String horaApertura){
        this.horaApertura = horaApertura;
    }
    public void setHoraCierre(String horaCierre){
        this.horaCierre = horaCierre;
    }
     /*d.)- Dado un auto A, un número de piso X y un número de plaza Y, registrar al auto en
    el estacionamiento en el lugar X,Y. Suponga que X, Y son válidos y que el lugar
    está desocupado.*/
    public String registrarAuto(Auto unAuto, int numeroPiso, int numeroPlaza){
        lugar[numeroPiso][numeroPlaza] = unAuto;
        return "Auto asignado a piso "+numeroPiso+" plaza "+numeroPlaza;
    } 
}

