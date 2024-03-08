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
        // parte pila lifo
        Pila p = new Pila(3);
        
        String p1 = "Aiman";
        String p2 = "Victoria";
        String p3 = "Noelia";
        
        
        
//        p.añadirElemento(p1);
//        p.añadirElemento(p2);
//        p.añadirElemento(p3);
//        p.sacarElemento();
//        System.out.println("Pila normal: ");
//        p.mostrarLista();
//        
//        System.out.println( "¿Esta llena la lista?"+p.saberSiEstaLlena());
//        System.out.println("¿Esta vacía la lista?"+p.saberSiEstaVacia());
        //pila fifo
        //clase persona
        PilaGenericoFIFO<Persona> persona = new PilaGenericoFIFO(2);
        Persona per1 = new Persona("Aiman", "3224", 20);
        Persona per2 = new Persona("Jose", "3224", 20);
        Persona per3 = new Persona("Antonio", "3224", 20);
        
        persona.añadirElemento(per1);
        persona.añadirElemento(per3);
        persona.añadirElemento(per2);
        
        persona.sacarElemento();
        System.out.println("Lista FIFO: ");
        persona.mostrarLista();
        //clase ordenador para grnerico lifo 
        PilaGenerico<Ordenador> ordenador = new PilaGenerico(3);
        Ordenador o1 = new Ordenador(2.0, "HP");
        Ordenador o2 = new Ordenador(40.0, "SAMSUNG");
        Ordenador o3 = new Ordenador(50.0, "ASUS");
        
        ordenador.añadirElemento(o1);
        ordenador.añadirElemento(o2);
        ordenador.añadirElemento(o3);
        
        ordenador.sacarElemento();
        System.out.println("Lista LIFO: ");
        ordenador.mostrarLista();
        
        PilaCola<Ordenador> pilafifo = new PilaGenericoFIFO(3);
        PilaCola<Persona> pilalifo = new PilaGenerico(3);
        
        pilalifo.añadirElemento(per1);
        pilalifo.añadirElemento(per2);
        pilalifo.añadirElemento(per3);
        
        pilafifo.añadirElemento(o1);
        pilafifo.añadirElemento(o2);
        pilafifo.añadirElemento(o3);
        
        pilalifo.sacarElemento();
        pilafifo.sacarElemento();
        
        System.out.println("Lista fifo: ");
        pilafifo.mostrarLista();
        System.out.println("Lista lifo: ");
        pilalifo.mostrarLista();
    }
}
