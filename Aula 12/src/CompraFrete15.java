import java.util.Scanner;

public class CompraFrete15 {
    public static void main(String[] args) {
        double valorCompra;

        Scanner scan = new Scanner(System.in);
        System.out.println("qual é o valor da sua compra >:[");
        valorCompra = scan.nextInt();


        scan.close();
        if (valorCompra >= 150) {
            System.out.println("FRETE FREEE");
        } else {
            System.out.println("Frete pago pelo cliente");
        }
    }
}
