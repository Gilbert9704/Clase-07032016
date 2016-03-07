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
public class Familia {
    
    private String apellidoFamilia[];
    private Persona[] x;

    public Familia(String[] apellidoFamilia, Persona[] x) {
        this.apellidoFamilia = new String[5];
        this.x = new Persona[4];
    }

    public String[] getApellidoFamilia() {
        return apellidoFamilia;
    }

    public void setApellidoFamilia(String[] apellidoFamilia) {
        this.apellidoFamilia = apellidoFamilia;
    }

    public Persona[] getX() {
        return x;
    }

    public void setX(Persona[] x) {
        this.x = x;
    }

    
}
