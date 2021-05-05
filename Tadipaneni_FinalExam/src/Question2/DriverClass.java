/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class DriverClass {

    public static void main(String[] args) {
        /**
         * @param args the command line arguments
         */
        System.out.println("Answer for question2 : Tadipaneni Vyshnavi");
        GeometricObject[] objects = {new Square(2), new Square(3), new Square(4), new Square(5),
            new Square(6)};

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Area is " + objects[i].getArea());
            if (objects[i] instanceof Colorable) {
                ((Colorable) objects[i]).howToColor();
            }
        }
    }
}
