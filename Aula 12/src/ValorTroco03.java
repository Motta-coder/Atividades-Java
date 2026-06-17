import java.util.Scanner;

public class ValorTroco03 {
    public static void main(String[] args) {
        double valorPago, valorCompra;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual foi o valor pago?");
        valorPago = scan.nextDouble();

        System.out.println("Qual foi o valor da sua compra?");
        valorCompra = scan.nextDouble();

        System.out.println(valorPago-valorCompra + " É o seu troco da sua compra");
        scan.close();
    }
}
