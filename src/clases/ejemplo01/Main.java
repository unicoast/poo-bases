package clases.ejemplo01;

public class Main {
    public static void main(String[] args) {
        Book sobrenatural =  new Book("Sobrenatural", "Joe Dispenza", 2018,"Desarrollo Personal");
        Book javaParaDummies = new Book("Java para Dummies", "Barry Burd", 1996, "Programación");
        sobrenatural.read();
        sobrenatural.info();
        System.out.println("-------------------------");
        javaParaDummies.read();
        javaParaDummies.info();
    }
}
