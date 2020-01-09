package oopPart1.inheritanceChallengeVideo87;

public class ElectricCar extends Car {
    private int batteries;
    private int energy;

    public ElectricCar (int batteries, int energy, String name, int size, String colour, boolean hasFuel) {
        super(name, size, colour, 4, false);
        this.batteries = batteries;
        this.energy = energy;
    }
    
    @Override
    public void move(int speed) {
        if (this.energy > 0) {
            System.out.println("ElectricCar.move() called. ElectricCar is moving at " + speed);
            super.move(speed);
            this.energy -= 10;
            System.out.println("You used 10 energy.");
        }
    }
    
}