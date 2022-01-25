/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaspc;

/**
 *
 * @author faem
 */
public class Sala {
    private PC[] espacios;
    private int cant;

    public Sala(int espacios){
        this.espacios = new PC[espacios];
    }
    
    public void incluirPC(int nroEspacio, PC pc){
        espacios[nroEspacio] = pc;
    }
    public void encenderMenorConsumo(){
        double min = 1000.0;
        int indiceMin = -1;
        for (int i = 0;i<espacios.length;i++){
            if(espacios[i] != null){
                if((espacios[i].getConsumo()< min) & (!espacios[i].isEstado())){
                    min = espacios[i].getConsumo();
                    indiceMin = i;
                }
            }
        }
        if(indiceMin != -1){
            espacios[indiceMin].setEstado(true);
        }
        
    }
    public String Encendidas(){
        String str = "";
        for(int i=0; i<espacios.length;i++){
            if(espacios[i] != null){
                if(espacios[i].isEstado()){
                str += i + " ";
                }
            }
        }
        return str;
    }
}
