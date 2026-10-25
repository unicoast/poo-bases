package polimorfismo.sobrescritura.animals;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("El perro ladra.");
    }
}
