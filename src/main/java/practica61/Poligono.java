/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 *
 * @author aiman
 */
public abstract class Poligono extends Figura {
    private int base;
    private int altura;
    private int numLados;

    public Poligono(int base, int altura, int numLados, String id, String color) {
        super(id, color);
        this.base = base;
        this.altura = altura;
        this.numLados = numLados;
    }

    public Poligono() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.base;
        hash = 19 * hash + this.altura;
        hash = 19 * hash + this.numLados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Poligono other = (Poligono) obj;
        if (this.base != other.base) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        return this.numLados == other.numLados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poligono{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append(", numLados=").append(numLados);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
