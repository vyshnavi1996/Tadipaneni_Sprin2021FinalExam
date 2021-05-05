/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3_Example_widening;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Car extends Vehicle {

    private String model;
    private int price;

    public Car(String model, int price, int nooftyres) {
        super(nooftyres);
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "model: " + model + "\t price:" + price + "\t" + super.toString();
    }

}
