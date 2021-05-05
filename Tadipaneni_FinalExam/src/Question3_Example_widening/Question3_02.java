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
public class Question3_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle vehicle = new Vehicle(4);
        System.out.println("Answer for question3_2 : Tadipaneni Vyshnavi");
        System.out.println(vehicle.toString());
        Vehicle car = new Car("Benz", 100000, 4);
        System.out.println(car.toString());
    }

}
