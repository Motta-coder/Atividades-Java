import java.util.Scanner;

public class ContaDividida06 {
    public static void main(String[] args) {

        double total, pessoas;

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas pessoas iram dividir essa conta?");
        pessoas = scan.nextDouble();
        System.out.println("Qual é o total da compra a ser pago?");
        total = scan.nextDouble();

        scan.close();
        System.out.println("Então o valor a ser repartido igualmente é " + pessoas/total);
    }
}
