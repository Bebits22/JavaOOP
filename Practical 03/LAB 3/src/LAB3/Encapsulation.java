package LAB3;
public class Encapsulation {
    private String name;
    private int age;
    private float salary;

    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public float getSalary(){
        return salary;
    }

    //Setter
    public void setName(String newName){
        this.name =  newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setSalary(float newSalary){
        this.salary = newSalary;
    }
}
