package switchDemo;

public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println(" Mukemmel : Gectiniz ");
                break;
            case 'B':
            case 'C':
                System.out.println(" İyi Gectiniz ");
                break;
            case 'D':
                System.out.println(" Fena Degil Gectiniz ");
                break;
            case 'F':
                System.out.println(" Maalesef Kaldiniz' ");
                break;
        }
    }
}