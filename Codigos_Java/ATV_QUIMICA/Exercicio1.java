package ATV_QUIMICA;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner pudim = new Scanner(System.in);
        
        System.out.println("Digite o valor da massa do mol");
        double massa =pudim.nextDouble();

        System.out.println("Digite o valor da massa molar do soluto");
        double massa_molar =pudim.nextDouble();

        double quantidade_mol = massa / massa_molar;

        System.out.println("Você tem " + quantidade_mol + " mols");
    }
}
