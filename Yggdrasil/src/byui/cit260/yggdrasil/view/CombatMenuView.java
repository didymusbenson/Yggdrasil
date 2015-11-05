/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.control.CombatControl;
import byui.cit260.yggdrasil.model.Enemy;
import byui.cit260.yggdrasil.model.MainCharacter;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author tsunami
 */
public class CombatMenuView implements Serializable {

    private final String BANNER = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    private final String NORMAL = "You are attacked by a "; // add monster name
    private final String VICTORY = "You have defeated the "; //add monster name
    private final String OPTIONS = "(R)un - (A)ttack - (I)tem - (D)defend";
    // to be implemented later
    private final String SNEAK = "You snuck up on a "; // add monster name
    // to be implemented later
    private final String AMBUSH = "A monster gets the jump on you!";

    public void displayMenu() {
        
        // Initialize the enemy and the hero.
        Enemy enemy = CombatControl.getEnemy();
        MainCharacter hero = CombatControl.getHero(); //NEEDS TO BE FIXED LATER

        // Display the combat banner and introduction.
        System.out.println(BANNER);
        System.out.println(NORMAL + enemy.getEnemyName() + "!");
        char selection = ' ';
        boolean runaway = false;
        
        // Combat loop, goes until hero or enemy dies, or hero runs away.
        do {
            int round = 0; // rounds of combat, increases as the battle goes on.
            if (round > 0);
            {
                System.out.println("Your HP: " + hero.getActorTempHp()
                        + "\n" + enemy.getEnemyName() + "'s HP: " + enemy.getActorTempHp());
            }
            System.out.println(OPTIONS);
            String input = this.getInput(); 
            input = input.toUpperCase();
            selection = input.charAt(0); 
            runaway = this.doAction(selection, hero, enemy);
            round++;
        } while (enemy.getActorTempHp() > 0 && runaway == false && hero.getActorTempHp() > 0); // or until player dies.

        // If the hero won the fight.
        if (enemy.getActorTempHp() <= 0) {
            System.out.println(VICTORY + enemy.getEnemyName() + "!");
            System.out.println("You were awarded " + enemy.getEnemyXpReward() + " XP!");
            CombatControl.increaseStat(hero, "XP", enemy.getEnemyXpReward());
            System.out.println("You have found " + enemy.getEnemyGoldReward() + " gold!");
            CombatControl.increaseStat(hero, "GOLD", enemy.getEnemyGoldReward());
            System.out.println(BANNER);
        }
        // If the hero died.
        else if (runaway == hero.getActorTempHp() <= 0)
            System.out.println("You died a horrible death. Congrats.");
        // If the hero runs away.
        else    
            System.out.println(BANNER);
    }

    /***************OTHER FUNCTIONS********************************************/
    
    public String getInput() {
        String input = null;
        Boolean valid = false;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("What dost thou do?");
            input = keyboard.nextLine();
            input = input.trim();
            if (input.length() < 1) {
                System.out.println("Error - You didn't type anything!");
                continue;
            }
            break;
        }

        return input;
    }

    // Do the action selected in the combat loop.
    public boolean doAction(char selection, MainCharacter hero, Enemy enemy) {
        CombatControl combat = new CombatControl();
        
        switch (selection) {
            case 'R':
                if (combat.runAway(hero, enemy)) {
                    System.out.println("Got away safely!");
                    return true;
                } else {
                    System.out.println("Failed to escape!");
                }
                break;
            case 'A':
                if (!combat.tryAttack(hero, enemy)) {
                    System.out.println("Your attack missed!");
                } else {
                    int damage = combat.calcPlayerDamage(hero);
                    System.out.println("You hit the " + enemy.getEnemyName() + " for " + damage + " damage!");
                    combat.applyDamage(damage, enemy);
                }
                break;
            case 'I':
                System.out.println("ITEM CHOSEN");
                // Must display player inventory menu to use an item
                break;
            case 'D':
                System.out.println("DEFEND CHOSEN");
                // Must call a function that will reduce the chance of being hit.
                // by the enemy this turn.
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            default:
                System.out.println("Error - Let me give you those options again:");
        }
        return false;
    }

    // Show help menu when H is typed.
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
}
