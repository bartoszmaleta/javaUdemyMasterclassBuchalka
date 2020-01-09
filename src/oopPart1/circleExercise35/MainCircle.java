package oopPart1.circleExercise35;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);

        Cylinder cylinder = new Cylinder(-1.0, -1.0);

        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getHeight());
    }
}