import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;

        System.out.println("Me diga sua idade");
        n1 = read.nextInt();
        if (n1 > 15) {
            System.out.println("Você pode votar");
        } else {
            System.out.println("você não pode votar");
        }
    }
}