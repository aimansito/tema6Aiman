/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equals;

/**
 *
 * @author aiman
 */
public class Portatil extends Ordenador {
    private boolean tecladoExtraible;

    public Portatil(boolean tecladoExtraible, double precio, String marca) {
        super(precio, marca);
        this.tecladoExtraible = tecladoExtraible;
    }

    public Portatil() {
       
    }

    public boolean isTecladoExtraible() {
        return tecladoExtraible;
    }

    public void setTecladoExtraible(boolean tecladoExtraible) {
        this.tecladoExtraible = tecladoExtraible;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.tecladoExtraible ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Portatil other = (Portatil) obj;
        return this.tecladoExtraible == other.tecladoExtraible;
    }
    
    
}
