import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("me diga um número");
        n1 = read.nextInt();
        System.out.println("Me diga outro número agora");
        n2 = read.nextInt();
        if (n1>n2){
            System.out.println(n1 + " é o maior número");
        } else {
            System.out.println(n2 + " é o maior número");
        }
    }
}