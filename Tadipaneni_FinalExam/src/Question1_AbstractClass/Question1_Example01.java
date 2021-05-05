/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1_AbstractClass;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question1_Example01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question01_example01 : Vyshnavi Tadipaneni");
        Country country;
        country = new America();
        System.out.println("America has " + country.getNoOfStates() + " states");
        country = new India();
        System.out.println("India has " + country.getNoOfStates() + " states");
    }

}
