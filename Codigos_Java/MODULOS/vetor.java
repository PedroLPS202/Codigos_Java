package MODULOS;

import java.util.Arrays;

public class vetor {
    public static void main(String[] args) {
         int[] pudim = {9,15,19,21,1,59,10,11,32};

        int[] numeros = pudim;

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
