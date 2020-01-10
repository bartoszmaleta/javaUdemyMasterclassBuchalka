package oopPart2.encapsulation.goodExampleOfEncapsulation;

public class MainGoodEncapsulation {
    public static void main(String[] args) {
        // Player player = new Player();
// 
        // player.name = "Bartosz"; // error --> because we changed variables name in different class
        // player.fullName = "Bartosz";
        // player.health = 100;
        // player.weapon = "Sword";
// 
        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemaining());
        // 
        // damage = 91;
        // player.health = 200;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemaining());

        PlayerEnhanced player = new PlayerEnhanced("Bartosz", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());

        PlayerEnhanced player2 = new PlayerEnhanced("Bartosz", 200, "Sword");
        System.out.println("Initial health is " + player2.getHealth());

    }

}