import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        int n1;
        int n2;
        int soma;

        System.out.println("Me diga um número");
        n1 = read.nextInt();
        System.out.println("Me diga outro número agora");
        n2 = read.nextInt();
        soma = n1+n2;
        System.out.println(soma + "é a soma dos seus números");
    }

}
