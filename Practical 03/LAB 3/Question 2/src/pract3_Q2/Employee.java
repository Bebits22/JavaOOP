package pract3_Q2;

public class Employee {
    private String name;
    private float basicSalary;
    private float bonus;
    private float bonusAmnt;

    //Constructors
    public Employee(float b){
        bonus = b;
    }

    //Getter
    public String getName(){
        return name;
    }
    public float getBasicSalary() {
        return basicSalary;
    }
    public float getBonus(){
        return bonus;
    }

    //Setter
    public void setName(String newName){
        this.name = newName;
    }
    public void setBasicSalary(float newBasSalary){
        this.basicSalary = newBasSalary;
    }

    public void calcBonus(){
        float bonusAmnt;
        bonusAmnt = basicSalary + bonus;
        System.out.println(bonusAmnt);
    }
}
