/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class Pila {
    private ArrayList<String> palabras; 
    private final int valorMax;

    public Pila(int valorMax) {
        this.palabras = new ArrayList<>();
        this.valorMax = valorMax;
    }
    
    public String sacarElemento(){
        if(!(palabras.isEmpty())){
            return palabras.remove(palabras.size()-1);
        }else{
            return "";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila{");
        sb.append("palabras=").append(palabras);
        sb.append(", valorMax=").append(valorMax);
        sb.append('}');
        return sb.toString();
    }
    
}
