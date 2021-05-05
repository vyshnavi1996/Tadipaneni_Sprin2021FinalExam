/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1_Interface2;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question1_Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question01_example02 : Vyshnavi Tadipaneni");
        Dresses x;
        x = new TraditionalDresses();
        System.out.println("Traditional Dress has " + x.getCost() + " rupees");
        System.out.println("Traditional Dress has " + x.getSize() + " size");
        x = new WesternDresses();
        System.out.println("western Dress has " + x.getCost() + " rupees");
        System.out.println("western Dress has " + x.getSize() + " size");
    }
}
