/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Widening Casting
        System.out.println("Answer for question3_1 : Tadipaneni Vyshnavi");
        System.out.println("Widening Casting");
        int number = 2;
        long longvalue = number; // Widening casting from int to long
        float floatValue = longvalue;  // Widening casting from long to float
        System.out.println("Long value " + longvalue);
        System.out.println("Float value " + floatValue);
        // Narrowing Casting
        System.out.println("\nNarrowing Casting");
        double doubleNumber = 10.04;
        longvalue = (long) doubleNumber; // Narrowing casting from double to long
        number = (int) longvalue; // Narrowing casting from double to int

        System.out.println("Double value " + doubleNumber);
        System.out.println("Long value " + longvalue);
        System.out.println("Int value " + number);
    }
}
