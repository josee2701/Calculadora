package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    
    public static void main(String[] args) {

        double x, y;
        Calculo oper = new Calculo();
        System.out.println("Calculadora");
        Scanner escribir = new Scanner(System.in);
        System.out.print(" Ingrese el primer número: ");
        x = escribir.nextDouble();
        System.out.print(" Ingrese el segundo número: ");
        y = escribir.nextDouble();
        System.out.println("la suma es: " + oper.sumar(x, y));
        System.out.println("la resta es: " + oper.restar(x, y));
        System.out.println("la multiplicar es: " + oper.multiplicar(x, y));
        System.out.println("la dividir es: " + oper.dividir(x, y));

    }
}
