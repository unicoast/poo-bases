package clases.ejemplo02;

public class Main {
    public static void main(String[] args) {
        clases.ejemplo02.Character xlr8 = new clases.ejemplo02.Character("XLR8", "Kineceleran", 10000);
        clases.ejemplo02.Character upgrade = new clases.ejemplo02.Character("Upgrade", "Galvanic Mechomorph", 8000);

        xlr8.fight(200);
        xlr8.train(1000);
        System.out.println("=================");
        upgrade.fight(200);

        Character.showTotalCharacters();
    }
}
