/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase07032016;

/**
 *
 * @author Estudiante
 */
public class Estudiante {
    
    private String idNo;
    private String name;
    
    //Constructor
    public Estudiante(String idNo, String name) {
        this.idNo = idNo;
        this.name = name;
    }
    //Fin Constructor
    
    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    
    
}
