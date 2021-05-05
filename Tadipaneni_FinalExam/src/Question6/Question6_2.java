/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 10;
        int num2 = 0;
        System.out.println("Answer for question6 : Tadipaneni Vyshnavi");
        try {
            int res = num1 / num2;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception denominator should not be zero" + e);
        }

    }
}
