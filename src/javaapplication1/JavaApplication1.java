package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        System.out.println("Calculadora");
        calculo oper = new calculo();
        Scanner escribir = new Scanner(System.in);
        double x, y;
        System.out.println(" Ingrese el primer número: ");
        x = escribir.nextDouble();
        System.out.println(" Ingrese el segundo número: ");
        y = escribir.nextDouble();

        System.out.println("la suma es: " + oper.sumar(x, y));
        System.out.println("la resta es: " + oper.restar(x, y));
        System.out.println("la multiplicar es: " + oper.multiplicar(x, y));
        System.out.println("la dividir es: " + oper.dividir(x, y));

    }

    public class calculo {

        public calculo(double z) {
            this.z = z;
        }

        double z;

        public double sumar(double x, double y) {
            z = x + y;
            return z;
        }

        public double restar(double x, double y) {
            z = x - y;
            return z;
        }

        public double multiplicar(double x, double y) {
            z = x * y;
            return z;
        }

        public double dividir(double x, double y) {
            z = x / y;
            return z;
        }
    }

}
