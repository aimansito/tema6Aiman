/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Azar> azar = new ArrayList<>();
        
        azar.add(new Dado(6));
        
        for(Azar az : azar){
            System.out.println(az.lanzar());
        }
    }
}
