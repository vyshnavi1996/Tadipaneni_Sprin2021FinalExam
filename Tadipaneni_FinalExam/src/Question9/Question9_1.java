/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

import java.util.Scanner;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer for question9_Example1 : Tadipaneni Vyshnavi");
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        try {
            if (b == 0) {
                throw new ArithmeticException("denominator value cannot be zero");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
