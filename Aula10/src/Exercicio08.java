import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        float n1;

        System.out.println("digite um número");
        n1 = read.nextFloat();

        System.out.println(n1*1.10 + " é o foi o aumento no preço");
    }
}
