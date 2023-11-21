
package ATV1;

public class Exercicio16 {
    public static void main(String[] args) {
        int numero = 24;
        int menorDivisor = 0; // Inicialize com um valor padrão

        for (int i = numero; i > 1; i--) {
            if (numero % i == 0) {
                menorDivisor = i;
                break; // Assim que encontrar o menor divisor, saia do loop
            }
        }

        if (menorDivisor != 0) {
            System.out.println("O menor divisor é: " + menorDivisor);
        } else {
            System.out.println("O número " + numero + " não possui divisores diferentes de 1 e ele mesmo.");
        }
    }
}
