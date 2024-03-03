/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_recursividad;

/**
 *
 * @author aiman
 */
public class Suma {
    //sumar los numeros naturales hasta N
    public static void main(String[] args) {
        int num = 5;
        int resultado = factorialRecursivo(num);
        System.out.println(resultado);
        
    }
    public static int sumaRecursiva(int num){
        int suma = 0;
        
        //caso base 
        if(num==1){
             return 1;
        }else{
            suma = num+sumaRecursiva(num-1 );
        }
        
        return suma;
    }
    public static int factorialRecursivo(int num){
        int suma = 0;
        
        //caso base 
        if(num==1){
             return 1;
        }else{
            suma = num*factorialRecursivo(num-1 );
        }
        
        return suma;
    }
}
