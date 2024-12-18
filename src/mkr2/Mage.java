package mkr2;

public class Mage implements Character {
    private int health = 100;
    private int attackPower = 50;
    private int x, y;

    @Override
    public void displayInfo() {
        System.out.println("Mage -> Health: " + health + ", Attack Power: " + attackPower + ", Position: (" + x + ", " + y + ")");
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
        health += 15;
        attackPower += 15;
        System.out.println("Mage leveled up! New stats: Health = " + health + ", Attack Power = " + attackPower);
    }
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Mage moved to position (" + x + ", " + y + ")");
    }
}
