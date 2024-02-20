/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Legislador> lista = new ArrayList<>();
        
        lista.add(new Diputado(4,"Málaga","PP","Aiman","324",20));
        lista.add(new Senador(30.0,"Granada","PSOE","Jose","3242",23));
        
        for(Legislador legislador : lista){
            System.out.println(legislador.getCamaraEnqueTrabaja());
        }
    }
}
