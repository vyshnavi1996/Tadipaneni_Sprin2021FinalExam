/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question9_2 {

    public void getageRestriction(int age) throws ArithmeticException {
        if (age < 21) {
            throw new ArithmeticException("your are not eligible for vote");
        } else {
            System.out.println("Thanks for voting");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question9 : Tadipaneni Vyshnavi");
        try {
            Question9_2 throwsexample = new Question9_2();
            throwsexample.getageRestriction(20);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
