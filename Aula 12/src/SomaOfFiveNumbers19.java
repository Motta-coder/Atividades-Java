import java.util.Scanner;

public class SomaOfFiveNumbers19 {
    public static void main(String[] args) {
        int soma, numero;
        soma=0;
        Scanner scan = new Scanner(System.in);

        for (int i=0; i <= 5; i++) {
            System.out.println("tell me a number e eu irei aumentar with the other number");
            numero = scan.nextInt();
            soma=soma+numero;
            System.out.println(soma);
        }
    }
}
