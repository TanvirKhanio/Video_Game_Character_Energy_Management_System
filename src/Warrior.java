public class Warrior extends PlayerCharacter {

    public Warrior(int characterID, double energyLevel, String playerName) {
        super(characterID, energyLevel, playerName);
    }
    @Override
    public double calculateRegenRate() {
        return 0.02;
    }
    @Override
    public void displayInfo() {
        System.out.println("Character Type: Warrior");
        System.out.println("Character ID: " + getCharacterID());
        System.out.println("Player Name: " + getPlayerName());
        System.out.println("Energy Level: " + getEnergyLevel());
        System.out.println("Regen Rate: 2%");
    }
}