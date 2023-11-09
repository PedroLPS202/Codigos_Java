package JAVA_MATEMATICA_2;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner pudim = new Scanner(System.in);

        System.out.println("Digite o valor da altura:");
        double altura = pudim.nextDouble();

         System.out.println("Digite o valor do volume:");
        double volume = pudim.nextDouble();

        double valor_fixo = 3; //Valor fixo que utilizara em equações 

        double area_base = (volume * valor_fixo) / altura;
        
        System.out.println("O valor da area da base é: " + area_base);


    }
}
