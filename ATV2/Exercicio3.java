package ATV2;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner pudim = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = pudim.nextInt();
        
         System.out.println("Digite outro numero: ");
        int numero2 = pudim.nextInt();

        int soma = numero + numero2;

        System.out.println("O resultado é: " + soma);
    }
    
}
