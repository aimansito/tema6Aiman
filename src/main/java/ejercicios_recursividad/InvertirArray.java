/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_recursividad;

/**
 *
 * @author aiman
 */
public class InvertirArray {
    public static void main(String[] args) {
       int a = 254;
       String palabra = "Aiman";
       System.out.println(invertirNum(a, 2));
       System.out.println(invertirPalabra(palabra, palabra.length()));
    }
    public static int invertirNum(int num, int indice){
        if(num<10){
            return 2;
        }else{
            return (num%10)*(int) Math.pow(10, indice)+(invertirNum(num/10, indice-1));
        }
    } 
    public static String invertirPalabra(String palabra,int longitud){
        
        if(longitud==0){
            return " ";
        }else{
            return palabra.charAt(longitud-1) + (invertirPalabra(palabra, longitud-1));
        }
    }
}
