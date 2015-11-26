/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:10
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
// 1 - this tells the program what game is to be played.
package yggdrasil;

// 2 - This tells the program what it will need to play the game.
import Exceptions.ProgramControlException;
import byui.cit260.yggdrasil.model.Game;
import byui.cit260.yggdrasil.model.Player;

import byui.cit260.yggdrasil.view.ClearingView;
import byui.cit260.yggdrasil.view.CombatMenuView;
import byui.cit260.yggdrasil.view.StartProgramView;

/**
 *
 * @author Brock Hodgson & Didymus Benson
 */
public class Yggdrasil {

    private static Game currentGame;
    private static Object starProgramView;

    /**
     * @param args the command line arguments
     * @throws Exceptions.ProgramControlException
     */
    public static void main(String[] args) 
            throws ProgramControlException {
        try {
        //Create start programView and start the program
        StartProgramView starProgramView = new StartProgramView();
        starProgramView.startProgram();
        //Simulate a fight between a player and an enemy
        CombatMenuView combat = new CombatMenuView();
        combat.display();
        //Simulate a "clearing view" on the map
        ClearingView clearing = new ClearingView();
        clearing.display();
        } catch(Throwable te) {
            System.out.println("System Error, system restart initiated.");
            startProgram();
        }

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Yggdrasil.currentGame = currentGame;
    }

    private static void startProgram() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
