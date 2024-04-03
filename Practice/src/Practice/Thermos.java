package Practice;

public class Thermos {
	private double availableVolume; // Available volume in litres
    private String brand; // Brand of the thermos
    private String liquid; // Liquid inside the thermos

    // Constructor to initialize the thermos
    public Thermos(String brand, String liquid) {
        this.availableVolume = 1.0; // Capacity of the thermos in litres
        this.brand = brand;
        this.liquid = liquid;
    }

    // Method to add liquid into thermos
    public void addLiquid(double volume) {
        if (this.availableVolume >= volume) {
            this.availableVolume -= volume;
            System.out.println("Added " + volume + " litres of " + this.liquid + " into the thermos.");
        } else {
            System.out.println("Thermos does not have enough space for this volume of liquid.");
        }
    }

    // Method to pour out liquid from the Thermos
    public void pourOutLiquid(double volume) {
        if (this.availableVolume + volume <= 1.0) {
            this.availableVolume += volume;
            System.out.println("Poured out " + volume + " litres of " + this.liquid + " from the thermos.");
        } else {
            System.out.println("Thermos does not have enough liquid to pour out.");
        }
    }

    // Method to display thermos details
    public void displayDetails() {
        System.out.println("Thermos Details:");
        System.out.println("Brand: " + this.brand);
        System.out.println("Liquid: " + this.liquid);
        System.out.println("Available Volume: " + this.availableVolume + " litres");
    }

    // Main method for testing
    public static void main(String[] args) {
        Thermos myThermos = new Thermos("Godrej", "orange juice");
        myThermos.displayDetails();
        myThermos.addLiquid(0.5);
        myThermos.addLiquid(0.7);
        myThermos.displayDetails();
        myThermos.pourOutLiquid(0.3);
        myThermos.displayDetails();
    }
}