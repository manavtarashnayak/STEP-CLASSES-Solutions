package encapsulation_assignment.assigment_problems;

public class Character {
    private int health;
    private final int maxHealth;

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        if (amount <= 0) return;
        this.health = Math.max(0, this.health - amount);
    }

    public void heal(int amount) {
        if (amount <= 0) return;
        this.health = Math.min(maxHealth, this.health + amount);
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
}
