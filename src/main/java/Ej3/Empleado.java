/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

/**
 *
 * @author aiman
 */
public class Empleado extends Persona {
    private double salario;

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public Empleado() {
        super();
    }

    protected void aumentarSalario(double sal){
        this.salario+=sal;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("salario=").append(salario);
        sb.append("Clase persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
