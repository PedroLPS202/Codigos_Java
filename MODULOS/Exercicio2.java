package MODULOS;
import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] pudim = {2, 3, 6, 8, 10, 11};
        int total = SepararNumeros(pudim);

        System.out.println("A soma dos números pares é " + total);
    }
    public static int SepararNumeros(int[] pudim) {
        int soma = 0;

        for (int i = 0; i < pudim.length; i++) {
            int atual = pudim[i];

            if (atual % 2 ==0){
              soma += atual; 
            }

    }
        return soma;

}
}
