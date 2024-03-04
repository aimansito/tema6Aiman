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
    
    public boolean añadirElemento(String palabra){
        boolean valido = true;
        if(this.palabras.size()+2>this.valorMax){
            valido=false;
        }else{
            this.palabras.add(palabra);
        }
        return valido;
    }
    public void mostrarLista(){
        for(String st : palabras){
            System.out.println(st);
        }
    }
}
