/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajador;

/**
 *
 * @author aiman
 */
public class Profesor extends Trabajador implements CursoReciclaje{

    @Override
    public void cotizar() {
        System.out.println("Cotizando como profesor...$$$");
    }

    @Override
    public void hacerCurso(int numeroHoras) {
        System.out.println("Muy bien");
    }
    
}
