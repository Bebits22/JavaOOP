
package lab02.quiz1;

import java.util.Scanner;


public class Lab02Quiz1 {

    
    public static void main(String[] args) {
        
        //Quiz01
        /*int num1 = 56784;
        
        if(num1%2 == 0)
        {
            System.out.println(num1 + " is an Even Number.");
        }
        else
        
            System.out.println(num1 + " is an Odd Number.");
        
        */
        
        //Quiz02
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        
        //using conditional operators instead of if-else statement
        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
    }
    
}
