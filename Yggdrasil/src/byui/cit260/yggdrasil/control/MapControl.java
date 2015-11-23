/*
 * Program type: Control Class
 * Creation: 9/21/2015 at 9:24
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
package byui.cit260.yggdrasil.control;

import byui.cit260.yggdrasil.model.Game;
import java.io.Serializable;
import byui.cit260.yggdrasil.model.Location;
import byui.cit260.yggdrasil.model.Map;
import byui.cit260.yggdrasil.model.Scene;
import java.awt.Point;
import yggdrasil.Yggdrasil;
/**
 *
 * @author Brock Hodgson
 */
public class MapControl implements Serializable {
    
    public enum sceneType{
        example, //TODO: DELETE EXAMPLE
        start,
        clearing,
        forest,
        beach,
        town1,
        town2,
        town3,
        dungeon1,
        dungeon2,
        dungeon3,
        plythu,
        endgame,
    }
    
    public static Map createMap() {
        Map map = new Map(8,8);
        //CREATE THE SCENES
        Scene[] scenes = createScenes();
        //ASSIGN THE SCENES TO LOCATIONS
        GameControl.assignScenesLocations(map, scenes);
        return map;
    }

    private static Scene[] createScenes() {
        //CREATE SCENES
        Game game = Yggdrasil.getCurrentGame(); // Do we need this line?
        
        Scene[] scenes = new Scene[sceneType.values().length];
        
        //CREATE THE INDIVIDUAL SCENES
        Scene example = new Scene();
        example.setSceneDescription("THIS IS AN EXAMPLE SCENE");
        example.setSceneMapSymbol("!");
        scenes[sceneType.example.ordinal()] = example;
        
        Scene start = new Scene();
        start.setSceneDescription("START GAME SCENE");
        start.setSceneMapSymbol("!");
        scenes[sceneType.start.ordinal()] = start;
        
        Scene clearing = new Scene();
        clearing.setSceneDescription("CLEARING SCENE");
        clearing.setSceneMapSymbol("!");
        scenes[sceneType.clearing.ordinal()] = clearing;
        
        Scene forest = new Scene();
        forest.setSceneDescription("FOREST SCENE");
        forest.setSceneMapSymbol("!");
        scenes[sceneType.forest.ordinal()] = forest;
        
        Scene beach = new Scene();
        beach.setSceneDescription("BECAH SCENE");
        beach.setSceneMapSymbol("!");
        scenes[sceneType.beach.ordinal()] = beach;
        
        Scene town1 = new Scene();
        town1.setSceneDescription("TOWN 1 SCENE");
        town1.setSceneMapSymbol("!");
        scenes[sceneType.town1.ordinal()] = town1;
        
        Scene town2 = new Scene();
        town2.setSceneDescription("TOWN 2 SCENE");
        town2.setSceneMapSymbol("!");
        scenes[sceneType.town2.ordinal()] = town2;        
        
        Scene town3 = new Scene();
        town3.setSceneDescription("TOWN 3 SCENE");
        town3.setSceneMapSymbol("!");
        scenes[sceneType.town3.ordinal()] = town3;        
        
        Scene dungeon1 = new Scene();
        dungeon1.setSceneDescription("DUNGEON 1 SCENE");
        dungeon1.setSceneMapSymbol("!");
        scenes[sceneType.dungeon1.ordinal()] = dungeon1;
        
        Scene dungeon2 = new Scene();
        dungeon2.setSceneDescription("DUNGEON 2 SCENE");
        dungeon2.setSceneMapSymbol("!");
        scenes[sceneType.dungeon2.ordinal()] = dungeon2;        
        
        Scene dungeon3 = new Scene();
        dungeon3.setSceneDescription("DUNGEON 3 SCENE");
        dungeon3.setSceneMapSymbol("!");
        scenes[sceneType.dungeon3.ordinal()] = dungeon3;   
        
        Scene plythu = new Scene();
        plythu.setSceneDescription("PLYTHU SCENE");
        plythu.setSceneMapSymbol("!");
        scenes[sceneType.plythu.ordinal()] = plythu; 
        
        Scene endgame = new Scene();
        endgame.setSceneDescription("ENDGAME SCENE");
        endgame.setSceneMapSymbol("!");
        scenes[sceneType.endgame.ordinal()] = endgame;        
        
        return scenes;
    }
 
    public boolean actorLocationCheck(Point coordinates, Map map ){
        //get location at desired coordiates from the map
        Location location = map.getLocations()[coordinates.x][coordinates.y];

        return location.isBlocked();
        
    }
}