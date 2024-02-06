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
public class Main {
    public static void main(String[] args) {
//        Museo museo = new Museo();
//        
//       
//        museo.añadirObra(new ObraDeArte("Mona Lisa","Pintura"));
//        System.out.println(museo);
        List<ObraDeArte> listaObras = new ArrayList();
        listaObras.add(new ObraDeArte("Guernica","Pintura"));
        listaObras.add(new ObraDeArte("Messi","Futbolista"));

        Museo reinaSofia = new Museo("ReinaSofia","23",
                new Director("Pepe","123",10),listaObras);
        System.out.println(reinaSofia);
    }
}
