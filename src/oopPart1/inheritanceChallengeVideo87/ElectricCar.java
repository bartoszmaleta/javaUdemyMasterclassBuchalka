package oopPart1.inheritanceChallengeVideo87;

public class ElectricCar extends Car {
    private int batteries;
    private int energy;

    public ElectricCar (int batteries, int energy, String name, int size, String colour, boolean hasFuel, int speed) {
        super(name, size, colour, 4, false, speed);
        this.batteries = batteries;
        this.energy = energy;
    }
    
    @Override
    public void move(int speedToChange) {
        if (this.energy > 0) {
            System.out.println("ElectricCar.move() called. Electric car was moving at " + getSpeed());
            super.move(speedToChange);
            System.out.println("ElectricCar speed changed by " + speedToChange);
            System.out.println("ElectricCar is now moving at " + getSpeed());
            this.energy -= 10;
            System.out.println("You used 10 energy.");
        }
    }

    public void breaks(int speedToChange) {
        System.out.println("ElectricCar.breaks() called. Electric car was moving at " + getSpeed());
        super.move(speedToChange);
        System.out.println("ElectricCar speed changed by " + speedToChange);
        System.out.println("ElectricCar is now moving at " + getSpeed());
    }
    
}