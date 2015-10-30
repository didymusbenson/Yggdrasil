/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:10
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
// 1 - this tells the program what game is to be played.
package yggdrasil;

// 2 - This tells the program what it will need to play the game.
import byui.cit260.yggdrasil.model.Actor;
import byui.cit260.yggdrasil.model.Dungon;
import byui.cit260.yggdrasil.model.Enemy;
import byui.cit260.yggdrasil.model.Location;
import byui.cit260.yggdrasil.model.MainCharacter;
import byui.cit260.yggdrasil.model.Player;
import byui.cit260.yggdrasil.model.Scene;
import byui.cit260.yggdrasil.model.Town;
import byui.cit260.yggdrasil.model.Shop;
import byui.cit260.yggdrasil.model.Item;
import byui.cit260.yggdrasil.model.Map;
import byui.cit260.yggdrasil.model.Inventory;
import byui.cit260.yggdrasil.model.Game;
import byui.cit260.yggdrasil.view.StartProgramView;

/**
 *
 * @author Brock Hodgson & Didymus Benson
 */
public class Yggdrasil {

    private static Player player;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// creat start programView and start the program
        StartProgramView starProgramView = new StartProgramView();
        starProgramView.startProgram();
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Yggdrasil.player = player;
    }

}
