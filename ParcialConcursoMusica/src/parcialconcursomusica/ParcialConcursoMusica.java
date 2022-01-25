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
public class ParcialConcursoMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Concurso concurso = new Concurso(20);
        Alumno[] alumnos = new Alumno[5];
        alumnos[0] = new Alumno("Carlos",20,"Guitarra",9.0);
        alumnos[1] = new Alumno("Mario",20,"Bajo",8.0);
        alumnos[2] = new Alumno("Luli",20,"Violín",7.0);
        alumnos[3] = new Alumno("Pachi",20,"Flauta",9.0);
        alumnos[4] = new Alumno("Coco",20,"Guitarra",10.0);
        
        for (int i =0;i < 5;i++){
            concurso.InscribirAlumnoEnGenero(alumnos[i],i);
        }

        System.out.println(concurso.ConsultaInstrumento("Pachi"));
        System.out.println(concurso.CantAlumnosInstrumento("Guitarra"));
    }
    
}
