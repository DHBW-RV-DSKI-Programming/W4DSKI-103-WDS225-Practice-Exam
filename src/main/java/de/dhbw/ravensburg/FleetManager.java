package de.dhbw.ravensburg;

interface Maintainable {
    void performMaintenance();
}

abstract class Vehicle implements Maintainable {
    String model;
    double engineHealth;

    Vehicle(String model, double health) {
        this.model = model;
        this.engineHealth = health;
    }
}

class Truck extends Vehicle {
    Truck(String model, double health) { super(model, health); }

    @Override
    public void performMaintenance() {
        this.engineHealth = 1.0;
        System.out.println(model + " restored to 100% health.");
    }
}

public class FleetManager {

    public static void modifyVehicle(Vehicle v) {
        v.engineHealth = 0.2;
    }

    public static void main(String[] args) {
        Vehicle[] fleet = {
                new Truck("Freightliner", 0.8),
                new Truck("Volvo", 0.9)
        };

        Vehicle[] shadowFleet = fleet;
        modifyVehicle(shadowFleet[0]);

        System.out.println("Engine Health of fleet[0]: " + fleet[0].engineHealth);

        // TODO: Aufgabe 4 implementieren
    }
}
