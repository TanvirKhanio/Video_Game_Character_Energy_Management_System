public abstract class Character {
    private int characterID;
    private double energyLevel;
    protected Character(int characterID, double energyLevel) {
        this.characterID = characterID;
        this.energyLevel = energyLevel;
    }
    public abstract double calculateRegenRate();
    public void displayInfo() {
        System.out.println("Character ID: " + characterID);
        System.out.println("Energy Level: " + energyLevel);
    }
    protected int getCharacterID() {
        return characterID;
    }
    protected double getEnergyLevel() {
        return energyLevel;
    }
    protected void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }
}