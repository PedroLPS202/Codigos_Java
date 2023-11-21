package ATV_QUIMICA;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
         Scanner pudim = new Scanner(System.in);
        
        System.out.println("Digite o numero de mols ");
        double  quantidade_mol = pudim.nextDouble();

        System.out.println("Digite o valor da massa molar do soluto");
        double massa_molar =pudim.nextDouble();

        double massa = quantidade_mol * massa_molar;

        System.out.println("A sua massa é de " + massa);
    }
}
