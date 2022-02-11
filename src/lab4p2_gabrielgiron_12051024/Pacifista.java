/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gabrielgiron_12051024;

/**
 *
 * @author Galex
 */
public class Pacifista extends Persona{
    private String Discurso = "Quiero Paz";

    public Pacifista(String Nombre, String Apellido, int Edad, int HP) {
        super(Nombre, Apellido, Edad, HP);
    }
 
    public String getDiscurso() {
        return Discurso;
    }

    public void setDiscurso(String Discurso) {
        this.Discurso = Discurso;
    }

    @Override
    public String toString() {
        return super.toString()+" Pacifista{" + "Discurso=" + Discurso + '}';
    }
    
    
}
