package oopPart1.inheritanceChallengeVideo87;

public class MainChallenge {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Vehicle", 4, 1, "black", 0);

        Car car = new Car("Car", 4, "red", 4, true, 0);

        ElectricCar tesla = new ElectricCar(1, 100, "Tesla", 4, "white", true, 0);
    
        System.out.println("--------------");

        tesla.move(15);

        System.out.println("--------------");

        tesla.breaks(-5);

        System.out.println("--------------");

        System.out.println(tesla.getSpeed());

    }
}