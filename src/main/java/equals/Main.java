/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equals;

import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Ordenador> lista = new ArrayList<>();
        Ordenador o1 = new Ordenador(12,"Dell");
        Ordenador o2 = new Ordenador(12,"Dell");
        Ordenador o3 = new Ordenador(12,"Dell");
        System.out.println(o1.equals(o3));
        Portatil p1 = new Portatil(true,12,"hp");
        Portatil p2 = new Portatil(true,11,"Samsung");
        System.out.println(p1.equals(p2));
    }
}
