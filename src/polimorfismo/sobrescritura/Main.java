package polimorfismo.sobrescritura;

import polimorfismo.sobrescritura.animals.Animal;
import polimorfismo.sobrescritura.animals.Cat;
import polimorfismo.sobrescritura.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
