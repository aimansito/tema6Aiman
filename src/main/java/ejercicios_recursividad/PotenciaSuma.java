/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_recursividad;

/**
 *
 * @author aiman
 */
public class PotenciaSuma {
    public static void main(String[] args) {
        int base = 10;
        int exponente = -3;
        System.out.println(potencia(base, exponente));
    }
    public static double potencia(int base,int exponente){
        if(exponente==0){
            return 1;
        }else if(exponente==1){
            return base;
        }else if(exponente<0){
            return potencia(base, exponente+1)/base;
        }else {
            return base * potencia(base,exponente-1);
        }
    }
}
