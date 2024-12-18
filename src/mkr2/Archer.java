package mkr2;

public class Archer implements Character {
    private int health = 120;
    private int attackPower = 30;
    private int x, y;
    @Override
    public void displayInfo() {
        System.out.println("Archer -> Health: " + health + ", Attack Power: " + attackPower + ", Position: (" + x + ", " + y + ")");
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
        health += 10;
        attackPower += 20;
        System.out.println("Archer leveled up! New stats: Health = " + health + ", Attack Power = " + attackPower);
    }
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Archer moved to position (" + x + ", " + y + ")");
    }
}

