/*
 * Program type: Contol Class
 * Creation: 9/21/2015 at 9:21
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
package byui.cit260.yggdrasil.control;

import byui.cit260.yggdrasil.control.MapControl.sceneType;
import byui.cit260.yggdrasil.model.Enemy;
import byui.cit260.yggdrasil.model.Game;
import byui.cit260.yggdrasil.model.Item;
import byui.cit260.yggdrasil.model.Location;
import byui.cit260.yggdrasil.model.MainCharacter;
import byui.cit260.yggdrasil.model.Map;
import byui.cit260.yggdrasil.model.Player;
import byui.cit260.yggdrasil.model.Scene;
import java.io.Serializable;
import yggdrasil.Yggdrasil;

/**
 *
 * @author Didymus Benson
 */
public class GameControl implements Serializable {

    public static void createNewGame(Player player) {

        Game game = new Game();
        Yggdrasil.setCurrentGame(game);

        game.setPlayer(player);

        //CREATE ENEMIES
        Enemy[] enemies = CombatControl.createEnemies();
        //CREATE THE MAIN P.C.
        MainCharacter hero = new MainCharacter();
        
        //CREATE GAME INVENTORY INITIALIZE ALL ITEMS AT ZERO
        Item[] inventoryItems = InventoryControl.createGameInventory();
        
        //CREATE MAP, SCENES, TOWNS, DUNGEON SQUARES, FINAL BOSS AREA
        Map map = MapControl.createMap();

        System.out.println("createNewGame successful.");

    }

    public static void assignScenesLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        //Assign scene types to each of the coordinates.
        locations[0][0].setScene(scenes[sceneType.start.ordinal()]); // AN EXAMPLE
        locations[0][1].setScene(null);
        locations[0][2].setScene(null);
        locations[0][3].setScene(null);
        locations[0][4].setScene(null);
        locations[0][5].setScene(null);
        locations[0][6].setScene(null);
        locations[0][7].setScene(null);

        locations[1][0].setScene(null);
        locations[1][1].setScene(null);
        locations[1][2].setScene(null);
        locations[1][3].setScene(null);
        locations[1][4].setScene(null);
        locations[1][5].setScene(null);
        locations[1][6].setScene(null);
        locations[1][7].setScene(null);

        locations[2][0].setScene(null);
        locations[2][1].setScene(null);
        locations[2][2].setScene(null);
        locations[2][3].setScene(null);
        locations[2][4].setScene(null);
        locations[2][5].setScene(null);
        locations[2][6].setScene(null);
        locations[2][7].setScene(null);

        locations[3][0].setScene(null);
        locations[3][1].setScene(null);
        locations[3][2].setScene(null);
        locations[3][3].setScene(null);
        locations[3][4].setScene(null);
        locations[3][5].setScene(null);
        locations[3][6].setScene(null);
        locations[3][7].setScene(null);
        
        locations[4][0].setScene(null);
        locations[4][1].setScene(null);
        locations[4][2].setScene(null);
        locations[4][3].setScene(null);
        locations[4][4].setScene(null);
        locations[4][5].setScene(null);
        locations[4][6].setScene(null);
        locations[4][7].setScene(null);
        
        locations[5][0].setScene(null);
        locations[5][1].setScene(null);
        locations[5][2].setScene(null);
        locations[5][3].setScene(null);
        locations[5][4].setScene(null);
        locations[5][5].setScene(null);
        locations[5][6].setScene(null);
        locations[5][7].setScene(null);
        
        locations[6][0].setScene(null);
        locations[6][1].setScene(null);
        locations[6][2].setScene(null);
        locations[6][3].setScene(null);
        locations[6][4].setScene(null);
        locations[6][5].setScene(null);
        locations[6][6].setScene(null);
        locations[6][7].setScene(null);
        
        locations[7][0].setScene(null);
        locations[7][1].setScene(null);
        locations[7][2].setScene(null);
        locations[7][3].setScene(null);
        locations[7][4].setScene(null);
        locations[7][5].setScene(null);
        locations[7][6].setScene(null);
        locations[7][7].setScene(null);

    }
}
