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
public class Concurso {
    private Pareja[] parejas;
    private int cantParejas;
    
    public Concurso(int cantParejas){
        parejas = new Pareja[cantParejas];
    }
    
    public void AgregarPareja(Pareja pareja){
        parejas[cantParejas] = pareja;
        cantParejas++;
    }
    
    public Pareja ParejaMasDiferenciaEdad(){
        int max = -1;
        Pareja maxPareja = null;
        for(int i = 0; i < cantParejas; i++){
           if(parejas[i].DiferenciaEdad() > max){
               max = parejas[i].DiferenciaEdad();
               maxPareja = parejas[i];
           } 
        }
        return maxPareja;
    }
    
}
