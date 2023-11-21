package MODULOS;
import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] pudim = {4, 7, 2, 1};
        trocaPosicoes(pudim, 1, 2);

        System.out.println("Pudim após troca: " + Arrays.toString(pudim));
    }
    public static void trocaPosicoes(int[] pudim, int posicao1, int posicao2) {
        int temp = pudim[posicao1]; //7
        pudim[posicao1] = pudim[posicao2]; //2
        pudim [posicao2] = temp; //7
    }
        
    }
