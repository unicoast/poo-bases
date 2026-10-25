package herencia.animals;

// Clase hija (Subclase)
public class Dog extends Animal {
    private String race;

    public Dog(String name, String race) {
        super(name);
        this.race = race;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " está ladrando. ¡Wooooooooof!");
    }

    public void showRace() {
        System.out.println(getName() + " es de la raza " + this.race);
    }
}
