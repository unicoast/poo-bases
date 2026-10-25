package encapsulamiento.base;

public class Person {
    private String name;
    protected int age;
    String address;
    public String country;

    public Person(String name, int age, String address, String country) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("El nombre es requerido.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    protected void showAge(){
        System.out.println("Edad: " + this.age);
    }

    void showAddress(){
        System.out.println("Dirección: " + this.address);
    }

    public void showInformation(){
        System.out.println("Nombre: " + this.name);
        System.out.println("Edad: " + this.age);
        System.out.println("Dirección: " + this.address);
        System.out.println("País: " + this.country);
    }

    private void greet(){
        System.out.println("Hola, soy " + this.name);
    }

    public void present(){
        greet();
    }
}
