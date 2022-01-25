/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialconcursomusica;

/**
 *
 * @author faem
 */
public class Concurso {
    private Alumno[][] generos;
    private int[] dimL;
    
    public Concurso(int cantAlumnos){
        this.generos = new Alumno[5][cantAlumnos];
        this.dimL = new int[5];
    }
    
    public void InscribirAlumnoEnGenero(Alumno alumno,int genero){
        this.generos[genero][this.dimL[genero]] = alumno;
        this.dimL[genero]++;
    }
    
    public String ConsultaInstrumento(String nombreAlumno){
        int i = 0;
        int j;
        String instrumento = "";
        boolean esta = false;
        while((i < 5) & (!esta)){
            j = 0;
            while((j < this.dimL[i]) & (!esta)){
                if(generos[i][j].getNombre().equals(nombreAlumno)){
                    esta = true;
                    instrumento = generos[i][j].getInstrumento();   
                }
                j++;
            }
            i++;
            
        }
        
        if(esta){
            return instrumento;
        }
        else{
            return ("El alumno no se encuentra en el concurso");
        }
    }
    
    
    public int CantAlumnosInstrumento(String instrumento){
        int cant = 0;
        for(int i =0; i<5; i++){
            for(int j=0; j < this.dimL[i];j++){
                if(generos[i][j].getInstrumento().equals(instrumento)){
                    cant += 1;
                }
            }
        }
        return cant;
    }
        
    
    
    
}
