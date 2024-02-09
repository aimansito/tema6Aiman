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
        System.out.println(palabraPolindroma(palabra));
    }
    public static boolean palabraPolindroma(String palabra){
        int fin = palabra.length()-1;
        for(int i = 0;i<palabra.length();i++,fin--){
           if(palabra.charAt(i)!=palabra.charAt(fin)){
              return false;
           }
        }
        return true;
    }
    //metodo recursivo
    
}
