/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author aiman
 */
public class Polidromo {
    public static void main(String[] args) {
        String palabra = "kayak";
        palabraPolindroma(palabra);
    }
    
    public static void palabraPolindroma(String palabra){
        boolean pol = false;
        for(int i = 0;i<palabra.length();i++){
           for(int j = 0;j<palabra.lastIndexOf(j);j--){
               System.out.println(palabra.charAt(j) );
           }
        }
    }
}
