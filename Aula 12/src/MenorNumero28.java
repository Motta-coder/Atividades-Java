import java.util.Scanner;

class MenorNumero28 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int n2;

        n1 = 10000;

        for (int i = 1; i <5; i++) {

            System.out.println("me diga um número para eu comparar com " + n1);
            n2 = read.nextInt();

            if (n2 < n1) {
                n1 = n2;
            }
        }
        System.out.println(n1 + " é o menor número");
    }
}