package encapsulamiento.base;

public class Employee extends Person {
    private String position;

    public Employee(String name, int age, String address, String country, String position) {
        super(name, age, address, country);
        this.position = position;
    }

    public void showInfoEmployee(){
        showAge();
        showAddress();
        System.out.println("Nombre: " + getName());
        System.out.println("País: " + getCountry());
        System.out.println("Puesto: " + this.position);
    }
}
