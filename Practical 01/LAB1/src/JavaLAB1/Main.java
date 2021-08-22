package JavaLAB1;

public class Main {

    public static void main(String[] args) {
        //Question 01
        System.out.println("Hello World");

        //Question 02
        System.out.println("Dahami Senevirathne \nBSc in Computer Science(Honours)");

        //Question 03
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ){
            if( x == 30 ){
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        System.out.print("I'm out of the Loop now");
        //output: 10, 20, I'm out of the Loop now

        //Question 04
        //int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ){
            if( x == 30 ){
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        System.out.print("I'm out of the Loop now\n");

        //Question 05
        char grade = 'A';
        switch(grade){
            case 'A':
                System.out.println("Exerllent");break;
            case 'D':
                System.out.println("You passed");break;
            case 'F':
                System.out.println("Better try again");break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is "+grade);

        //Question 06
        //When repeat the same statement at line number 6, we get the output as "unreachable statement".

        //Repeating the same scenario using if-else statement.
        char Grade = 'A';
        if(Grade == 'A'){
            System.out.println("Exerllent");
        }
        else if(Grade == 'D'){
            System.out.println("You passed");
        }
        else if(Grade == 'F'){
            System.out.println("Better try again");
        }
        else
            System.out.println("Invalid Grade");
        System.out.println("Your grade is "+Grade);
    }
}
