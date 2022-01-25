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
public class Alumno {
    private String nombre;
    private int edad;
    private String instrumento;
    private double puntaje;

    public Alumno(String nombre, int edad, String instrumento, double puntaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.instrumento = instrumento;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
    
    
    
    
}
