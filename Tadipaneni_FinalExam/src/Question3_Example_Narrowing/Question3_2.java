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
public class Question3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle vehicle = new Vehicle(2);
        System.out.println("Answer for Question3_2 : Tadipaneni Vyshnavi");
        System.out.println("No of tyres vehicle is: " + vehicle.getNooftyres());
        Car car = new Car("Benz", 4);
        System.out.println(car.toString());
        vehicle = car;//Polymorphic substitution
        car = (Car) vehicle;//narrow type Casting
    }
}
