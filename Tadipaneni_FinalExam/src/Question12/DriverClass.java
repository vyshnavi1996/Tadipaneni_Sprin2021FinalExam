/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Employee employee1 = new Employee(1, "EmployeeX", 1000);
        Employee employee2 = new Employee(2, "EmployeeA", 1200);
        Employee employee3 = new Employee(3, "EmployeeR", 800);
        Employee employee4 = new Employee(4, "EmployeeS", 920);
        Employee employee5 = new Employee(5, "EmployeeM", 1500);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee2);
        employees.add(employee1);
        employees.add(employee5);
        employees.add(employee4);
        employees.add(employee3);
        System.out.println("Answer for question12 : Tadipaneni Vyshnavi");
        System.out.println("Default Employee");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        Collections.sort(employees);
        System.out.println("");
        System.out.println("Sort the list by its natural order:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        Collections.sort(employees, new SalaryComparator());
        System.out.println("");
        System.out.println("Sort the list by supplying a new Comparator<Employee> that sorts by salary:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        Collections.sort(employees, new NameComparator());
        System.out.println("");
        System.out.println("Sort the list by supplying a new Comparator<Employee> that sorts by name:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

}
