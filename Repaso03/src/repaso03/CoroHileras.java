/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso03;

/**
 *
 * @author faem
 */
public class CoroHileras extends Coro{
    private int cantHileras;
    private int cantIntegrantesHilera;
    private Corista[][] formacion;
    private int hileraActual;
    private int integranteActual;

    public CoroHileras(String nombre, Director director,int cantHileras, int cantIntegrantesHilera) {
        super(nombre, director);
        this.cantHileras = cantHileras;
        this.cantIntegrantesHilera = cantIntegrantesHilera;
        this.hileraActual = cantHileras;
        formacion = new Corista[cantHileras][cantIntegrantesHilera];
    }
    
    @Override
    public void agregarCorista(Corista corista){
        formacion[hileraActual][integranteActual] = corista;
        if(integranteActual == cantIntegrantesHilera){
            integranteActual = 0;
            hileraActual--;
        }
        else{
            integranteActual++;
        }
    }
    @Override
    public boolean estaLleno(){
        return this.getCantActual() == (cantHileras * cantIntegrantesHilera);
    }
    
    @Override
    public boolean estaBienFormado(){
        int tonoActual;
        int i = 0;
        int j;
        boolean cumple = true;
        while((i<cantHileras) && (cumple)){
            j = 0;
            tonoActual = formacion[i][j].getTonoFundamental();
            if(i<0)
                if(formacion[i-1][j].getTonoFundamental() > tonoActual)
                    cumple = false;
            while((i<cantHileras) && (j<cantIntegrantesHilera)&&(cumple)){
                if(formacion[i][j].getTonoFundamental() != tonoActual)
                    cumple = false;
                j++;
            }
            i++;
        }
        return cumple;         
    }
    
    @Override
    public String toString() {
        String aux = super.toString();
        aux += "\n Coristas \n";
        for(int i=0; i < (cantHileras*cantIntegrantesHilera); i++){
            aux += formacion[i/(cantHileras*cantIntegrantesHilera)][i%(cantHileras*cantIntegrantesHilera)].toString();
        }
        return aux;
    }
}
