package MODULOS;
  import java.util.Scanner;
public class Exercicios8 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista de números: ");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        ordenarNumeros(numeros);

        System.out.println("Números ordenados em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }

    // Função para ordenar a lista de números em ordem crescente
    public static void ordenarNumeros(int[] numeros) {
        int n = numeros.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {
                int temp = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = temp;
            }
        }
    }
}


