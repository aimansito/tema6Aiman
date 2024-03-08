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
public abstract class PilaCola<T> {
    protected final ArrayList<T> palabras; 
    private final int valorMax;

   // contructor
    
    public  PilaCola( int valorMax) {
        this.palabras = new ArrayList<>(valorMax);
        this.valorMax = valorMax;
    }

    //To String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilaCola{");
        sb.append("palabras=").append(palabras);
        sb.append(", valorMax=").append(valorMax);
        sb.append('}');
        return sb.toString();
    }
    
    //Metodos
     public void añadirElemento(T palabra){
        if(!(this.palabras.size()+1>this.valorMax)){
            this.palabras.add(palabra);
        }
    }
    public abstract T sacarElemento();
    
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
}
