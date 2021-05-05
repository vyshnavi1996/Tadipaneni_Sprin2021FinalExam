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
public class Question_10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Welcome to java class";
        String reversed = reverseString(str);
        System.out.println("Answer for question10 : Tadipaneni Vyshnavi");
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
