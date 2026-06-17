import java.util.Scanner;

public class SomarApenasPositivos22 {
    public static void main(String[] args) {

        int num, soma;
        soma = 0;

        Scanner scan = new Scanner(System.in);

        for (int i=0; i <=5; i++){
            System.out.println("Me diga um número");
            num = scan.nextInt();

            if (num >= 0){
                soma = soma + num;
            } else {
                System.out.println("Número invalido (Menor que 0)");
            }
        }
        System.out.println(soma + " é o resultado dos seus números positivos");

    }
}
