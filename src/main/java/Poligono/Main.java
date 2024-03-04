/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poligono;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class Main {
    public static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //metodo llenar poligono
        llenarPoligono();
        
        //mostrar los datos
        mostrarResultados();
    }
    public static void llenarPoligono(){
        int opcion;
        String respuesta = "";
        do{
            do{
                System.out.println("Introduce el poligono que desea: ");
                System.out.println("""
                                   1-Triangulo
                                   2-Rectangulo
                                   """);
                System.out.println("opcion: ");
                opcion = teclado.nextInt();
            }while(opcion<1||opcion>2);
            switch(opcion){
                case 1:
                    llenarTriangulo();
                break;
                case 2: 
                    llenarRectangulo();
                break;
            }
            teclado.nextLine();
            System.out.println("¿Desea introducir otro poligono?)s/n");
            respuesta = teclado.nextLine();
            System.out.println("");
        }while(respuesta.equalsIgnoreCase("s"));
    }
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.println("Introduce el lado 1");
        lado1 = teclado.nextDouble();
        System.out.println("Introduce el lado 2");
        lado2 = teclado.nextDouble();
        System.out.println("Introduce el lado 3");
        lado3 = teclado.nextDouble();
        
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3, 2);
        poligono.add(triangulo);
    }
    public static void llenarRectangulo(){
        double lado1,lado2;
        System.out.println("Introduce el lado 1");
        lado1 = teclado.nextDouble();
        System.out.println("Introduce el lado 2");
        lado2 = teclado.nextDouble(); 
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
    }
    public static void mostrarResultados(){
        for(Poligono poli : poligono){
            System.out.println(poli.toString());
            System.out.println("Area: "+poli.area());
            System.out.println("-------");
        }
    }
}
