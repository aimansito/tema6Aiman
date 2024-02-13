/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Trabajador> lista = new ArrayList<>();
//        lista.add(new Trabajador("María","1231"));
        lista.add(new Enfermera("Estepona","Lucía","3244"));
        lista.add(new Policia("2342","Juana","3424"));
        
        
        //enfermera usa su clase cotizar con el override pero policia usa el metodo de la clase trabajador (padre)
        for(Trabajador trabajador : lista){
            trabajador.cotizar();
        }
        
        Set<CursoReciclaje> hacenCursos = new HashSet();
        
        hacenCursos.add(new Policia());
        hacenCursos.add(new Profesor());
        
        for(CursoReciclaje curso : hacenCursos){
            curso.hacerCurso(300);
            if(curso instanceof Policia){
                ((Policia) curso).ponerDenuncia();
            }
        }
    }
}
