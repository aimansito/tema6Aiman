/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        Animal a = new Terrestres("Ovíparo");
        Animal b = new Acuaticos("Peces");
        
        if(a instanceof Animal){
            System.out.println("Soy animal");
        }
        if(a instanceof Terrestres){
            System.out.println("Soy terrestre");
        }
        if(a instanceof Depredador){
            System.out.println("Soy un depredador");
        }
        List<Depredador> cazadores = new ArrayList<>();
        
        cazadores.add(a);
        cazadores.add(b);
        for(Depredador animal : cazadores){
            animal.cazar(new Acuaticos("Tiburon"));
        }
    }
}
