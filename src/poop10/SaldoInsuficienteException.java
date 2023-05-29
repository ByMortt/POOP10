/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu03
 */
/**
 * Excepción que se lanza cuando el saldo de una cuenta es insuficiente para realizar un retiro.
 */
public class SaldoInsuficienteException extends Exception {

    /**
     * Constructor por defecto de la excepción.
     */
    public SaldoInsuficienteException() {
        super("Saldo Insuficiente");
    }
}
