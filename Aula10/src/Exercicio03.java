import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;

        System.out.println("Me diga um número");
        n1 = read.nextInt();
        System.out.println("o antecessor é " +(n1-1) + " e o sucessor é " + (n1+1));
    }
}
