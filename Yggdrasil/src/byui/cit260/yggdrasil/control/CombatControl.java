/*
 * Program type: Control Class
 * Creation: 10/21/2015 at 9:20
 * Description: This is the control class that deals with combat situations.
 */
package byui.cit260.yggdrasil.control;

import byui.cit260.yggdrasil.model.Actor;
import byui.cit260.yggdrasil.model.Enemy;
import byui.cit260.yggdrasil.model.Item;
import byui.cit260.yggdrasil.model.MainCharacter;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Didymus Benson
 */
public class CombatControl implements Serializable {

    //PLACEHOLDER METHOD, creates a test BOB enemy.
    public static Enemy getEnemy() {
        // In this test, all enemies must have weapons. 
        // enemy weapons can be special "enemy only" item objects
        Item tempweap = new Item();
        tempweap.setItemModifier(5);
        
        Enemy bob = new Enemy();
        bob.setEnemyName("BOB");
        bob.setActorMaxHp(100);
        bob.setActorTempHp(bob.getActorMaxHp());
        bob.setActorAttack(5);
        bob.setActorDefense(5);
        bob.setEnemyEscapeChance(10);
        bob.setEnemyGoldReward(50);
        bob.setEnemyXpReward(50);
        bob.setActorWeapon(tempweap);
        return bob;
    }

    //LIKE getEnemy() this is a placeholder for the ACTUAL getHero function
    public static MainCharacter getHero() {
        
        Item tempweap = new Item();
        tempweap.setItemModifier(5);
        
        MainCharacter hero = new MainCharacter();
        
        hero.setActorAttack(5);
        hero.setActorDefense(5);
        hero.setActorMaxHp(100);
        hero.setActorTempHp(hero.getActorMaxHp());
        hero.setMainCharacterCurrentLevel(1);
        hero.setMainCharacterLuck(5);
        hero.setMainCharacterMoney(0);
        hero.setMainCharacterSpeed(5);
        hero.setMainCharacterTotalXp(0);
        hero.setActorWeapon(tempweap);
   
        return hero;
    }

    /*
        INCREASESTAT AND DECREASE STAT may be subject to change
        but for now they serve the purpose they are suppoed to. 
        It's up to the programmer to remember the switch cases.
    */
    public static void increaseStat(MainCharacter hero, String statName, int amount) {
        statName = statName.toUpperCase();
        int temp;
        switch (statName) {
            case "XP":
                temp = hero.getMainCharacterTotalXp();
                temp += amount;
                hero.setMainCharacterTotalXp(temp);
                break;
            case "HP":
                temp = hero.getActorMaxHp();
                temp += amount;
                hero.setActorMaxHp(temp);
                break;
            case "ATK":
                temp = hero.getActorAttack();
                temp += amount;
                hero.setActorAttack(temp);
                break;
            case "DEF":
                temp = hero.getActorDefense();
                temp += amount;
                hero.setActorDefense(temp);
                break;
            case "LUCK":
                temp = hero.getMainCharacterLuck();
                temp += amount;
                hero.setMainCharacterLuck(temp);
                break;
            case "SPD":
                temp = hero.getMainCharacterSpeed();
                temp += amount;
                hero.setMainCharacterSpeed(temp);
                break;
            case "GOLD":
                temp = hero.getMainCharacterMoney();
                temp += amount;
                hero.setMainCharacterMoney(temp);
                break;
            case "LVL":
                temp = hero.getMainCharacterCurrentLevel();
                temp += amount;
                hero.setMainCharacterCurrentLevel(temp);
                break;
            default:
                System.out.println("INTERNAL ERROR! SOMETHING WENT VERY WRONG!");
                break;
        }
    }

    //WORK IN PROGRESS
    public static void decreaseStat(MainCharacter hero, String statName, int amount) {
        statName = statName.toUpperCase();
        int temp;
        switch (statName) {
            case "XP":
                temp = hero.getMainCharacterTotalXp();
                temp -= amount;
                hero.setMainCharacterTotalXp(temp);
                break;
            case "HP":
                temp = hero.getActorMaxHp();
                temp -= amount;
                hero.setActorMaxHp(temp);
                break;
            case "ATK":
                temp = hero.getActorAttack();
                temp -= amount;
                hero.setActorAttack(temp);
                break;
            case "DEF":
                temp = hero.getActorDefense();
                temp -= amount;
                hero.setActorDefense(temp);
                break;
            case "LUCK":
                temp = hero.getMainCharacterLuck();
                temp -= amount;
                hero.setMainCharacterLuck(temp);
                break;
            case "SPD":
                temp = hero.getMainCharacterSpeed();
                temp -= amount;
                hero.setMainCharacterSpeed(temp);
                break;
            case "GOLD":
                temp = hero.getMainCharacterMoney();
                temp -= amount;
                hero.setMainCharacterMoney(temp);
                break;
            case "LVL":
                temp = hero.getMainCharacterCurrentLevel();
                temp -= amount;
                hero.setMainCharacterCurrentLevel(temp);
                break;
            default:
                System.out.println("INTERNAL ERROR! SOMETHING WENT VERY WRONG!");
                break;
        }
    }

    public Boolean compareRolls(int roll1, int roll2) {

        if (roll1 > roll2) {
            return true;
        } else if (roll2 < roll1) {
            return false;
        } else {
            return tieBreaker();
        }
    }

    public int rollRandRange(int low, int high) {
        int roll;
        Random r = new Random();
        int n = high - low + 1;  // N = difference of high range and low range
        int i = r.nextInt() % n; // I = the random number
        roll = low + i;          // roll = low number + random number
        return roll;
    }

    public Boolean tieBreaker() {
        Random r = new Random();
        int i = r.nextInt(2);
        return i == 1; // If i is 1, it returns true, if not returns false.
    }

    public Boolean runAway(MainCharacter hero, Enemy enemy) {
        // The player's minimum chance of running away is the player's base speed
        int runRoll = rollRandRange(hero.getMainCharacterSpeed(), 100);
        return compareRolls(runRoll, enemy.getEnemyEscapeChance());
    }

    public Boolean tryAttack(Actor attacker, Actor defender) {
        int attackRoll = rollRandRange(1, 20) + attacker.getActorAttack();
        return attackRoll > defender.getActorDefense();
    }

    public void defend(Actor actor) {
        System.out.println("CombatControl.defend() called.");
        // TODO MAKE FUNCTION.
    }

    public int calcDamage(Actor hero) {
        int damage = hero.getActorAttack()
                + rollRandRange(1, hero.getActorWeapon().getItemModifier());
        return damage;
    }

    public void applyDamage(int damage, Actor defender) {
        int newHp = defender.getActorTempHp() - damage;
        defender.setActorTempHp(newHp);
    }
}
