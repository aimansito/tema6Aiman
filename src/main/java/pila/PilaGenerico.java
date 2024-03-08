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
public class PilaGenerico<T> extends PilaCola<T> {

    public PilaGenerico(int valorMax) {
        super(valorMax);
    }
//    public T sacarElemento(){
//        if(!(palabras.isEmpty())){
//            return palabras.remove(palabras.size()-1);
//        }else{
//            return null;
//        }
//    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public T sacarElemento() {
        if (!(palabras.isEmpty())) {
            return palabras.remove(palabras.size() - 1);
        } else {
            return null;
        }
    }
}
