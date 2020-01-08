package oopPart1.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Shark", 15, 10, 4, 2, 5);

        fish.move(30);
        fish.swim(3);
        System.out.println(fish.getBrain());
        System.out.println(fish.getName());
    }
}