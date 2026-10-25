package herencia.animals;

public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " está maullando. ¡Miauuuuuuuuu!");
    }

    public void showColor() {
        System.out.println(getName() + " es de color " + this.color);
    }
}
