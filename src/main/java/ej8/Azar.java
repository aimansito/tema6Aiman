/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author aiman
 */
public abstract class Azar {
    protected int posibilidades;
    
    public abstract int lanzar();   

    public Azar(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Azar{");
        sb.append("posibilidades=").append(posibilidades);
        sb.append('}');
        return sb.toString();
    }
    
    
}
