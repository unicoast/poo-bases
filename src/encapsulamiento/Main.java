package encapsulamiento;

import encapsulamiento.base.Employee;
import encapsulamiento.base.Person;
import encapsulamiento.client.Client;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Novak", 39, "Calle Elástica", "Serbia");
        Employee employee = new Employee("Rafael", 40, "Calle Tierra Batida", "España", "Tenista");
        Client client = new Client("Roger", 45, "Calle Elegante", "Suiza", "0003");

        person.showInformation();
        person.present();
        System.out.println("=========================");
        employee.showInfoEmployee();
        System.out.println("=========================");
        client.showClientInfo();
        System.out.println("=========================");
        System.out.println("País Persona: " + person.getCountry());
    }
}
