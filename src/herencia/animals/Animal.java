package herencia.animals;

// Clase base (Superclase)
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " hace un sonido.");
    }

    public void showName() {
        System.out.println("El nombre del animal es: " + name);
    }

    public void move() {
        System.out.println("El animal se está moviendo.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
