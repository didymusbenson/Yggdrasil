/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:10
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */

/*
 * Program Map
 *   key:
 *       0 single digit indicates class or global intereaction
 *       00 double digit indecates code within class interaction
 *
 *   1 - package
 *   2 - import
 *   3 - MainCharacter class call
 *   4 - Yggdrasil class call
 *      4-01 - main initialization
 *      4-02 - MAIN CHARACTER
 *      4-03 - ACTOR
 *      4-04 - DUNGON
 *      4-05 - ENEMY
 *      4-06 - LOCATION
 *      4-07 - PLAYER
 *      4-08 - SCENE
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

/**
 *
 * @author Brock Hodgson & Didymus Benson
 */
// 4 - this calls the starting point so the game can run.
public class Yggdrasil {

    /**
     * @param args the command line arguments
     */
    // 4-01 - this is the main that controls the rest of the game.
    public static void main(String[] args) {
        // 4-02 - MAIN CHARACTER sets, and then a command to display those sets.
        MainCharacter alice = new MainCharacter();
        alice.setMainCharacterLuck(3);
        alice.setMainCharacterSpeed(5);
        alice.setMainCharacterMoney(9001);
        alice.setMainCharacterTotalXp(12);
        alice.setMainCharacterCurrentLevel(2);
        System.out.println(alice.toString());

        // 4-03 - ACTOR
        Actor sprite = new Actor();
        sprite.setActorMaxHp(10);
        sprite.setActorTempHp(5);
        sprite.setActorAttack(12);
        sprite.setActorDefense(15);
        sprite.setActorWeapon(5);
        System.out.println(sprite.toString());

        // 4-04 - DUNGON
        Dungon lair = new Dungon();
        lair.setDungonGoldAvalible(35);
        lair.setDungonNumberOfFights(12);
        System.out.println(lair.toString());

        // 4-05 - ENEMY 
        Enemy bob = new Enemy();
        bob.setEnemyEscapeChance(80);
        bob.setEnemyGoldReward(14);
        bob.setEnemyXpReward(34);
        System.out.println(bob.toString());

        // 4-06 - LOCATION
        Location terra = new Location();
        terra.setLocationCoordinates(8.4);
        terra.setLocationEncounterChance(40);
        terra.setLocationEncounterType(3);
        terra.setLocationHostility(1);
        System.out.println(terra.toString());

        // 4-07 PLAYER
        Player hater = new Player();
        hater.setPlayerName("Tom");
        System.out.println(hater.toString());

        // 4-08 - SCENE
        Scene scene = new Scene();
        scene.setSceneDescription("fun");
        scene.setSceneHasBarrier(true);
        scene.setSceneMapSymbol("a");
        System.out.println(scene.toString());
    }

}
