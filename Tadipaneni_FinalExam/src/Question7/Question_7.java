/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question7 : Tadipaneni Vyshnavi");
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000) + 1;
        }
        Scanner input = new Scanner(System.in);

        System.out.println("enter the index of the array ");
        try {
            System.out.println("The corresponding element value is " + arr[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }

}
