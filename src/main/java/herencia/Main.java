/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
//        Vehiculo v1 = new Vehiculo("123","3223","Maserati",23.56);
//        System.out.println(v1);
        Turismo t1 = new Turismo(1,"123","4243","Citroen",234.3);
//        System.out.println(t1);
        Furgoneta f1 = new Furgoneta(100.0,"232","323","Peugeot",12.0);
        //cuando uso la variable de la subclase tengo aceso a  ametodos publicos de la superclase
        t1.descontarTarifa(0);
        t1.añadirRuedaRepuesto();
//        v1.descontarTarifa(0);
        f1.aumentarCarga(3); // metodo de furgoneta unicamente 
        // v1 no tiene acceso a los metodos de t1 pero t1 si tiene acceso a los de v1
        List<Vehiculo> lista = new ArrayList<>();
        //conversiones implicitas, casting 
        //aunque la variable sea turismo o furgoneta la estoy apuntado po vehiculo
        //lo que mplica ue solo tengo a acceso a los metodos de vehiculo 

//        lista.add(v1);
        lista.add(t1);
        lista.add(f1);
        System.out.println("-------------------");
        for(Vehiculo v : lista){
            //metodo plimofico tostring
            //en funcion del tipoo al que apunte v e ejecunta un codigo u otro
            System.out.println(v.toString());
            if(v instanceof Turismo){
                ((Turismo) v).añadirRuedaRepuesto();
            }
            v.pasarItv();
        }
    }
}
