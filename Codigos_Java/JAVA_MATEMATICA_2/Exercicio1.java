package JAVA_MATEMATICA_2;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner pudim = new Scanner(System.in);

        System.out.println("Digite o valor do volume");
        double volume = pudim.nextDouble();

        System.out.println("Digite o valor da altura");
        double altura = pudim.nextDouble();
    
        double pi = 3.14;

        System.out.println("Digite o valor do raio");
        double raio = pudim.nextDouble();

        if (volume == Math.pow(raio, 2) * altura * pi)  {
            System.out.println("O raio é compativel" );
        } else 
        {
            System.out.println("o raio não e compativel");
        }

    }
}
