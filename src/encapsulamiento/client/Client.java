package encapsulamiento.client;

import encapsulamiento.base.Person;

public class Client extends Person {
    private String clientNumber;

    public Client(String name, int age, String address, String country, String clientNumber) {
        super(name, age, address, country);
        this.clientNumber = clientNumber;
    }

    public void showClientInfo(){
        System.out.println("Número de cliente: " + this.clientNumber);
        showAge();
        System.out.println("Nombre: " + getName());
    }
}
