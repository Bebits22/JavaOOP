
package lab03.quiz4;

public class Lab03Quiz4 {

    
    public static void main(String[] args) {
        
        String sentence = "Let's learn Programming in JAVA";
        
        int count = 0;
        
        //counts each character except space
        for(int i = 0;i < sentence.length(); i++)
        {
            if(sentence.charAt(i)!= ' ')
            {
                count++;
            }
        }
        
        
        System.out.println("Total number of characters in the string: " +count);
    }
    
}
