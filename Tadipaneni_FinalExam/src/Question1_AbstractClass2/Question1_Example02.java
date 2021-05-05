/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1_AbstractClass2;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question1_Example02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question01_example02 : Vyshnavi Tadipaneni");
        Employee employee;

        employee = new Staff();

        System.out.println("Staff get salary $" + employee.getSalary());

        employee = new Faculty();

        System.out.println("Faculty get salary $" + employee.getSalary());

    }

}
