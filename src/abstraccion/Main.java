package abstraccion;

import abstraccion.animals.Bird;
import abstraccion.animals.Cat;

public class Main {
    public static void main(String[] args) {
        Cat chulupin = new Cat();
        Bird hawk = new Bird();

        chulupin.makeSound();
        System.out.println("=========================");
        chulupin.sleep();
        System.out.println("=========================");
        hawk.fly();
        System.out.println("=========================");
        hawk.makeSound();
    }
}
