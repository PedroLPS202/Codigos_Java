package JAVA_MATEMATICA;

public class Exercicio9 {
    public static void main(String[] args) {
        
        int lado_base = 6;
        int altura = 8;

        int area_base = (lado_base * lado_base);
        double volume_piramede = area_base * altura / 3;

        System.out.println("O volume da piramede é " + volume_piramede);
    }
}
