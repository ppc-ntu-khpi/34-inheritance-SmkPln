package test;

import domain.Lizard;

public class TestAnimal {

    public static void main(String[] args) {
        Lizard lizard = new Lizard("Pugna");
        System.out.println(lizard);
        lizard.crawl();
        lizard.eat();
        lizard.hunt();
        lizard.regenerate();
        lizard.speak();
        lizard.sleep();
    }
}
