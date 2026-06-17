import java.util.Scanner;

public class Combustivel05 {
    public static void main(String[] args) {

        int comb, distancia;

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu gasto em combustível?");
        comb = scan.nextInt();
        System.out.println("Qual a distancia que você deseja percorrer?");
        distancia = scan.nextInt();

        System.out.println(comb/distancia + " é o seu consumo médio em combustível");

        scan.close();
    }
}
