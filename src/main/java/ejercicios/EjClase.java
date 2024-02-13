/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author aiman
 */
public class EjClase {
    public static void main(String[] args) {
        int contador = 0;
        int[] num = {7,9,10,5,3,7,7,9,10,250,4};
        System.out.println("Map con sus valores y el numero de repeticiones"+contarRepeticiones(num));
        System.out.println("Lista sin duplicados: "+listaSinDup(num));
        ArrayList<Integer> lista = listaSinDup(num);
        System.out.println("Búsqueda posicion   : "+busquedaArrayList(lista, 10,contador));
    }
    //A) Estructura de dato que indique , para cada nº cuantas veces se repite
    public static Map<Integer, Integer> contarRepeticiones(int[] numeros) {
        Map<Integer, Integer> contador = new HashMap<>();

        for (int num : numeros) {
            if (contador.containsKey(num)) {
                contador.put(num, contador.get(num) + 1);
            } else {
                contador.put(num, 1);
            }
        }

        return contador;
    }
    //B) Lista sin duplicados
    public static Set<Integer> listaSinDuplicados(int[] num){
        Set<Integer> numeros = new TreeSet<>();
        for(int i = 0;i<num.length;i++){
            numeros.add(num[i]);
        }
        return numeros;
    }
    //C) Recursivo posición búsqueda de un elemento (lista sin duplicado)
    public static int busquedaArray(int[] numeros,int num,int contador){
        if(numeros.length>contador){
            if(numeros[contador]!=num){
                return busquedaArray(numeros, num,contador+1);
            }else{
               return contador;
            }
        }else{
            contador = -1;
        }
        return contador;
    }
    //metodo sin duplicados con arraylist
    public static ArrayList<Integer> listaSinDup(int[] num){
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0;i<num.length;i++){
            if(!(numeros.contains(num[i]))){
                numeros.add(num[i]);
            }
        }
        return numeros;
    }
    //metodo recursivo con arrayList
    public static int busquedaArrayList(ArrayList<Integer> numeros,int num,int contador){
        if(numeros.size()>contador){
            if(numeros.get(contador)!=num){
               return busquedaArrayList(numeros, num,contador+1);
            }else{
               return contador;
            }
        }
        return -1;
    }
}
