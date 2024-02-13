/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

import java.util.Random;

/**
 *
 * @author aiman
 */
public class Moneda extends Azar{

    private static Random random = new Random();

    public Moneda(int posibilidades) {
        super(posibilidades);
    }
    
    
    @Override
    public int lanzar() {
        return random.nextInt(1,posibilidades); 
    }
}
