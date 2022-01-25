/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialconcursobaile;

/**
 *
 * @author faem
 */
public class ParcialConcursoBaile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concurso concurso = new Concurso(4);
        concurso.AgregarPareja(new Pareja(new Participante(546,"Fafd",25),
                                          new Participante(666,"Cad",32),
                                           "Bachata"));
        
        concurso.AgregarPareja(new Pareja(new Participante(888,"Manu",45),
                                          new Participante(688,"Ccos",44),
                                           "Bachata"));
        
        
        System.out.println("Pareja con más diferencia de edad: ");
        System.out.println("Nombre Participante A " +
        concurso.ParejaMasDiferenciaEdad().getParticipanteA().getNombre());
        System.out.println("Nombre Participante B " + 
        concurso.ParejaMasDiferenciaEdad().getParticipanteB().getNombre());
    }
    
}
