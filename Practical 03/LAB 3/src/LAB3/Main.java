package LAB3;
//Question 01
public class Main {

    public static void main(String[] args){
        Encapsulation obj = new Encapsulation("jenner",19,49990.00f);

        obj.setName("Jenner");
        obj.setAge(16);
        obj.setSalary(30_000.00f);
         */

        System.out.println("Name: "+obj.getName());
        System.out.println("Age: "+obj.getAge());
        System.out.println("Salary: "+obj.getSalary());
    }
}
