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
public class Corista extends MiembroCoro {
    private int tonoFundamental;

    public Corista(String nombre, int dni, int edad, int tonoFundamental) {
        super(nombre, dni, edad);
        this.tonoFundamental = tonoFundamental;
    }

    public int getTonoFundamental() {
        return tonoFundamental;
    }

    public void setTonoFundamental(int tonoFundamental) {
        this.tonoFundamental = tonoFundamental;
    }

    @Override
    public String toString() {
        return super.toString() + " tonoFundamental=" + tonoFundamental;
    }
    
    
    
    
    
}
