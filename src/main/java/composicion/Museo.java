/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aiman
 */
public class Museo { //clase contenedora
    private String nombre; //clases contenidas
    private String direccionPostal;
    private Director director;
    private List<ObraDeArte> listaObras;
    
    public Museo(){
//        this.nombre = nombre;
//        this.direccionPostal = direccion;
          this.nombre = "Reina sofia";
          this.direccionPostal = "Castellana 23";
        this.director = new Director("Perico","0342",2200);
        this.listaObras = new ArrayList();
        rellenarListaObras();
    }
    public Museo(String nombre,String direccion){
        this.nombre = nombre;
        this.direccionPostal = direccion;
//          this.nombre = "Reina sofia";
//          this.direccionPostal = "Castellana 23";
        this.director = new Director("Perico","0342",2200);
        this.listaObras = new ArrayList();
        rellenarListaObras();
    }

    public Museo(String nombre, String direccionPostal, Director director, List<ObraDeArte> listaObras) {
        this.nombre = nombre;
        this.direccionPostal = direccionPostal;
        this.director = director;
        this.listaObras = listaObras;
    }

    private void rellenarListaObras(){
        this.listaObras.add(new ObraDeArte("Guernica","Pintura"));
    }
    public void añadirObra(ObraDeArte obra){
        this.listaObras.add(obra);
    }
    public void quitarObra(ObraDeArte obra){
        this.listaObras.remove(obra);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public Director getDirector() {
        return director;
    }

    public List<ObraDeArte> getListaObras() {
        return listaObras;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Museo{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccionPostal=").append(direccionPostal);
        sb.append(", director=").append(director);
        sb.append(", listaObras=").append(listaObras);
        sb.append('}');
        return sb.toString();
    }
}
