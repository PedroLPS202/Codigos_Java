package MODULOS;
import java.util.Scanner;

public class Excercicio4 {
   
    // Soma de todos os algarismos
    public static void main(String[] args) {
        System.out.println("Informe um número: ");
        int num = new Scanner(System.in).nextInt();
        int soma = 0;

        while (num > 0) {
            int modulo = num % 10;
            soma += modulo;
            num /= 10; // Dividir o número por 10 para obter o próximo dígito
        }

        // A impressão da soma deve estar fora do loop
        System.out.println("A soma dos algarismos é: " + soma);
    }
}

