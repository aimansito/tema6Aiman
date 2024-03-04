/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poligono;

/**
 *
 * @author aiman
 */
public class Rectangulo extends Poligono {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo{");
        sb.append("lado1=").append(lado1);
        sb.append(", lado2=").append(lado2);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
   
    

    @Override
    public double area() {
        return lado1*lado2;
    }
    
}
