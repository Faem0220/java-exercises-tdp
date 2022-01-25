/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espejopsico;

/**
 *
 * @author faem
 */
public class Sistema {
    private Paciente[][] turnos;
    
    public Sistema(){
        turnos = new Paciente[5][6];
    }
    
    public int agendarPaciente(Paciente P,int D){
        int i = 0;
        while((i < 6) & (turnos[D][i] != null)){
            i++;
        }
        if(i<6){
            turnos[D][i] = P;
        }
        return i;
    }
    
    public void liberarTurnosPaciente(String nombre){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){
                if(turnos[i][j] != null){
                    if (turnos[i][j].getNombre().equals(nombre)){
                        turnos[i][j] = null;
                    }
                    
                }
            }
        }
    }
    
    public int turnoMasAgendado(){
        int maxTurno = -1;
        int max = -1;
        int total;
        int j = 0;
        for(int i = 0; i < 6; i++){
            total = 0;
            for(j = 0; j < 5; j++){
                if(turnos[j][i] != null){
                    total += 1;
                }   
            }
            if(total > max){
                max = total;
                maxTurno = i;
            }
        }
        return maxTurno;
    }   
}
