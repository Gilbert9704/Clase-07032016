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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
       
       Estudiante a = new Estudiante("1","F");
       Estudiante b = new Estudiante("2","I");
       Estudiante c = new Estudiante("3","V");
        
       estudiantes.add(a);
       estudiantes.add(b);
       estudiantes.add(c);
       
    }
    
}
