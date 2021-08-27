package pract3_Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee name:\t");
        String n = sc.nextLine();
        System.out.println("Enter the basic salary:\t");
        float bs = sc.nextFloat();
        System.out.println("Enter the bonus:\t");
        float bon = sc.nextFloat();

        Employee obj = new Employee(bon);

        obj.setName(n);
        obj.setBasicSalary(bs);

        System.out.println("Name: "+obj.getName());
        System.out.println("Basic Salary: "+obj.getBasicSalary());
        System.out.println("Bonus: "+obj.getBonus());
        System.out.println("Bonus Amount: ");
        obj.calcBonus();
    }
}
