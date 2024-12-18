package mkr2;

public class Warrior implements Character {
    private int health = 150;
    private int attackPower = 20;
    private int x, y;
    @Override
    public void displayInfo() {
        System.out.println("Warrior -> Health: " + health + ", Attack Power: " + attackPower + ", Position: (" + x + ", " + y + ")");
    }
    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void levelUp() {
        health += 20;
        attackPower += 10;
        System.out.println("Warrior leveled up! New stats: Health = " + health + ", Attack Power = " + attackPower);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Warrior moved to position (" + x + ", " + y + ")");
    }
}
