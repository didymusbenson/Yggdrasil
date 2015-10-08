/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import byui.cit260.yggdrasil.model.MainCharacter;

/**
 *
 * @author tsunami
 */
public class Yggdrasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MAIN CHARACTER
        MainCharacter alice = new MainCharacter();
        alice.setMainCharacterLuck(3);
        alice.setMainCharacterSpeed(5);
        alice.setMainCharacterMoney(9001);
        alice.setMainCharacterTotalXp(12);
        alice.setMainCharacterCurrentLevel(2);
        System.out.println(alice.toString());
        
        //ETC.
    }
    
}
