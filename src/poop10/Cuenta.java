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
 * Clase que representa una cuenta bancaria.
 */
public class Cuenta {
    private double saldo;
    private int cantidadRetiros;
    private int cantidadDepositos;

    /**
     * Constructor por defecto de la clase Cuenta.
     */
    public Cuenta() {
    }

    /**
     * Constructor que inicializa la cuenta con un saldo inicial.
     * 
     * @param saldo saldo inicial de la cuenta
     * @param cantidadRetiros cantidad de retiros de la cuenta que lleva
     * @param cantidadDepositos cantidad de depositos que lleva la cuenta
     */
    public Cuenta(double saldo, int cantidadRetiros, int cantidadDepositos) {    
        this.saldo = saldo;
        this.cantidadRetiros = cantidadRetiros;
        this.cantidadDepositos = cantidadDepositos;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Realiza un depósito en la cuenta.
     * 
     * @param monto monto a depositar
     * @throws DepositoMaximoException si se intenta depositar más del monto máximo permitido
     */
    public void Depositar(double monto) throws DepositoMaximoException {
        if (monto > 20000) {
            throw new DepositoMaximoException();
        }
        
        if (cantidadDepositos >= 3) {
            throw new DepositoMaximoException();
        }
        
        System.out.println("Depositando lo de la chamba $" + monto);
        saldo += monto;
        cantidadDepositos++;
    } 
    
    /**
     * Realiza un retiro de la cuenta.
     * 
     * @param monto monto a retirar
     * @throws SaldoInsuficienteException si no hay suficiente saldo en la cuenta para realizar el retiro
     * @throws RetirosMaximosException si se ha alcanzado el número máximo de retiros permitidos
     */
    public void Retirar(double monto) throws SaldoInsuficienteException, RetirosMaximosException {
        if (cantidadRetiros >= 3) {
            throw new RetirosMaximosException();
        }
        else{
            System.out.println("Retirando pa la kwama $" + monto);
            if (saldo >= monto) {
                saldo -= monto;
                cantidadRetiros++;
            } else {
                throw new SaldoInsuficienteException();
            }
        }
    }

    /**
     * Devuelve una representación en forma de cadena de la cuenta.
     * 
     * @return representación en forma de cadena de la cuenta
     */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + "$ " + saldo + '}';
    }
}