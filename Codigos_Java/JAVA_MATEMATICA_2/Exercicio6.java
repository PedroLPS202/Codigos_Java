package JAVA_MATEMATICA_2;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner pudim = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo:");
        double base = pudim.nextDouble();

        System.out.println("Digite o valor da altura do retângulo:");
        double altura = pudim.nextDouble();

        double diametro = Math.sqrt((altura * altura) + (base * base));

        double raio = diametro /2;

        System.out.println("O valor do raio é: " + raio);
}
}
