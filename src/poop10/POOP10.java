/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 * Clase de ejemplo que contiene el método main y realiza diversas operaciones y manejo de excepciones.
 */
public class POOP10 {

    /**
     * Punto de entrada del programa.
     * 
     * @param args los argumentos de línea de comandos
     * @throws poop10.DepositoMaximoException
     */
    public static void main(String[] args) throws DepositoMaximoException {
        int[] arreglo = {23, 45, 55, 87};

        try {
            for (int i = 0; i <= arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Línea alcanzable después de la excepción ArrayIndexOutOfBoundsException");

        try {
            float equis = 0 / 0;
            System.out.println("Resultado es: " + equis);
        } catch (ArithmeticException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        try {
            float a = 0 / 0;
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println(ex.getClass());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            float division = division(10, 0);
            System.out.println(division);
        } catch (UnsupportedOperationException | ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Última línea antes de trabajar con la clase Cuenta");

        try {
            float divs = division(3, 0);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("···························");

        Cuenta cuenta = new Cuenta(100,0,0);
        System.out.println(cuenta);
        
        try {
            cuenta.Depositar(25000.0);
        } catch (DepositoMaximoException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            cuenta.Retirar(50.);
            System.out.println(cuenta.getSaldo());
            cuenta.Retirar(25.);
            System.out.println(cuenta.getSaldo());
            cuenta.Retirar(20.);
            System.out.println(cuenta.getSaldo());
            cuenta.Retirar(25.);
            System.out.println(cuenta.getSaldo());
            cuenta.Depositar(50.);
            System.out.println(cuenta.getSaldo());
        } catch (SaldoInsuficienteException | RetirosMaximosException ex) {
            System.out.println(ex.getMessage());
            System.out.println(cuenta.getSaldo());
        }
    }

    /**
     * Realiza una división entre dos números.
     * 
     * @param a el dividendo
     * @param b el divisor
     * @return el resultado de la división
     * @throws ArithmeticException si se intenta dividir entre cero
     */
    private static float division(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
