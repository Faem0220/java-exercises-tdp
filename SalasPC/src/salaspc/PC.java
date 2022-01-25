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
public class PC {
    private boolean estado;
    private double consumo;
    
    public PC(double consumo){
        this.estado = false;
        this.consumo = consumo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    
    
}
