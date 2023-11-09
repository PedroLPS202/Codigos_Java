public class PrivacidadeVariavel {
    private int variavelPrivada = 10;
    private int variavelPublica = 20;

    public void metodoExemplo() {
        int variavelLocal = 30;
        System.out.println("Variável Privada: " + variavelPrivada);
        System.out.println("Variável Pública: " + variavelPublica);
        System.out.println("Variável Local: " + variavelLocal);
    }
    public static void main(String[] args) {
        PrivacidadeVariavel exemplo = new PrivacidadeVariavel();
        exemplo.metodoExemplo();
        System.out.println("Variável Pública: " + exemplo.variavelPublica);
    }
}
