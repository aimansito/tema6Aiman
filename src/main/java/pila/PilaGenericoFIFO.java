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
public class PilaGenericoFIFO<T> extends PilaCola{
    

    public PilaGenericoFIFO(int valorMax) {
        super(valorMax);
    }

    
//    public void añadirElemento(T palabra){
//        if(this.palabras.size()<this.valorMax){
//            this.palabras.add(palabra);
//        }
//    }
//    @Override
//    public T sacarElemento(){
//        if(!(palabras.isEmpty())){
//            return palabras.remove(0);
//        }else{
//            return null;
//        }
////    }
//    public boolean saberSiEstaVacia(){
//        return palabras.isEmpty();
//    }
//    public boolean saberSiEstaLlena(){
//        return palabras.size()==valorMax;
//    }
//    public void mostrarLista(){
//        for(T st : palabras){
//            System.out.println(st);
//        }
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilaGenericoFIFO{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Object sacarElemento() {
         if(!(palabras.isEmpty())){
            return palabras.remove(0);
        }else{
            return null;
        }
    }
}
