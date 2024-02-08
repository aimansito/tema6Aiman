/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Aiman","34242",20);
        Empleado e1 = new Empleado(2000,"Aiman","24244",20);
        Programador pr = new Programador(CATEGORIA.Junior,3300.00,"Aiman","0323",20);
        pr.aumentarSalario(300);
        
        System.out.println(pr);
    }
}
