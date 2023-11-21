package ATV1;

public class Exercicio21 {
    public static void main(String[] args) {
        int numero = 13;
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
        } System.out.println("A fatorial de " + numero + " é " + fatorial);
    }
}
