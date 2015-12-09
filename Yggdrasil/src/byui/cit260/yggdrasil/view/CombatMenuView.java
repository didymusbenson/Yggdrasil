/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import Exceptions.CombatControlException;
import byui.cit260.yggdrasil.control.CombatControl;
import byui.cit260.yggdrasil.model.Enemy;
import byui.cit260.yggdrasil.model.MainCharacter;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This view is distinct from any others in the program. It cannot be run the
 * same way as the other view interfaces. This view requires different actions
 * to be taken and for different parameters to be passed into the doAction
 * function. Should I keep this as linked to the interface with some unused code
 * or should I revert this back to its original form as an independent class?
 *
 * @author didymus
 */
public class CombatMenuView extends View {

    public CombatMenuView() {
        super("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    private final String BANNER = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    private final String NORMAL = "You are attacked by a "; // add monster name
    private final String VICTORY = "You have defeated the "; //add monster name
    private final String OPTIONS = "(R)un - (A)ttack - (I)tem - (D)defend";
    // to be implemented later
    private final String SNEAK = "You snuck up on a "; // add monster name
    // to be implemented later
    private final String AMBUSH = "A monster gets the jump on you!";

    private CombatControl combat = new CombatControl();
    
    @Override
    public void display() {

        //Final game builds the enemies based on location hostility and 
        //a built in bestiary.
        Enemy enemy = CombatControl.getEnemy();
        //Final game gets the Hero from the game in progress, not here.
        MainCharacter hero = CombatControl.getHero();

        // Display the combat banner and introduction.
        this.console.println(BANNER);
        this.console.println(NORMAL + enemy.getEnemyName() + "!");
        char selection = ' ';
        boolean runaway = false;

        // Combat loop, goes until hero or enemy dies, or hero runs away.
        do {
            int round = 0; // rounds of combat, increases as the battle goes on.
            if (round > 0);
            {
                this.console.println("Your HP: " + hero.getActorTempHp()
                        + "\n" + enemy.getEnemyName() + "'s HP: " + enemy.getActorTempHp());
            }
            this.console.println(OPTIONS);
            String input = this.getInput();
            input = input.toUpperCase();
            selection = input.charAt(0);
 
            try {
                runaway = this.doAction(selection, hero, enemy);
            } catch (CombatControlException ex) {
                Logger.getLogger(CombatMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }

            // If player chooses H loop until it isn't..
            while (selection == 'H') {
                input = this.getInput();
                input = input.toUpperCase();
                selection = input.charAt(0);
   
                try {
                    runaway = this.doAction(selection, hero, enemy);
                } catch (CombatControlException ex) {
                    Logger.getLogger(CombatMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
        
            }

            if (runaway == false) { // If player tried to run, but failed.
                int originalDefense = hero.getActorDefense(); //take defense action into account
                if (selection == 'D') {
                    hero.setActorDefense(originalDefense + 5);
                }

                try {
                    this.enemyAttack(enemy, hero);
                } catch (CombatControlException ex) {
                    Logger.getLogger(CombatMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }

                hero.setActorDefense(originalDefense); // just in case.
            }
            round++;
        } while (enemy.getActorTempHp() > 0 && runaway == false && hero.getActorTempHp() > 0); // or until player dies.

        // If the hero won the fight.
        if (enemy.getActorTempHp() <= 0) {
            //MOVE THESE STATEMENTS TO CONTROL LAYER!
            this.console.println(VICTORY + enemy.getEnemyName() + "!");
            this.console.println("You were awarded " + enemy.getEnemyXpReward() + " XP!");
            combat.increaseStat(hero, "XP", enemy.getEnemyXpReward());
            this.console.println("You have found " + enemy.getEnemyGoldReward() + " gold!");
            combat.increaseStat(hero, "GOLD", enemy.getEnemyGoldReward());
            if (combat.levelUpCheck(hero)){
                this.console.println("You leveled up!");
                combat.levelUp(hero);
                this.displayStats(hero);
            }
            this.console.println(BANNER);
        } // If the hero died.
        else if (hero.getActorTempHp() <= 0) {
            this.console.println("You died a horrible death. Congrats.");
        } // If the hero runs away.
        else {
            this.console.println(BANNER);
        }
    }

    public boolean doAction(char selection, MainCharacter hero, Enemy enemy) 
            throws CombatControlException {
        

        switch (selection) {
            case 'R':
                if (combat.runAway(hero, enemy) == true) {
                    this.console.println("Got away safely!");
                    return true;
                } else {
                    this.console.println("Failed to escape!");
                }
                break;
            case 'A':
                if (!combat.tryAttack(hero, enemy)) {
                    this.console.println("Your attack missed!");
                } else {
                    int damage = combat.calcDamage(hero);
                    this.console.println("You hit the " + enemy.getEnemyName() + " for " + damage + " damage!");
                    combat.applyDamage(damage, enemy);
                }
                break;
            case 'I':
                this.console.println("ITEM CHOSEN");
                // To be developed with the InventoryView class.
                break;
            case 'D':
                // Defense happens when the enemy attacks. This is a placeholder
                // to say "D is a valid input"
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            default:
                this.console.println("Error - Let me give you those options again:");
        }
        return false;
    }


    // Let's an enemy perform *his* attack.
    private void enemyAttack(Enemy enemy, MainCharacter hero) 
            throws CombatControlException {
        CombatControl combat = new CombatControl();
        
        if (!combat.tryAttack(enemy, hero)) {
            this.console.println("The " + enemy.getEnemyName() + " missed!");
        } else {
            int damage = combat.calcDamage(enemy);
            this.console.println(enemy.getEnemyName() + " hit you for " + damage + " damage!");
            combat.applyDamage(damage, hero);
        }
    }

    //UNUSED METHOD
    @Override
    public boolean doAction(Object obj) {
        return true; //Do not use this method!
    }

}
