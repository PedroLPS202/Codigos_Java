package ATV2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
          Scanner pudim = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double raio = pudim.nextDouble();

        double area = 3.14 * (raio * raio);
        System.out.println("A área do círculo é: " + area);

        double perimetro = 2 * 3.14 * raio;
        System.out.println("A área do círculo é: " + perimetro);
    }
}
