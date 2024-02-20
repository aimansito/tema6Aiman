/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

import java.util.Objects;

/**
 *
 * @author aiman
 */
public  class Legislador extends Persona {
    private String provinciaQueRepresenta;
    private String partidoPolitico;

    public Legislador(String provinciaQueRepresenta, String partidoPolitico, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
    }

    public Legislador() {
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.provinciaQueRepresenta);
        hash = 83 * hash + Objects.hashCode(this.partidoPolitico);
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
        final Legislador other = (Legislador) obj;
        if (!Objects.equals(this.provinciaQueRepresenta, other.provinciaQueRepresenta)) {
            return false;
        }
        return Objects.equals(this.partidoPolitico, other.partidoPolitico);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Legislador{");
        sb.append("provinciaQueRepresenta=").append(provinciaQueRepresenta);
        sb.append(", partidoPolitico=").append(partidoPolitico);
        sb.append("Super: ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
