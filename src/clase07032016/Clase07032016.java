/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase07032016;

import java.util.*;  //Siempre importar esto cuando se haga uso del Array List, con el * se importa todo del paquete util.
/**
 *
 * @author Estudiante
 */
public class Clase07032016 {
    //como atributos se tienen los propios y los que se comprten
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Se va estudiar el uso de ArrayList
       ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
       
       Estudiante a = new Estudiante("1","F");
       Estudiante b = new Estudiante("2","I");
       Estudiante c = new Estudiante("3","V");
       
       estudiantes.add(a);
       estudiantes.add(b);
       estudiantes.add(c);
       //add para agregar elementos
       
        for (Estudiante s : estudiantes){
            System.out.println(s.getName());
        }
        
        estudiantes.remove(0); //me borra el elemento de la posicion cero (0) y el de la posicion 1 pasa a estar en el cero
        //estudiantes.add(index, c); quito el elemento que deseo
        
        for (int i = 0; i < estudiantes.size(); i++){ //size me permite conocer el tamaño del arreglo
            Estudiante s = estudiantes.get(i); //get para obtener un elemento de una posicion determinada
            System.out.println("No se que iba aquí");    
        }
    }
    
}
