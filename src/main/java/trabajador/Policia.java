/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajador;

import java.util.Objects;

/**
 *
 * @author aiman
 */
public class Policia extends Trabajador implements CursoReciclaje {
    private String numPolicia;

    public Policia(String numPolicia, String nombre, String nif) {
        super(nombre, nif);
        this.numPolicia = numPolicia;
    }

    public Policia() {
    }

    public String getNumPolicia() {
        return numPolicia;
    }

    public void setNumPolicia(String numPolicia) {
        this.numPolicia = numPolicia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.numPolicia);
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
        final Policia other = (Policia) obj;
        return Objects.equals(this.numPolicia, other.numPolicia);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Policia{");
        sb.append("numPolicia=").append(numPolicia);
        sb.append("nombre: ").append(this.getNombre());
        sb.append('}');
        return sb.toString();
    }
    
    public void ponerDenuncia(){
        System.out.println("El policía está poniendo una denuncia");
    }
    public void cotizar(){
        System.out.println("El policía está cotizando");
    }

    @Override
    public void hacerCurso(int numeroHoras) {
        if(numeroHoras>200){
            System.out.println("subir sueldo policia");
        }
    }
}
