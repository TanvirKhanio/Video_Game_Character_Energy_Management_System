public class PlayerCharacter extends Character {
    private String playerName;
    public PlayerCharacter(int characterID, double energyLevel, String playerName) {
        super(characterID, energyLevel);
        if (energyLevel < 0) {
            throw new IllegalArgumentException("Energy level cannot be negative.");
        }
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    @Override
    public void displayInfo() {
        System.out.println("Character ID: " + getCharacterID());
        System.out.println("Player Name: " + playerName);
        System.out.println("Energy Level: " + getEnergyLevel());
    }
    @Override
    public double calculateRegenRate() {
        return 0;
    }
    public void restoreEnergy(int amount) {
        setEnergyLevel(getEnergyLevel() + amount);
    }
    public void restoreEnergy(double amount) {
        setEnergyLevel(getEnergyLevel() + amount);
    }
    public void useEnergy(double amount) throws InsufficientEnergyException {
        if (amount > getEnergyLevel()) {
            throw new InsufficientEnergyException("Not enough energy!");
        }
        setEnergyLevel(getEnergyLevel() - amount);
    }
}