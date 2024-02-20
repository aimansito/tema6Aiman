/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author aiman
 */
public class Diputado extends Legislador {
    private int numAsiento;

    public Diputado(int numAsiento,String provinciaQueRepresenta, String partidoPolitico, String nombre, String nif, int edad) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, nif, edad);
        this.numAsiento = numAsiento;
    }

    public Diputado() {
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diputado{");
        sb.append("numAsiento=").append(numAsiento);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public String getCamaraEnqueTrabaja() {
        String puesto = "Soy diputado";
        
        return puesto;
    }
    
}
