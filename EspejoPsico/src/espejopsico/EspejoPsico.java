
package espejopsico;

/**
 *
 * @author faem
 */
public class EspejoPsico {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        sistema.agendarPaciente(new Paciente("Julio",true,2000.0), 0);
        sistema.agendarPaciente(new Paciente("Carlos",false,5000.0), 2);
        sistema.agendarPaciente(new Paciente("Mario",true,1000.0), 1);
        
        sistema.liberarTurnosPaciente("Carlos");
        System.out.println("El horario más agendado es: "+sistema.turnoMasAgendado());
        
        
    }
    
}
