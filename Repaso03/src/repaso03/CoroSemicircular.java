package repaso03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author faem
 */
public class CoroSemicircular extends Coro {
    private int cantIntegrantes;
    private Corista[] formacion;

    public CoroSemicircular(String nombre, Director director,int cantIntegrantes) {
        super(nombre, director);
        this.cantIntegrantes = cantIntegrantes;
        formacion = new Corista[cantIntegrantes];
    }
    
    public void agregarCorista(Corista corista){
        formacion[this.getCantActual()] = corista;
        this.setCantActual(this.getCantActual()+1);
    }
    
    public boolean estaLleno(){
        return this.getCantActual() == cantIntegrantes;
    }
    
    public boolean estaBienFormado(){
        int i = 0;
        boolean cumple = true;
        while((i < cantIntegrantes) && (cumple)){
            if(i>0)
                if(formacion[i].getTonoFundamental() > formacion[i-1].getTonoFundamental())
                    cumple = false;
        }
        return cumple;           
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux += "\n Coristas \n";
        for(int i=0; i < cantIntegrantes; i++){
            aux += formacion[i].toString();
        }
        return aux;
    }
    
    
}
    
