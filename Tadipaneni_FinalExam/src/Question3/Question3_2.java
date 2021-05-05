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
public class Question3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for 2 : Tadipaneni Vyshnavi");
        // Widening Casting
        System.out.println("Widening Casting");
        char a = 'v';
        long longvalue = a; // Widening casting from int to long
        float floatValue = longvalue;  // Widening casting from long to float
        System.out.println("char value " + a);
        System.out.println("Long value " + longvalue);
        System.out.println("Float value " + floatValue);

        // Narrowing Casting
        System.out.println("\nNarrowing Casting");
        double doubleNumber = 10.04;
        short shortvalue = (short) doubleNumber;//Narrowing casting from double to short
        byte bytevalue = (byte) doubleNumber; // Narrowing casting from double to long
        int number = (int) doubleNumber; // Narrowing casting from double to int

        System.out.println("Double value " + doubleNumber);
        System.out.println("short value " + shortvalue);
        System.out.println("byte value " + bytevalue);
        System.out.println("Int value " + number);
    }

}
