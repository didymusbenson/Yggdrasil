/*
 * Program type: Control Class
 * Creation: 9/21/2015 at 9:24
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
package byui.cit260.yggdrasil.control;

import Exceptions.MapControlException;
import byui.cit260.yggdrasil.model.Actor;
import byui.cit260.yggdrasil.model.Enemy;
import byui.cit260.yggdrasil.model.Game;
import byui.cit260.yggdrasil.model.Item;
import java.io.Serializable;
import byui.cit260.yggdrasil.model.Location;
import byui.cit260.yggdrasil.model.Map;
import byui.cit260.yggdrasil.model.Scene;
import java.awt.Point;
import java.util.ArrayList;
import yggdrasil.Yggdrasil;

/**
 *
 * @author Brock Hodgson
 */
public class MapControl implements Serializable {

    public enum sceneType {

        start, //Where player starts the game.
        blocked, //Blocked off areas that can't be accessed - empty locations
        clearing, //Scene for a clearing
        forest, //Scene for a forest
        beach, //Scene for the beach
        town1, //Town 1 scene
        town2, //Town 2 scene
        town3, //Town 3 scene
        dungeon1, //etc
        dungeon2, //etc
        dungeon3, //etc
        plythu, //Scene where you fight Plythu
        endgame, // End of the game scene.
    }

    public static Map createMap()
            throws MapControlException {
        Map map = new Map(8, 8);
        //CREATE THE SCENES
        Scene[] scenes = createScenes();
        //ASSIGN THE SCENES TO LOCATIONS
        GameControl.assignScenesLocations(map, scenes);
        return map;
    }

