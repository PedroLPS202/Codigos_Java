package JAVA_MATEMATICA_2;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner pudim = new Scanner(System.in);
        System.out.println("Digite o valor do volume do cubo:");
        double volume = pudim.nextDouble();

        double aresta = Math.cbrt(volume);

        System.out.println("O valor da aresta é: " + aresta);

        }
}
