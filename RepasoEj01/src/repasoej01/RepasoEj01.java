/*
 iii) Escriba un programa que instancie un proyecto con un director y dos investigadores.
Asigne dos subsidios a cada investigador y otorgue los subsidios del primero de ellos,
luego imprima todos los datos del proyecto en pantalla.
 */
package repasoej01;

public class RepasoEj01 {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Uival",33);
        proyecto.setDirector("CosoEE");
        proyecto.agregarInvestigador(new Investigador("ZZ Fulanito",2,"Física"));
        proyecto.agregarInvestigador(new Investigador("YY Fulanito",3,"Matemática"));
        
        for(int i = 0; i < proyecto.getCantInvestigadores(); i++){
            proyecto.getInvestigadores()[i].agregarSubsidio(new Subsidio(50000,"Motivo1"));
            proyecto.getInvestigadores()[i].agregarSubsidio(new Subsidio(80000,"Motivo2"));
        }
        proyecto.otorgarTodos("ZZ Fulanito");
        
        System.out.println(proyecto.toString());
        
        
        
        
    }
    
}
