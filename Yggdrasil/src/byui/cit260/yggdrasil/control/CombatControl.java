/*
 * Program type: Control Class
 * Creation: 10/21/2015 at 9:20
 * Description: This is the control class that deals with combat situations.
 */
package byui.cit260.yggdrasil.control;

import Exceptions.CombatControlException;
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

    //PLACEHOLDER METHOD delete once battle system is completed
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

    //PLACEHOLDER METHOD delete once battle system is completed
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

    public static Enemy[] createEnemies() {
        Enemy[] enemies = new Enemy[33];
        //Generates enemy with every stat EXCEPT: Weapon, coordinates, and location
        //public Enemy(int escapeChance, int xpReward, int goldReward, String name, int maxHp, int attack, int defense)

        //Fill in the enemies according to this example
        Enemy imp = new Enemy(10, 5, 10, "Imp", 15, 3, 3);
        //Then set the new enemy object as the next one in the array.
        enemies[0] = imp;

        Enemy goblin = new Enemy(12, 7, 10, "Goblin", 15, 3, 3);
        enemies[1] = goblin;

        Enemy hobGoblin = new Enemy(15, 10, 20, "Hobgoblin", 20, 4, 5);
        enemies[2] = hobGoblin;

        Enemy wolf = new Enemy(20, 7, 0, "Wolf", 10, 2, 4);
        enemies[3] = wolf;

        Enemy wyrm = new Enemy(10, 10, 15, "Wyrm", 20, 4, 3);
        enemies[4] = wyrm;

        Enemy zombie = new Enemy(12, 12, 10, "Zombie", 24, 5, 3);
        enemies[5] = zombie;

        Enemy skeleton = new Enemy(20, 15, 20, "Skeleton", 30, 5, 7);
        enemies[6] = skeleton;

        Enemy nightMare = new Enemy(50, 20, 50, "NightMare", 30, 7, 4);
        enemies[7] = nightMare;

        Enemy ghoul = new Enemy(35, 20, 45, "Ghoul", 25, 6, 5);
        enemies[8] = ghoul;

        Enemy ghoulFriend = new Enemy(35, 25, 50, "Ex Girlfriend", 27, 7, 6);
        enemies[9] = ghoulFriend;

        Enemy cobra = new Enemy(20, 30, 20, "Cobra", 20, 10, 4);
        enemies[10] = cobra;

        Enemy ogre = new Enemy(35, 25, 50, "Ogre", 25, 8, 10);
        enemies[11] = ogre;

        Enemy lizard = new Enemy(40, 30, 50, "Lizard", 50, 10, 10);
        enemies[12] = lizard;

        Enemy blackWidow = new Enemy(45, 35, 55, "Black Widow", 55, 10, 12);
        enemies[13] = blackWidow;

        Enemy warg = new Enemy(50, 40, 60, "Warg", 60, 11, 12);
        enemies[14] = warg;

        Enemy pirate = new Enemy(55, 45, 60, "Pirate", 65, 13, 12);
        enemies[15] = pirate;

        Enemy ninja = new Enemy(60, 50, 80, "Ninja", 70, 15, 10);
        enemies[16] = ninja;

        Enemy buccaneer = new Enemy(55, 45, 50, "Buccaneer", 60, 12, 12);
        enemies[17] = buccaneer;

        Enemy landShark = new Enemy(60, 60, 60, "Land Shark", 80, 14, 10);
        enemies[18] = landShark;

        Enemy disembodiedEyes = new Enemy(70, 65, 80, "Disembodied Eyes", 50, 20, 15);
        enemies[19] = disembodiedEyes;

        Enemy tarantula = new Enemy(70, 70, 80, "Tarantula", 80, 20, 16);
        enemies[20] = tarantula;

        Enemy ghost = new Enemy(60, 80, 100, "Ghost", 60, 20, 20);
        enemies[21] = ghost;

        Enemy scorpian = new Enemy(80, 75, 85, "Scorpion", 85, 25, 20);
        enemies[22] = scorpian;

        Enemy vashnendarada = new Enemy(80, 80, 100, "Shadow", 90, 25, 25);
        enemies[23] = vashnendarada;

        Enemy greenSlime = new Enemy(60, 80, 100, "Green Slime", 60, 20, 20);
        enemies[24] = greenSlime;

        Enemy crawler = new Enemy(70, 70, 80, "Crawler", 80, 20, 16);
        enemies[25] = crawler;

        Enemy gargoyle = new Enemy(90, 85, 110, "Gargoyle", 95, 28, 30);
        enemies[26] = gargoyle;

        Enemy bloodBones = new Enemy(90, 90, 110, "Blood Bones", 100, 30, 30);
        enemies[27] = bloodBones;

        Enemy psyco = new Enemy(90, 90, 110, "Psyco", 100, 30, 30);
        enemies[28] = psyco;

        Enemy wizard = new Enemy(60, 100, 150, "Wizard", 60, 40, 25);
        enemies[29] = wizard;

        Enemy bandet = new Enemy(80, 100, 150, "Bandet", 100, 35, 30);
        enemies[30] = bandet;

        Enemy formian = new Enemy(90, 90, 110, "Formian", 100, 30, 30);
        enemies[31] = formian;

        Enemy blinkDog = new Enemy(80, 100, 50, "Blink Dog", 105, 34, 36);
        enemies[32] = blinkDog;

        Enemy Plythu = new Enemy(100, 1000, 1000, "Plythu", 300, 55, 50);
        enemies[33] = Plythu;
        return enemies;
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

    public boolean compareRolls(int roll1, int roll2) 
        throws CombatControlException{

        if (roll1 > roll2) {
            return true;
        } else if (roll2 < roll1) {
            return false;
        } else if (roll2 == roll1){
            return tieBreaker();
        } else {
            throw new CombatControlException("Error!");
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

    public Boolean runAway(MainCharacter hero, Enemy enemy) 
            throws CombatControlException {
        // The player's minimum chance of running away is the player's base speed
        int runRoll = rollRandRange(hero.getMainCharacterSpeed(), 100);
        return compareRolls(runRoll, enemy.getEnemyEscapeChance());
    }

    public Boolean tryAttack(Actor attacker, Actor defender) {
        int attackRoll = rollRandRange(1, 20) + attacker.getActorAttack();
        return attackRoll > defender.getActorDefense();
    }

    /*
     THIS CODE WAS REPLACED IN "COMBAT MENU VIEW". THE COMBAT MENU VIEW 
     NOW DOES THE DEFENSE ACTION DURING THE ENEMY'S ATTACK PHASE. LEAVE THIS
     CODE IN CASE IT NEEDS TO CHANGE.
    
     public void defend(Actor actor) {
     System.out.println("CombatControl.defend() called.");
     // TODO MAKE FUNCTION.
     }*/
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
