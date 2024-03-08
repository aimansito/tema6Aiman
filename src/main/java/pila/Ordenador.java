/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;


/**
 *
 * @author aiman
 */
public class Ordenador {
    private double precio;
    private String marca;

    public Ordenador(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public Ordenador() {
    }

    
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordenador{");
        sb.append("precio=").append(precio);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
}
