package domain;

public class Lizard extends Scaly {

    private String kind;

    public Lizard(String name, int age, int weight, String typeofmovement, String kind) {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.typeofmovement=typeofmovement;
        this.kind=kind;
        
    }

    public Lizard() {
        this("Loky",7,4,"crawls", "drakon");
    }

    public Lizard(String name) {
        this(name,15,3,"crawls", "dinozaver" );
    }

    public void hunt() {
        System.out.println("Lizard is hunting. It is a descendant of dragons ");
    }

    public void regenerate() {
        System.out.println("Lizard is recovers. Folding tail");
    }

    @Override
    public void crawl() {
        System.out.println("Lizard crawls on sand. It is likes  heat");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind;
    }

    @Override
    public void speak() {
        System.out.println("Speak on a lizard");
    }

    @Override
    public void sleep() {
        System.out.println("Lizard is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Lizard eats flies");
    }
    
}
