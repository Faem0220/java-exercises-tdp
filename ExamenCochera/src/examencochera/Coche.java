/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencochera;

/**
 *
 * @author faem
 */
public class Coche {
    private String patente;
    private int cantHoras;

    public Coche(String patente, int cantHoras) {
        this.patente = patente;
        this.cantHoras = cantHoras;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }
    
    
}
