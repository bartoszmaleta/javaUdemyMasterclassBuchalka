package oopPart1.inheritanceChallengeVideo87;

public class Vehicle {
    private String name;
    private int size;
    private int engine;
    private String colour;
    private int speed;

    public Vehicle(String name, int size, int engine, String colour, int speed) {
        this.name = name;
        this.size = size;
        this.engine = engine;
        this.colour = colour;
        if (speed >= 0) { // without "this." ?????
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    public void move(int speedToChange) {
        System.out.println("Vehicle.move() called. Vehicle was moving at " + this.speed);
        this.speed += speedToChange;
        System.out.println("Vehicle's speed changed by " + speedToChange);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}