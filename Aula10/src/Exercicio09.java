import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;

        System.out.println("me diga um número");
        n1 = read.nextInt();

        if (n1%2 == 0){
            System.out.println("seu número é par");
        } else {
            System.out.println("seu número é impar");
        }
    }
}
