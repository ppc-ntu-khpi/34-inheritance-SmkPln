package domain;

public class Animal {

    protected String name;

    protected int age;

    protected int weight;

    protected String typeofmovement;

    public Animal() {
        name="generic animal";
        weight=30;
    }

    public void eat() {
    System.out.println("It eats");
    }

    public void sleep() {
    System.out.println("It is sleeping");
    }

    public void speak() {
    System.out.println("It is speaking");
    }

    @Override
    public String toString() {
        return "Animal:" + "\nName: \t" + name + "\nAge:\t" + age + " \nWeight:\t" + weight + " \nType of movement:\t" + typeofmovement;
    }

}
