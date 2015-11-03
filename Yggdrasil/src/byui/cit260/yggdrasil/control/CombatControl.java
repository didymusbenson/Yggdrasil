/*
 * Program type: Control Class
 * Creation: 10/21/2015 at 9:20
 * Description: This is the control class that deals with combat situations.
 */
package byui.cit260.yggdrasil.control;
import byui.cit260.yggdrasil.model.Actor;
import byui.cit260.yggdrasil.model.Enemy;
import byui.cit260.yggdrasil.model.MainCharacter;
import java.io.Serializable;
import java.util.Random;
/**
 *
 * @author Didymus Benson 
 */
public class CombatControl implements Serializable{

    public static Enemy getEnemy() {
        Enemy bob = new Enemy();
        bob.setEnemyName("BOB");
        bob.setActorMaxHp(30);
        bob.setActorTempHp(bob.getActorTempHp());
        return bob;
    }
    
    public Boolean compareRolls(int roll1, int roll2){

        if (roll1 > roll2)
            return true;
        else if (roll2 < roll1)
            return false;
        else {
            return tieBreaker();
        }
    }
    
    public int rollRandRange(int low, int high){
        int roll;
        Random r = new Random();
        int n = high - low + 1;  // N = difference of high range and low range
        int i = r.nextInt() % n; // I = the random number
        roll = low + i;          // roll = low number + random number
        return roll;
    }
    
    public Boolean tieBreaker(){
        Random r = new Random();
        int i = r.nextInt(2);
        return i == 1; // If i is 1, it returns true, if not returns false.
    }
    
    public Boolean runAway(MainCharacter hero, Enemy enemy){
        // The player's minimum chance of running away is the player's base speed
        int runRoll = rollRandRange(hero.getMainCharacterSpeed(), 100);
        return compareRolls(runRoll, enemy.getEnemyEscapeChance());
    }
    
    /* Player attack and enemy attack could be merged by passing ACTOR as a 
    parameter instead of MainCharacter and Enemy. The issue is that we have
    to pass the MainCharacter or enemey classes later to the calc damage 
    functions.-ADB
    */
    public Boolean tryAttack(Actor attacker, Actor defender){
        System.out.println("CombatControl.playerAttack() called.");
        int attackRoll = rollRandRange(1, 20) + attacker.getActorAttack(); 
        if (attackRoll > defender.getActorDefense())
            return true;
        else
            return false;
    }

    
    public void defend(Actor actor){
        System.out.println("CombatControl.defend() called.");        
        // TODO MAKE FUNCTION.
    }

    private int calcPlayerDamage(MainCharacter hero) {
        System.out.println("calcDamage() called");
        // TODO, WRITE FUNCTION
        int damage = hero.getActorAttack() + 
                rollRandRange(1, hero.getActorWeapon().getItemModifier());
        return damage;
    }

    private void applyDamage(int damage, Actor defender) {
        System.out.println("applyDamage() called");
        // TODO, MAKE FUNCTION
    }
}
    
