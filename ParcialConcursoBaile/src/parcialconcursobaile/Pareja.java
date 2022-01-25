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
public class Pareja {
    private Participante participanteA;
    private Participante participanteB;
    private String estilo;

    public Pareja(Participante participanteA, Participante participanteB, String estilo) {
        this.participanteA = participanteA;
        this.participanteB = participanteB;
        this.estilo = estilo;
    }
    
    public int DiferenciaEdad(){
        if(participanteA.getEdad() > participanteB.getEdad()){
            return participanteA.getEdad() - participanteB.getEdad();
        }
        else{
            return participanteB.getEdad() - participanteA.getEdad();
        }
    }

    public Participante getParticipanteA() {
        return participanteA;
    }

    public void setParticipanteA(Participante participanteA) {
        this.participanteA = participanteA;
    }

    public Participante getParticipanteB() {
        return participanteB;
    }

    public void setParticipanteB(Participante participanteB) {
        this.participanteB = participanteB;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    
    
}
