/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegos;

/**
 *
 * @author aiman
 */
public class Videojuegos {
    //Crear una clase llamada VideoJuego, que tenga los siguientes atributos:
//codigo, titulo, consola, cantidadJugadores, categoria(tener en cuenta todos sus atributos, constructores, métodos getters y setters).

//- Crear una ArrayList de tipo VideoJuego. Crear 5 videojegos y guardarlos en la collection.
//- Recorrer la ArrayList creada y mostrar por pantalla el titulo, consola y cantidad de jugadores de los video juegos almacenados.
//- Cambiar el nombre y la cantidad de jugadores de dos videojuegos. Mostrar por pantalla los datos de todos los videojuegos luego del cambio.
//- Recorrer la ArrayList y mostrar por pantalla únicamente a los videojuegos que sean de la consola "Nintendo 64"
    
    private String titulo;
    private String consola;
    private int cantidadJugadores;
    private String categoria;

    public Videojuegos(String titulo, String consola, int cantidadJugadores, String categoria) {
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadJugadores = cantidadJugadores;
        this.categoria = categoria;
    }

    public Videojuegos() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Videojuegos{");
        sb.append("titulo=").append(titulo);
        sb.append(", consola=").append(consola);
        sb.append(", cantidadJugadores=").append(cantidadJugadores);
        sb.append(", categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }
}
