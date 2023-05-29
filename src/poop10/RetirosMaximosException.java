/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author osamc
 */

/**
 * Excepción que se lanza cuando se ha alcanzado el número máximo de retiros permitidos en una cuenta.
 */
public class RetirosMaximosException extends Exception {
    
    /**
     * Constructor por defecto de la excepción.
     */
    public RetirosMaximosException(){
        super("Ya has alcanzado el máximo de retiros permitidos");
    }
}