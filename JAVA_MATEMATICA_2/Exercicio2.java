package JAVA_MATEMATICA_2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner pudim = new Scanner(System.in);

        System.out.println("Digite o valor do volume");
        double volume = pudim.nextDouble();

        double pi = 3.14;
        double valor_fixo = 4; // Valor fixo que utilizara em equações

        double raio = Math.sqrt(volume / pi * valor_fixo);

        System.out.println("raio: " + raio);
    }
}
