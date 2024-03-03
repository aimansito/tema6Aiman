/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_recursividad;

/**
 *
 * @author aiman
 */
public class SumaDigito {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(sumaDigitos(num));
    }
    public static int sumaDigitos(int numero){
        if(numero<10){
            return 1;
        }else{
            return (numero%10)+ sumaDigitos(numero/10);
        }
    }
}
