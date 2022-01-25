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
public class Sector {
    private String nombre;
    Coche[] coches;
    private double costoPorHora;
    private int  cantCoches;
    
    public Sector(String nombre, double costoPorHora){
        this.nombre = nombre;
        this.costoPorHora = costoPorHora;
        coches = new Coche[20];
    }
    public int IngresarCoche(Coche C){
        coches[cantCoches] = C;
        cantCoches++;
        return cantCoches - 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche[] getCoches() {
        return coches;
    }

    public void setCoches(Coche[] coches) {
        this.coches = coches;
    }

    public double getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(double costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    public int getCantCoches() {
        return cantCoches;
    }

    public void setCantCoches(int cantCoches) {
        this.cantCoches = cantCoches;
    }
    
    
    
}
