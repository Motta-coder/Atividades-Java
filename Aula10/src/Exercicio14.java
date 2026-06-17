import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float valor;

        System.out.println("me diga um número");
        valor = read.nextFloat();
        if (valor>99) {
            System.out.println("Parabens você recebeu um desconto de 10%");
            System.out.println(valor*0.90 + " É o novo valor com desconto");
        } else {
            System.out.println(valor + " é o valor a ser pago");
        }
    }
}
