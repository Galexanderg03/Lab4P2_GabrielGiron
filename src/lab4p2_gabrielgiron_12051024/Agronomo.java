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
public class Agronomo extends Persona{
    private int Atk = 100;

    public Agronomo(String Nombre, String Apellido, int Edad, int HP) {
        super(Nombre, Apellido, Edad, HP);
    }

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    @Override
    public String toString() {
        return super.toString() + " Agronomo{" + "Atk=" + Atk + '}';
    }
    
}
