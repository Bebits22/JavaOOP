
package lab02.quiz3;

import java.util.Scanner;

public class Lab02Quiz3 {

    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        int number , temp ,digit, sum=0;
        
        System.out.println("Enter the number: ");
        number = reader.nextInt();
        
        temp = number;
        
        while(number > 0)
        {
            digit = number % 10 ;
            number = number/10;
            sum = sum + (digit*digit*digit);
        }
        
        if(temp == sum)
        {
            System.out.println(temp + "is an Armstrong Number.");
        }
        else
            System.out.println(temp + " is not an Armstrong Number.");
        
    }
    
}
