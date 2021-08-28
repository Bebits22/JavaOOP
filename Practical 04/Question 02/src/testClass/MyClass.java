package testClass;

public class MyClass extends Thread {
    public void run() {
        int x;
        for(x=1;x<=5;x++)
            System.out.println("x is "+x);
    }
}
