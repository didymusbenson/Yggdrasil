/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import java.util.Scanner;

/**
 *
 * @author Didymus
 */
public abstract class View implements ViewInterface {

    Scanner keyboard = new Scanner(System.in);
    protected String promptMessage;

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {
        char selection = ' ';
        boolean done = false;
        do {
            System.out.println(promptMessage);
            String input = this.getInput();
            input = input.toUpperCase();
            selection = input.charAt(0);
            this.doAction(selection);
        } while (!done);
    }

    @Override
    public String getInput() {
        String input = null;
        Boolean valid = false;
        

        while (!valid) {
            System.out.println("What dost thou do?");
            input = keyboard.nextLine();
            input = input.trim();
            if (input.length() < 1) {
                System.out.println("Error - Type something next time!");
                continue;
            }
            break;
        }

        return input;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

}
