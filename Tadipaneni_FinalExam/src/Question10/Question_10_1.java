/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question_10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question10 : Tadipaneni Vyshnavi");
        int a = sum(20);
        System.out.println(a);
    }

    public static int sum(int i) {
        if (i > 0) {
            return i + sum(i - 1);
        } else {
            return 0;
        }
    }
}
