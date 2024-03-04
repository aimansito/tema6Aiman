/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poligono;

/**
 *
 * @author aiman
 */
public abstract class Poligono {
    protected int numeroLados ;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poligono{");
        sb.append("numeroLados=").append(numeroLados);
        sb.append('}');
        return sb.toString();
    }
    public abstract double area();
}
