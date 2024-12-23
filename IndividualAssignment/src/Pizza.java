// Part A: Pizza Class

import java.util.*;

// Enum for meat choices
enum MeatChoice {
    CHICKEN, PEPPERONI, SAUSAGE
}

// Enum for vegetable choices
enum VegChoice {
    ONION, PEPPER, MUSHROOM, OLIVE, TOMATO
}

// Custom exception for invalid choices
class InvalidPizzaChoiceException extends Exception {
    public InvalidPizzaChoiceException(String message) {
        super(message);
    }
}

// Pizza Class
class Pizza {
    private int numSlices;
    private MeatChoice meatChoice;
    private VegChoice vegChoice;

    // Default constructor
    public Pizza() {
        Random rand = new Random();
        this.numSlices = rand.nextInt(8) + 1; // Random slices (1 to 8)
        this.meatChoice = MeatChoice.values()[rand.nextInt(MeatChoice.values().length)];
        this.vegChoice = VegChoice.values()[rand.nextInt(VegChoice.values().length)];
    }

    // Parameterized constructor
    public Pizza(int numSlices, MeatChoice meatChoice, VegChoice vegChoice) throws InvalidPizzaChoiceException {
        if (numSlices <= 0 || numSlices > 8) {
            throw new InvalidPizzaChoiceException("Invalid number of slices");
        }
        this.numSlices = numSlices;
        this.meatChoice = meatChoice;
        this.vegChoice = vegChoice;
    }

    // Getters and setters
    public int getNumSlices() {
        return numSlices;
    }

    public void setNumSlices(int numSlices) {
        this.numSlices = numSlices;
    }

    public MeatChoice getMeatChoice() {
        return meatChoice;
    }

    public void setMeatChoice(MeatChoice meatChoice) {
        this.meatChoice = meatChoice;
    }

    public VegChoice getVegChoice() {
        return vegChoice;
    }

    public void setVegChoice(VegChoice vegChoice) {
        this.vegChoice = vegChoice;
    }

    // toString method
    @Override
    public String toString() {
        return "Pizza [Slices=" + numSlices + ", Meat=" + meatChoice + ", Veg=" + vegChoice + "]";
    }
}
