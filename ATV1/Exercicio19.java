package ATV1;

import java.util.Scanner;
     
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        if (isPrimo(num)) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }

        scanner.close();
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        } else if (num <= 3) {
            return true;
        } else if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    
}

        
        }
       
    

