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
public class Question_10 {

    static int linearSearch(int a[], int start, int end, int number) {
        if (start > end) {
            return -1;
        } else if (a[start] == number) {
            return start;
        } else if (a[end] == number) {
            return end;
        }
        return linearSearch(a, start + 1, end - 1, number);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {23, 2, 4, 6, 12, 7, 1, 99};
        int index = linearSearch(a, 0, a.length - 1, 23);
        System.out.println("Answer for question10 : Tadipaneni Vyshnavi");
        if (index != -1) {
            System.out.println(23 + " is found at index " + index);
        } else {
            System.out.println(23 + " is not present");
        }
    }
}
