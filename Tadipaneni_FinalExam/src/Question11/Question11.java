/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 * creating a main method to print the values.
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question11 : Tadipaneni Vyshnavi");
        //Creating an object using constructor variables.
        Bottle bottle1 = new Bottle("red", "plain");
        //creating an object using constructor variables.
        Bottle bottle2 = new Bottle("red", "plain");
        System.out.println("***** Hash Code ***** ");
        //Printing hashcode value for bottle object1.
        System.out.println(bottle1.hashCode());
        //Printing hashcode value for bottle object2.
        System.out.println(bottle2.hashCode());
        System.out.println("***** Equals ***** ");
        //Printing an statement that compares two objects if it is same print true or else false.
        System.out.println(bottle1.equals(bottle2));
        //Printing an statement that compares two objects if it is same print true or else false.
        System.out.println(bottle2.equals(bottle1));
        //Printing an statement that compares bottle object1 with bottle object2 by calling the method name.
        System.out.println(bottle1.equals(bottle2.getColor()));

    }

}
