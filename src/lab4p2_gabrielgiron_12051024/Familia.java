/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gabrielgiron_12051024;

import java.util.ArrayList;

/**
 *
 * @author Galex
 */
public class Familia {
    private String Apellido;
    private ArrayList<Persona> Personas = new ArrayList();

    public Familia(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public ArrayList<Persona> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Persona> Personas) {
        this.Personas = Personas;
    }

    @Override
    public String toString() {
        return "Familia{" + "Apellido=" + Apellido + ", Personas=" + Personas + '}';
    }
    
    
}
