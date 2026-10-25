package polimorfismo.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();

        System.out.println("Suma de Dos enteros: " + calculadora.sumar(5, 10));
        System.out.println("Suma de Tres enteros: " + calculadora.sumar(5, 10, 30));
        System.out.println("Suma de Dos decimales: " + calculadora.sumar(5.5, 3.2));
    }
}
