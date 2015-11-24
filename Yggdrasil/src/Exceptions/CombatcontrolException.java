/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Brock
 */
public class CombatcontrolException extends Exception {

    public CombatcontrolException() {
    }

    public CombatcontrolException(String message) {
        super(message);
    }

    public CombatcontrolException(String message, Throwable cause) {
        super(message, cause);
    }

    public CombatcontrolException(Throwable cause) {
        super(cause);
    }

    public CombatcontrolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
