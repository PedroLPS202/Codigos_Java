package JAVA_MATEMATICA;

public class Exercicio4 {
    public static void main(String[] args) {
        int cateto1 = 3;
        int cateto2 = 4;

        double hipotenusa = (cateto1 * cateto1) * (cateto2 * cateto2);

        double valor_hipotenusa = Math.sqrt(hipotenusa);

        System.out.println("Om valor da hipotenusa é " + valor_hipotenusa);

    }
}
