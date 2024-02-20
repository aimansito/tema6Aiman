/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author aiman
 */
public class Terrestres extends Animal{
    
    public Terrestres(String tipo) {
        super(tipo);
    }

    @Override
    public void cazar(Animal a) {
        System.out.println("Cazando a "+a.getTipo());
    }
    
}
