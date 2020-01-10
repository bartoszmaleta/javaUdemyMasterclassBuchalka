package oopPart2.encapsulation.goodExampleOfEncapsulation;

public class PlayerEnhanced {
    private String fullName;
    private int health = 100;
    private String weapon;

    public PlayerEnhanced(String name, int health, String weapon) {
        this.fullName = name;

        if (health > 0 && health <= 100) {
            this.health = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return health;
    }
}