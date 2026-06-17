import java.util.Scanner;

public class Media4Temperatura20 {
    public static void main(String[] args) {
        int soma, numero;
        soma=0;
        Scanner scan = new Scanner(System.in);

        for (int i=1; i <= 4; i++) {
            System.out.println("Me diga 4 temperaturas diferentes");
            numero = scan.nextInt();
            soma=soma+numero;
        }
        System.out.println(soma / 4 + "C é a média das temperaturas");
    }
}
