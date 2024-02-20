/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author aiman
 */
public class Alcalde extends Persona {
    private String ciudad;

    public Alcalde(String ciudad,String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.ciudad = ciudad;
    }

    public Alcalde() {
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alcalde{");
        sb.append("ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }
    
    
}
