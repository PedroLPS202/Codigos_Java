public class CondicionalIF {
    public static void main(String[] args) {
        int grade = 105;

        if(grade >= 90) {
            System.out.println("Excelente!");
    } else if (grade >= 70) {
        System.out.println("Bom!");
    } else if (grade >= 60) {
        System.out.println("Satisfatório!");
    } else {
        System.out.println("Precisa Melhorar!");
    }
    }
}