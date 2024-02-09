/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aiman
 */
public class EjClase {
    public static void main(String[] args) {
        int[] num = {7,9,10,5,3,7,7,9,10,250,4};
        System.out.println(repetirNum(num));
    }
    //A) Estructura de dato que indique , para cada nº cuantas veces se repite
    public static Map<Integer,Integer>  repetirNum(int[] numero){
        Map<Integer,Integer> num = new HashMap<>();
        for(int i = 0;i<numero.length;i++){
           if(numero[i])
           num.put(numero[i], );
        }
       return num;
    }
    //B) Lista sin duplicados
    //C) Recursivo posición búsqueda de un elemento (lista sin duplicado)
}
