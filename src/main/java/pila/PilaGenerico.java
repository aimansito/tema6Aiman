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
public class PilaGenerico<T> {
    private ArrayList<T> palabras; 
    private final int valorMax;

    public PilaGenerico(int valorMax) {
        this.palabras = new ArrayList<>();
        this.valorMax = valorMax;
    }
    
    public void añadirElemento(T palabra){
        if(!(this.palabras.size()+2>this.valorMax)){
            this.palabras.add(palabra);
        }
    }
    public T sacarElemento(){
        if(!(palabras.isEmpty())){
            return palabras.remove(palabras.size()-1);
        }else{
            return null;
        }
    }
    public boolean saberSiEstaVacia(){
        return palabras.isEmpty();
    }
    public boolean saberSiEstaLlena(){
        if(palabras.size()==valorMax){
            return true;
        }else{
            return false;
        }
    }
    public void mostrarLista(){
        for(T st : palabras){
            System.out.println(st);
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
