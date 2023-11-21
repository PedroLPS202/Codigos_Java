package JAVA_MATEMATICA_2;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner pudim = new Scanner(System.in);

        System.out.println("Digite o valor do volume");
        double volume = pudim.nextDouble();

        System.out.println("Digite o valor da altura");
        double altura = pudim.nextDouble();

        double pi = 3.14;

        double raio = Math. cbrt(volume / pi * altura) ;

        System.out.println("raio: " + raio);
    }
}
