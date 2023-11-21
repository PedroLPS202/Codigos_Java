package JAVA_MATEMATICA;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * (a * c);

        if (delta < a) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma raiz real:" + x);
        } else {
            double x1 = (-b + Math.sqrt(delta) / (2 * a));
            double x2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("A equação possui duas raizes reais:" + x1 + "é" + x2);
        }
    }
}
