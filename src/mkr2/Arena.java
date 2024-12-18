package mkr2;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character.getClass().getSimpleName() + " has entered the arena!");
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    public void attack(Character attacker, Character target) {
        System.out.println(attacker.getClass().getSimpleName() + " attacks " + target.getClass().getSimpleName() + "!");
        int newHealth = target.getHealth() - attacker.getAttackPower();
        System.out.println(target.getClass().getSimpleName() + " now has " + newHealth + " health left.");
        notifyObservers(attacker.getClass().getSimpleName() + " attacked " + target.getClass().getSimpleName());
    }
}

