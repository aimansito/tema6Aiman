/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class Celda {

    private static ArrayList<Integer> numCasilla = new ArrayList<>();
    private int fila ;
    private int columna;

    public Celda(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

   

    public Celda() {
    }
    
    

    public ArrayList<Integer> getNumCasilla() {
        return numCasilla;
    }

    public void setNumCasilla(ArrayList<Integer> numCasilla) {
        this.numCasilla = numCasilla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Celda{");
        sb.append("fila=").append(fila);
        sb.append(", columna=").append(columna);
        sb.append('}');
        return sb.toString();
    }
    
    

//    public static ArrayList<Integer> posicionCasilla(int[][] numeros){
//        for(int i = 0;i<numeros.length;i++){
//            for(int j = 0;j<numeros[i].length;j++){
//                if(numeros[i][j]==1){
//                    try{
//                        if(numeros[i][j++]==1){
//                               numCasilla.add(numeros[i][j]);
//                        }else if(numeros[i++][j]==1){
//                               numCasilla.add(numeros[i][j]);
//                        }else if(numeros[i--][j]==1){
//                               numCasilla.add(numeros[i][j]);
//                        }else if(numeros[i][j--]==1){
//                               numCasilla.add(numeros[i][j]);
//                        }
//                    }catch(IndexOutOfBoundsException iobe){
//                           System.out.println("Te has salido");
//                    }
//                }else{
//                    break;
//                }
//            }
//        }
//        return numCasilla;
//    }
     public static ArrayList<Integer> posicionCasilla(int[][] numeros) {
        ArrayList<Integer> numCasilla = new ArrayList<>();
        boolean encontrado = false;
        
        // Recorremos la matriz
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                // Si encontramos el primer elemento de la serpiente
                if (numeros[i][j] == 1) {
                    encontrado = true;
                    int x = i;
                    int y = j;
                    
                    // Almacenamos el primer elemento
                    numCasilla.add(numeros[x][y]);
                    
                    // Seguimos buscando los siguientes elementos de la serpiente
                    while (encontrado) {
                        // Si el siguiente elemento está dentro de los límites de la matriz
                        if (x + 1 < numeros.length && numeros[x + 1][y] == 1) {
                            numCasilla.add(numeros[++x][y]);
                        } else if (y + 1 < numeros[x].length && numeros[x][y + 1] == 1) {
                            numCasilla.add(numeros[x][++y]);
                        } else {
                            encontrado = false; // La serpiente termina
                        }
                    }
                    
                    // Si hemos encontrado la serpiente, terminamos el bucle externo
                    break;
                }else{
                    numCasilla.add(-1);
                }
            }
            // Si ya hemos encontrado la serpiente, terminamos el bucle externo
            if (encontrado) {
                break;
            }
        }
        
        return numCasilla;
     }
}
