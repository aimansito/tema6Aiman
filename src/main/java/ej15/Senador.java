/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author aiman
 */
public class Senador extends Legislador {
    private double salarioExtra;

    public Senador(double salarioExtra, String provinciaQueRepresenta, String partidoPolitico, String nombre, String nif, int edad) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, nif, edad);
        this.salarioExtra = salarioExtra;
    }

    public double getSalarioExtra() {
        return salarioExtra;
    }

    public void setSalarioExtra(double salarioExtra) {
        this.salarioExtra = salarioExtra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Senador{");
        sb.append("salarioExtra=").append(salarioExtra);
        sb.append('}');
        return sb.toString();
    }

    
    @Override
    public String getCamaraEnqueTrabaja() {
        String puesto = "Soy senador";
        
        return puesto;
    }
}
