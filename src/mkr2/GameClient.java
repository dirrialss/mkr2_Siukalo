package mkr2;

public class GameClient {
    public static void main(String[] args) {
        Arena arena = new Arena();
        Observer player1 = new PlayerObserver("player 1");
        Observer player2 = new PlayerObserver("player 2");
        arena.addObserver(player1);
        arena.addObserver(player2);
        Character warrior = CharacterFactory.createCharacter("warrior");
        Character mage = CharacterFactory.createCharacter("mage");
        Character archer = CharacterFactory.createCharacter("archer");
        System.out.println("Initial Player Information:");
        warrior.displayInfo();
        mage.displayInfo();
        archer.displayInfo();
        System.out.println();
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);
        warrior.move(5, 10);
        mage.move(3, 7);
        archer.move(10, 15);
        arena.attack(warrior, mage);
        arena.attack(archer, warrior);
        warrior.levelUp();
        mage.levelUp();
        archer.levelUp();
        System.out.println("\nUpdated Player Information:");
        warrior.displayInfo();
        mage.displayInfo();
        archer.displayInfo();
    }
}
