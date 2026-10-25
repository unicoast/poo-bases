package abstraccion.animals;

public class Bird extends Animal implements Flying {
    @Override
    public void fly() {
        System.out.println("El pájaro está volando.");
    }

    @Override
    public void makeSound() {
        System.out.println("El pájaro hace ¡kik, kik, kik!");
    }
}
