public class Mage extends PlayerCharacter {

    public Mage(int characterID, double energyLevel, String playerName) {
        super(characterID, energyLevel, playerName);
    }

    @Override
    public double calculateRegenRate() {
        return 0.05;
    }

    @Override
    public void displayInfo() {
        System.out.println("Character Type: Mage");
        System.out.println("Character ID: " + getCharacterID());
        System.out.println("Player Name: " + getPlayerName());
        System.out.println("Energy Level: " + getEnergyLevel());
        System.out.println("Regen Rate: 5%");
    }
}