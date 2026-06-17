import java.util.Scanner;

public class CaixaRegistradoraSimples25 {
    public static void main(String[] args) {
        double num, total;
        Scanner scan = new Scanner(System.in);

        num = 1;
        total = 0;

        while (num != 0){
            System.out.println("Me diga o preço da sua proxime compra para eu adicionar com o total de  " + total + "Reais (type (0) to end the execution)");
            num = scan.nextDouble();
            total = num + total;
            System.out.println( total + " é o total a ser pago até agora" );
        }

    }
}

