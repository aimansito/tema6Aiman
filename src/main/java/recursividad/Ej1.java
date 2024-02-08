/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author aiman
 */
public class Ej1 {
    //1 recorrer un array de forma recursiva e imprimir valores
    //2 sumar de forma recursiva los elementos de un array de la clase carrito
    
    public static void main(String[] args) {
        int contador = 0;
        int [] array = new int[5];
        array[0]=4;
        array[1]=3;
        array[2]=5;
        array[3]=7;
        array[4]=8;
//        imprimirArray(array, contador);
        System.out.println(sumarArray(array, contador));
    }
    public static void imprimirArray(int[] array, int contador){
        if(array.length>contador){
            System.out.println(array[contador]);
            imprimirArray(array, contador+1);
        }else{
            System.out.println("se termino");
        }
    }
    public static int sumarArray(int[] array,int contador){
        int suma = 0;
        if(array.length>contador){
            suma += array[contador];
            suma += sumarArray(array, contador+1);
        }
        return suma;
    }
}
