import java.util.Scanner;

public class SomaDeMultiplosDeTres29 {
    public static void main(String[] args) {

        int num, soma;

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        soma=0;

        for (int i=0; i <=num; i++) {
            if (i%3 == 0) {
                System.out.println(i + " é um múltiplo de 3");
                soma=soma+i;
            }
        }
        System.out.println(soma + " é a soma de todos esses números");
    }
}
