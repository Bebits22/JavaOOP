
package lab04.quiz5;

import java.util.Scanner;


public class Lab04Quiz5 {

    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String Sentence = reader.nextLine();
        String[] newSentence = Sentence.split(" ");
        
        for (String newSentence1 : newSentence) {
            System.out.print(newSentence1);
        }
    }
    
}
