package org.mgordillo.sobrecarga;
import static org.mgordillo.sobrecarga.Calculadora.*;
public class EjemploSobrecarga {
    public static void main(String[] args) {


        System.out.println("sumar int: " + sumar(10,5));
        System.out.println("sumar float: " + sumar(10.0f,5f));
        System.out.println("sumar float-int: " + sumar(10f, 5));
        System.out.println("sumar int-float: " + Calculadora.sumar(10,5.0));
        System.out.println("sumar float: " + Calculadora.sumar(10.0,5.0));
        System.out.println("sumar string: " + Calculadora.sumar("10","5"));
        System.out.println("sumar 3 enteros: " + Calculadora.sumar(10,5,3));
        System.out.println("sumar 4 enteros: " + Calculadora.sumar(10,5,3,7));
        System.out.println("sumar n enteros: " + Calculadora.sumar(10,5,3,7,8,9));
        System.out.println("sumar float + n enteros: " + Calculadora.sumar(10F,10,15,6,5,7,5));
        System.out.println("sumar 3 doubles: " + Calculadora.sumar(10.0,5.0,3.5,4.7));

        System.out.println("sumar Long: " + Calculadora.sumar(10L,5L));
        System.out.println("sumar int: " + Calculadora.sumar(10,'@'));
        System.out.println("sumar float-int: " + Calculadora.sumar(10F, '@'));
    }
}
