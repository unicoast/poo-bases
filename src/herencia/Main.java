package herencia;

import herencia.animals.Animal;
import herencia.animals.Cat;
import herencia.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Toby");
        Dog dog = new Dog("Duque", "Pastor Alemán");
        Cat cat = new Cat("Clarita", "Negro/Blanco");

        animal.makeSound();
        animal.showName();
        System.out.println("======================================");
        dog.makeSound();
        dog.showName();
        dog.showRace();
        System.out.println("======================================");
        cat.makeSound();
        cat.showName();
        cat.showColor();
    }
}
