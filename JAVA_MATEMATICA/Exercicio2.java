package JAVA_MATEMATICA;

public class Exercicio2 {
    public static void main(String[] args) {
       
        double a = 3;

        double b = -7;

        double c = 2;

        double delta = b * b - 4 * (a * c);

        if (delta < a) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma raiz real:" + x);
        } else {
            double x1 = (-b + Math.sqrt(delta) / (2 * a));
            double x2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("A equação possui duas raizes reais: " + x1 + " é " + x2);
        }
    }
}
