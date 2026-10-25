package clases.ejemplo02;

public class Character {
    private String name;
    private String race;
    private int powerLevel;

    public static int totalCharacter;

    public Character(String name, String race, int powerLevel) {
        this.name = name;
        this.race = race;
        this.powerLevel = powerLevel;
        totalCharacter++;
    }

    public Character() {}

    public void fight(int decrement){
        powerLevel -= decrement;
        if (powerLevel < 0){
            powerLevel = 0;
        }
        System.out.println(name + " ha luchado. Nivel de poder actual: " + powerLevel);
    }

    public void train(int increment){
        powerLevel += increment;
        System.out.println(name + " ha entrando. Nivel de poder actual: " + powerLevel);
    }

    public static void showTotalCharacters(){
        System.out.println("Número total de personajes: " + totalCharacter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public static int getTotalCharacter() {
        return totalCharacter;
    }

    public static void setTotalCharacter(int totalCharacter) {
        Character.totalCharacter = totalCharacter;
    }
}
