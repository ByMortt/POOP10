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
 * Excepción que se lanza cuando se intenta realizar un depósito que supera el monto máximo permitido en una cuenta.
 */
public class DepositoMaximoException extends Exception {
    
    /**
     * Constructor por defecto de la excepción.
     */
    public DepositoMaximoException(){
        super("Depósito máximo alcanzado");
    }
}
