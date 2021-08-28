package question03;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();

        int nn[] = new int[3];
        nn[0] = 3;
        nn[1] = 5;
        System.out.println(nn[1]);

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}
