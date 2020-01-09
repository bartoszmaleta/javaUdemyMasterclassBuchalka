package oopPart1.inheritanceChallengeVideo87;

public class Vehicle {
    private int size;

    public Vehicle(int size) {
        this.size = size;
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called. Vehicle is moving at " + speed);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}