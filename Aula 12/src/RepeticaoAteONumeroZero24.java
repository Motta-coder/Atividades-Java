import java.util.Scanner;

public class RepeticaoAteONumeroZero24 {
    public static void main(String[] args) {
        int soma, num;
        Scanner scan = new Scanner(System.in);

        num = 1;
        soma = 0;

        while (num != 0){
            System.out.println("Tell me a number to some with " + soma + " (type (0) to end the execution)");
            num = scan.nextInt();
            soma = num + soma;
            System.out.println( soma + " é o resultado do seu calculo" );
        }

    }
}
