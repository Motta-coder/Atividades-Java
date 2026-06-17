import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int media;

        System.out.println("me diga sua média amigo");
        media = read.nextInt();

        if (media>6){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}
