/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        Pila p = new Pila(1);
        
        String p1 = "Aiman";
        String p2 = "Victoria";
        String p3 = "Noelia";
        
        p.añadirElemento(p1);
        p.añadirElemento(p2);
        p.añadirElemento(p3);
        
        p.mostrarLista();
    }
}
