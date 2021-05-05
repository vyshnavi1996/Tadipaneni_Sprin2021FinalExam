/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3_Example_Narrowing;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Vehicle {

    private int nooftyres;

    public Vehicle(int nooftyres) {
        this.nooftyres = nooftyres;
    }

    public int getNooftyres() {
        return nooftyres;
    }

    public void setNooftyres(int nooftyres) {
        this.nooftyres = nooftyres;
    }

    @Override
    public String toString() {
        return "\tnooftyres: " + nooftyres;
    }
}
