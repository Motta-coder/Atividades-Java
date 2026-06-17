import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;

        System.out.println("me diga um número");
        n1 = read.nextInt();

        if (n1 > 0){
            System.out.println("seu número é maior que 0");
        } else if (n1 < 0){
            System.out.println("seu número é menor que 0");
        } else {
            System.out.println("Your number is 0");
        }
    }
}