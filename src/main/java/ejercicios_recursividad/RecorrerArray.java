/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_recursividad;

/**
 *
 * @author aiman
 */
public class RecorrerArray {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6};
        RecorrerArrayRecursivo(array, 0);
        System.out.println("-----------------");
        System.out.println(buscarElementoArray(array, 0, 9));
    }
    public static void RecorrerArrayRecursivo(int[] array,int indice){
        if(indice!=array.length){
            System.out.print(array[indice]);
            RecorrerArrayRecursivo(array, indice+1);
        }
    }
    public static int buscarElementoArray(int[] array,int indice,int num){
        int pos = 0;
        if(indice!=array.length){
            if(array[indice]==num){
                return indice;
            }else{
                pos = buscarElementoArray(array, indice+1,num);
            }   
        }
        return pos;
    }
}
