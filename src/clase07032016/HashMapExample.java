/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase07032016;

import java.util.*;
/**
 *
 * @author Estudiante
 */
public class HashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se estudiara el uso del HashMap
        HashMap <String, Estudiante> students = new HashMap <String, Estudiante>();
        
        Estudiante e1 = new Estudiante("12345-12", "Gilbert");
        Estudiante e2 = new Estudiante("12345-13", "Andres");
        Estudiante e3 = new Estudiante("12345-14", "William");
        
        students.put(e1.getIdNo(), e1);
        students.put(e2.getIdNo(), e2);
        students.put(e3.getIdNo(), e3);
        
        String id = "12345-12";
        System.out.println("Intentemos recuperar los datos");
        Estudiante x = students.get(id);
        if (x != null){
            System.out.println("Encontrado! Nombre = " + x);
        }
        else{
            System.out.println("ID invalida: " + id);
        }
        
        for (Estudiante d : students.values()){  //(.values) coje todo los elementos almacenados en e1, e2 y los une en una coleccion
          System.out.println("ID: " + d.getIdNo());
          System.out.println("ID: " + d.getName());
          System.out.println();     
        }
    }
    
}
