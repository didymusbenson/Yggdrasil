/*
 * Program type: Contol Class
 * Creation: 9/21/2015 at 9:21
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
package byui.cit260.yggdrasil.control;

import Exceptions.GameControlException;
import Exceptions.MapControlException;
import byui.cit260.yggdrasil.control.MapControl.sceneType;
import byui.cit260.yggdrasil.model.Enemy;
import byui.cit260.yggdrasil.model.Game;
import byui.cit260.yggdrasil.model.Item;
import byui.cit260.yggdrasil.model.Location;
import byui.cit260.yggdrasil.model.MainCharacter;
import byui.cit260.yggdrasil.model.Map;
import byui.cit260.yggdrasil.model.Player;
import byui.cit260.yggdrasil.model.Scene;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import yggdrasil.Yggdrasil;

/**
 *
 * @author Didymus Benson
 */
public class GameControl implements Serializable {

    public static void createNewGame(Player player)
            throws GameControlException, MapControlException {

        Game game = new Game();
        Yggdrasil.setCurrentGame(game);

        if (player != null) {
            game.setPlayer(player);
        } else {
            throw new GameControlException("Player could not be set to game!");
        }

        //CREATE ENEMIES
        Enemy[] enemies = CombatControl.createEnemies();
        game.setEnemies(enemies);

        //CREATE THE MAIN P.C.
        MainCharacter hero = new MainCharacter();
        game.setHero(hero);

        //CREATE GAME INVENTORY INITIALIZE ALL ITEMS AT ZERO
        Item[] inventoryItems = InventoryControl.createGameInventory();
        game.setGameInventory(inventoryItems);

//********* CREATE MAP, SCENES, TOWNS, DUNGEON SQUARES, FINAL BOSS AREA ********
        
        //MAP
        Map map = MapControl.createMap();
        
        //SCENES
        Scene[] scenes = MapControl.createScenes();
        
        // assign scenes  to locations
        assignScenesLocations(map, scenes);
        
        // set up Inventories for "town" scenes
        
        // set up dungeon scenes
        
        // set up final boss area
        
        
        //SET GAME MAP
        game.setMap(map);
        
        //Put player at starting area.
        
//******************************************************************************
        
        System.out.println("createNewGame successful.");

    }

    public static void assignScenesLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        //TODO: Draw out map, decide what belongs where
        locations[0][0].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[0][1].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[0][2].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[0][3].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[0][4].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[0][5].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[0][6].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[0][7].setScene(scenes[sceneType.clearing.ordinal()]);

        locations[1][0].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[1][1].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[1][2].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[1][3].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[1][4].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[1][5].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[1][6].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[1][7].setScene(scenes[sceneType.clearing.ordinal()]);

        locations[2][0].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[2][1].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[2][2].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[2][3].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[2][4].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[2][5].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[2][6].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[2][7].setScene(scenes[sceneType.clearing.ordinal()]);

        locations[3][0].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[3][1].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[3][2].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[3][3].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[3][4].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[3][5].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[3][6].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[3][7].setScene(scenes[sceneType.clearing.ordinal()]);

        locations[4][0].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[4][1].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[4][2].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[4][3].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[4][4].setScene(scenes[sceneType.plythu.ordinal()]);
        locations[4][5].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[4][6].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[4][7].setScene(scenes[sceneType.clearing.ordinal()]);

        locations[5][0].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[5][1].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[5][2].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[5][3].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[5][4].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[5][5].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[5][6].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[5][7].setScene(scenes[sceneType.clearing.ordinal()]);

        locations[6][0].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[6][1].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[6][2].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[6][3].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[6][4].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[6][5].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[6][6].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[6][7].setScene(scenes[sceneType.clearing.ordinal()]);

        locations[7][0].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[7][1].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[7][2].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[7][3].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[7][4].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[7][5].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[7][6].setScene(scenes[sceneType.clearing.ordinal()]);
        locations[7][7].setScene(scenes[sceneType.clearing.ordinal()]);

    }
    
    public static void saveGame(Game game, String filePath) throws GameControlException{
        try( FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        } catch (IOException e) {throw new GameControlException(e.getMessage());}
        
    }
    
    public static void getSavedGame(String filePath) throws GameControlException{
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream output = new ObjectInputStream(fips);
            game = (Game) output.readObject();
        } catch (FileNotFoundException fnfe){
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
        
        Yggdrasil.setCurrentGame(game);
    }
    
    
}
