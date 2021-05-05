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
public class Question8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException, IOException {
        // TODO code application logic here
        System.out.println("Answer for question8 : Tadipaneni Vyshnavi");
        FileReader file2;
        try {
            file2 = new FileReader("somefile.txt");
            file2.read();
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception" + e);
        } catch (ArithmeticException | IOException e) {
            System.out.println("Arithmetic exception" + e);
        }
    }
}
