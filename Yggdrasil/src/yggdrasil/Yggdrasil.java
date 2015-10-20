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
 *      4-09 - Town
 *      4-10 - Shop
 *      4-11 - Item
 *      4-12 - MAP
 *      4-13 - INVENTORY
 *      4-14 - GAME
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

        // 4-09 - TOWN
        Town gilead = new Town();
        gilead.setTownGossip("hello");
        gilead.setTownInnPrice(25);
        gilead.setTownInnStory("derp");
        gilead.setTownQuestStory("ahoy");
        gilead.setTownShopStory("welcome");
        System.out.println(gilead.toString());

        // 4-10 - SHOP
        Shop foodAndStuff = new Shop();
        foodAndStuff.setShopItemsHeld(new String[]{"potion", "dagger", "pills"});
        System.out.println(foodAndStuff.toString());

        // 4-11 - IITEM
        Item potion = new Item();
        potion.setItemBuyPrice(9999);
        potion.setItemSellPrice(1);
        potion.setItemModifier(15);
        potion.setItemType(1);
        System.out.println(potion.toString());

        //4-12 - MAP
        Map overworld = new Map();
        overworld.setMapRowCount(2);
        overworld.setMapColumnCount(5);
        System.out.println(overworld.toString());

        // 4-13 - INVENTORY
        Inventory bagOfHolding = new Inventory();
        bagOfHolding.setInventoryItemsHeld(new String[]{"Knife", "Flip Flops"});
        System.out.println(bagOfHolding.toString());

        // 4-14 - GAME
        Game tron = new Game();
        tron.setGameNumberOfDeaths(0);
        System.out.println(tron.toString());
    }

}
