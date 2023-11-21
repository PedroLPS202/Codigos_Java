package ATV1;

public class Exercio20 {
    public static void main(String[] args) {
        System.out.println(log(10, 128));
        
        System.out.println(log(10, 1000));
        System.out.println(log(10, 49));
    }

    public static double log(double base, double valor) {
        return Math.log(valor) / Math.log(base);
            
        
    }
}
