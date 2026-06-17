import java.util.Scanner;

public class DesempenhoCampeonato16 {
    public static void main(String[] args) {
        int vit, derrotas;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual foi a quantidades de vitorias da sua equipe?:}");
        vit = scan.nextInt();

        System.out.println("Qual foi a quantidades de derrotas da sua equipe?:^");
        derrotas = scan.nextInt();
        scan.close();
        if (vit>derrotas) {
            System.out.println("desempenho positivo");
        } else{
            System.out.println("MELHORE");
        }
    }

}
