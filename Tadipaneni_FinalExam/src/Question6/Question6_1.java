/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer for question6 : Tadipaneni Vyshnavi");
        try {
            FileReader file1 = new FileReader("somefile.txt");
            FileReader file2;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception" + ex);
        }
    }

}
