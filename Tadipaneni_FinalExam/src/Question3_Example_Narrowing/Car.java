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
public class Car extends Vehicle {

    private String model;

    public Car(String model, int nooftyres) {
        super(nooftyres);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "model: " + model + super.toString();
    }

}
