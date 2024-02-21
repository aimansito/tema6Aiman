/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegos;

import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Videojuegos> juegos = new ArrayList<>();
        
        Videojuegos v1 = new Videojuegos("God Of War","Playstation",1,"+18");
        Videojuegos v2 = new Videojuegos("Mario Kart","Nintendo 64",4,"Carreras/Arcade");
        Videojuegos v3 = new Videojuegos("Pokemon","Nintendo",1,"RPG");
        Videojuegos v4 = new Videojuegos("eFootball 2024","PC",4,"Fútbol");
        
        juegos.add(v1);
        juegos.add(v2);
        juegos.add(v3);
        juegos.add(v4);
        
        for(Videojuegos juego : juegos){
            System.out.println("Título: "+juego.getTitulo()+"\n"+"Consola: "+juego.getConsola()+"\n"+"Jugadores: "+juego.getCantidadJugadores()+"\n"+"------------");
        }
        
        for(Videojuegos juego : juegos){
            juegos.get(0).setTitulo("Dragon Ball Z");
            juegos.get(0).setCantidadJugadores(2);
        }
        for(Videojuegos juego : juegos){
            System.out.println("Título: "+juego.getTitulo()+"\n"+"Consola: "+juego.getConsola()+"\n"+"Jugadores: "+juego.getCantidadJugadores()+"\n"+"------------");
        }
        for(Videojuegos juego : juegos){
            if(juego.getConsola().equalsIgnoreCase("Nintendo")){
                System.out.println(juego);
            }
        }
    }
}
