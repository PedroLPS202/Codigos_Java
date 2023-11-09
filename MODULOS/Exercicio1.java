package MODULOS;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = multiplicar(numero1, numero2);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    }

