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
public class Question6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int arr[] = {11, 21, 51, 71, 90, 61};
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The specified index does not exist");
        }
    }

}
