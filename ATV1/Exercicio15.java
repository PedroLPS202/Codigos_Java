package ATV1;

public class Exercicio15 {
    public static void main(String[] args) {
        int numero = 24;
        int maiorDivisor = 24; // Inicialize com um valor padrão

        for (int i = numero; i > 1; i--) {
            if (numero % i == 0) {
                maiorDivisor = i;
                break; // Assim que encontrar o menor divisor, saia do loop
            }
        }

        if (maiorDivisor != 0) {
            System.out.println("O maior divisor é: " + maiorDivisor);
        } else {
            System.out.println("O número " + numero + " não possui divisores diferentes de 1 e ele mesmo.");
        }
    }
}
