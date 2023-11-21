package ATV_QUIMICA;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner pudim = new Scanner(System.in);

        System.out.println("Digite o total de elétrons:");
        int totalEletrons = pudim.nextInt();

        int n = 1;
        int eletronsRestantes = totalEletrons;

        while (eletronsRestantes > 0 ) { 
            int capacidadeCamada = 2 * n * n;
            int eletronsCamada = Math.min(capacidadeCamada, eletronsRestantes);

            System.out.println("Camada " + n + ": " + eletronsCamada + " elétrons" );

            eletronsRestantes -= eletronsCamada;
            n++;
        }
 
    }
}
