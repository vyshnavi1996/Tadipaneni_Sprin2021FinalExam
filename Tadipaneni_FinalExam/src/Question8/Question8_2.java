/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question8_2 {

    public static int[] array1 = new int[10];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Answer for question8 : Tadipaneni Vyshnavi");
        try {
            array1[11] = 9;
            System.out.println("Array index is valid");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }
    }
}
