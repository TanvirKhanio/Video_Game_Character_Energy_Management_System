public class Main {

    public static void main(String[] args) {
        Mage mage = new Mage(101, 100, "Tanvir");
        Warrior warrior = new Warrior(102, 80, "Shanto");
        Character[] characters = new Character[2];
        characters[0] = mage;
        characters[1] = warrior;
        System.out.println("Character Information");
        for (Character character : characters) {character.displayInfo();
            System.out.println("Regeneration Rate: "+ (character.calculateRegenRate() * 100) + "%");
            System.out.println();
        }
        System.out.println("Energy Restoration");
        mage.restoreEnergy(20);
        System.out.println("Mage energy after int restore: "+ mage.getEnergyLevel());
        mage.restoreEnergy(15.5);
        System.out.println("Mage energy after double restore: " + mage.getEnergyLevel());
        System.out.println("\nEnergy Usage");
        try {
            mage.useEnergy(50);
            System.out.println("Energy used successfully.");
            System.out.println("Remaining Energy: " + mage.getEnergyLevel());
        } catch (InsufficientEnergyException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Final Energy: "+ mage.getEnergyLevel());
        }
        System.out.println("\nMulti-Catch Example");
        try {
            mage.useEnergy(500);
            int number = 10;
            int divisor = 0;
            int result = number / divisor;
        } catch (InsufficientEnergyException | ArithmeticException e) {
            System.out.println("Exception handled: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}