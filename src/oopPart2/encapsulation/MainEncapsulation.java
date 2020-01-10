package oopPart2.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        Player player = new Player();

        player.name = "Bartosz";
        player.health = 100;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        
        damage = 91;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

    }
}