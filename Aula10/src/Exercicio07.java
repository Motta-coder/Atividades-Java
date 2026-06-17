import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("Me diga um número");
        n1 = read.nextInt();
        System.out.println("Me diga um segundo número");
        n2 = read.nextInt();
        System.out.println("Me diga o ultimo número agora");
        n3 = read.nextInt();

        System.out.println(n1*n2*n3 + " é dobro e o produto da sua equação");
    }
}
