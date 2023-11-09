package ATV2;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner pudim = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo: ");
        int numero = pudim.nextInt();
        
         System.out.println("Agora digite a altura do mesmo: ");
        int numero2 = pudim.nextInt();

        int retangulo = numero * numero2;

        System.out.println("O resultado é: " + retangulo);
    }
    
}
