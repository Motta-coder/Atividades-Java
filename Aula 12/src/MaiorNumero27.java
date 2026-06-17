import java.util.Scanner;

class MaiorNumero27 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int n2;

        n1 = 0;

        for (int i = 1; i <5; i++) {

            System.out.println("me diga um número para eu comparar com " + n1);
            n2 = read.nextInt();

            if (n2 > n1) {
                n1 = n2;
            }
        }
        System.out.println(n1 + " é o maior número");
    }
}