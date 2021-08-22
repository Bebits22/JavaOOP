
package lab05.quiz6;

public class Lab05Quiz6 {

   
    public static void main(String[] args) {
        
        //initialize array
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        
        for(int i=0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.println("Elements of the array on Even Position: ");
        
        //Here, x will start from 1 as first even positioned element is present at position 1
        for(int x = 1 ; x<arr.length; x = x+2)
        {
            System.out.println(arr[x]);
        }
        
    }
    
}