    public static Scene[] createScenes() {
        //CREATE SCENES
        Game game = Yggdrasil.getCurrentGame(); // Do we need this line?

        Scene[] scenes = new Scene[sceneType.values().length];

        //CREATE THE INDIVIDUAL SCENES
        Scene start = new Scene();
        ArrayList<Item> shopItems = start.getShopItems();
        ArrayList<Enemy> enemies = start.getEnemies();

        start.setSceneDescription("In the land of Molmonsore there has been a \n"
                + "millennia of peace But now that peace is threatened by Plythu the \n"
                + "dragon a foul beast that crawled out of the bowels of Molomonsore to \n"
                + "claim it as his own. At this moment he sits in his lair planning how \n"
                + "he will devour the people! But there is hope. While we still have \n"
                + "time a hero may be trained to help the people of Molmonsore, they \n"
                + "will then travel to Plythu’s lair and defeat him. That hero is You…. \n"
                + "\nOnce you reach level 10 you may face him, but be warned that it \n"
                + "may be your last fight for you cannot run from facing him. \n");
        start.setSceneMapSymbol("!");
        scenes[sceneType.start.ordinal()] = start;

        Scene blocked = new Scene();
        blocked.setSceneDescription("A magical barrier blocks your path.\n"
                + "It seems there is still something you need to do.\n");
        blocked.setSceneMapSymbol("!");
        scenes[sceneType.blocked.ordinal()] = blocked;

        Scene clearing = new Scene();
        clearing.setSceneDescription("You come to an empty meadow clear of "
                + "derbis. \nThe peace is enjoyable, but you should move on.\n");
        clearing.setSceneMapSymbol("!");
        scenes[sceneType.clearing.ordinal()] = clearing;

        Scene forest = new Scene();
        forest.setSceneDescription("You come to the edge of a forest. \n"
                + "Anything could be hiding behind the trees, so you best \n"
                + "proceed with caution. \n");
        forest.setSceneMapSymbol("!");
        scenes[sceneType.forest.ordinal()] = forest;

        Scene beach = new Scene();
        beach.setSceneDescription("You have come to a beach. \n"
                + "The wind is fair and the sea calm if only you had a ship... \n"
                + "But you do not so you best move on. \n");
        beach.setSceneMapSymbol("!");
        scenes[sceneType.beach.ordinal()] = beach;

        Scene town1 = new Scene();
        town1.setSceneDescription("You enter the town of Ehis. \n"
                + "This town is so small you wonder if it really even exsits. \n");
        town1.setSceneMapSymbol("!");
        // add items (0:potion, 3:dagger, 4:sword) to town
        shopItems.add(game.getGameInventory()[0]);
        shopItems.add(game.getGameInventory()[3]);
        shopItems.add(game.getGameInventory()[4]);
        town1.setShopItems(shopItems);
        scenes[sceneType.town1.ordinal()] = town1;

        Scene town2 = new Scene();
        town2.setSceneDescription("You enter the town of Jennu. \n"
                + "With its friendly people, and wonderful architecture you wish \n"
                + "you could stay longer. \n");
        town2.setSceneMapSymbol("!");
        // add items (1:Hi Potion, 4:Sword, 5:Greatsword) to town
        shopItems.add(game.getGameInventory()[1]);
        shopItems.add(game.getGameInventory()[4]);
        shopItems.add(game.getGameInventory()[5]);
        town1.setShopItems(shopItems);
        scenes[sceneType.town2.ordinal()] = town2;

        Scene town3 = new Scene();
        town3.setSceneDescription("You enter the town of Siliti. \n"
                + "The people here seem to have already accepted defeat, it seems \n"
                + "they don't have much confidence in you. \n");
        town3.setSceneMapSymbol("!");
        // add items (2:Full Potion, 5; Greatsword, 6:Ultima Sword) to town
        shopItems.add(game.getGameInventory()[2]);
        shopItems.add(game.getGameInventory()[5]);
        shopItems.add(game.getGameInventory()[6]);
        town1.setShopItems(shopItems);
        scenes[sceneType.town3.ordinal()] = town3;

        Scene dungeon1 = new Scene();
        dungeon1.setSceneDescription("You stumble upon a hidden and abandon temple! \n"
                + "There is undoubtedly danger within, but also perhaps some treasure. \n");
        dungeon1.setSceneMapSymbol("!");
        enemies.add(game.getEnemies()[0]);
        enemies.add(game.getEnemies()[1]);
        enemies.add(game.getEnemies()[2]);
        enemies.add(game.getEnemies()[3]);
        enemies.add(game.getEnemies()[4]);
        enemies.add(game.getEnemies()[5]);
        enemies.add(game.getEnemies()[6]);
        enemies.add(game.getEnemies()[7]);
        enemies.add(game.getEnemies()[8]);
        enemies.add(game.getEnemies()[9]);
        dungeon1.setEnemies(enemies);
        scenes[sceneType.dungeon1.ordinal()] = dungeon1;

        Scene dungeon2 = new Scene();
        dungeon2.setSceneDescription("Torn flags and mossy overgrowth adorn the \n"
                + "clearly abandon castle before you. \n"
                + "There may be treasure here, but anyone inside clearly does not \n"
                + "enjoy company. \n");
        dungeon2.setSceneMapSymbol("!");
        enemies.add(game.getEnemies()[10]);
        enemies.add(game.getEnemies()[11]);
        enemies.add(game.getEnemies()[12]);
        enemies.add(game.getEnemies()[13]);
        enemies.add(game.getEnemies()[14]);
        enemies.add(game.getEnemies()[15]);
        enemies.add(game.getEnemies()[16]);
        enemies.add(game.getEnemies()[17]);
        enemies.add(game.getEnemies()[18]);
        enemies.add(game.getEnemies()[19]);
        dungeon1.setEnemies(enemies);
        scenes[sceneType.dungeon2.ordinal()] = dungeon2;

        Scene dungeon3 = new Scene();
        dungeon3.setSceneDescription("Before you is a structure you can't identify \n"
                + "whoever, or whatever is inside must be worth a look. Although it \n"
                + "could cost you your life.");
        dungeon3.setSceneMapSymbol("!");
        enemies.add(game.getEnemies()[20]);
        enemies.add(game.getEnemies()[21]);
        enemies.add(game.getEnemies()[22]);
        enemies.add(game.getEnemies()[23]);
        enemies.add(game.getEnemies()[24]);
        enemies.add(game.getEnemies()[25]);
        enemies.add(game.getEnemies()[26]);
        enemies.add(game.getEnemies()[27]);
        enemies.add(game.getEnemies()[28]);
        enemies.add(game.getEnemies()[29]);
        dungeon1.setEnemies(enemies);
        scenes[sceneType.dungeon3.ordinal()] = dungeon3;

        Scene plythu = new Scene();
        plythu.setSceneDescription("Before you stands the volcano lair of the dragon PLYTHU!!! \n"
                + "This place looks far too dangerous for any ordinary person.\n"
                + "are you sure you want to go in? \n");
        plythu.setSceneMapSymbol("!");
        scenes[sceneType.plythu.ordinal()] = plythu;

        Scene endgame = new Scene();
        endgame.setSceneDescription("The party that begins after you retrun from \n"
                + "your quest lasts an entire month, and after that begins another \n"
                + "thousand years of peace. Although you have saved the day you \n"
                + "long for adventure and spend the rest of your life wondering if \n"
                + "it would have been more fun to let the world burn. \n"
                + "THE END");
        endgame.setSceneMapSymbol("!");
        scenes[sceneType.endgame.ordinal()] = endgame;

        return scenes;
    }

    public boolean actorLocationCheck(Point coordinates, Map map)
            throws MapControlException {
        //get location at desired coordiates from the map
        Location location = map.getLocations()[coordinates.x][coordinates.y];

        return location.isBlocked();
    }

    public Point moveActor(Point newLocation,Actor actor)
        throws MapControlException{
        //check for invalid (point cannot null, or beyond min max)
        if (newLocation == null)
            throw new MapControlException();
        //check to make sure you have an actor.
        if (actor == null)
            throw new MapControlException();
        //move the actor. (add or subtract from row or column actor started in.)
        Yggdrasil.getCurrentGame().getHero().setCoordinates(newLocation);
        
        return newLocation;
    }

}
