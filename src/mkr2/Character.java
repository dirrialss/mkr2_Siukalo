package mkr2;

public interface Character {
    void displayInfo();
    int getHealth();
    int getAttackPower();
    void levelUp();
    void move(int x, int y);
}

