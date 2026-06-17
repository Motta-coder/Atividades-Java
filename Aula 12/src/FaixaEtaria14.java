import java.util.Scanner;

public class FaixaEtaria14 {
    public static void main(String[] args) {
        int idade;
        Scanner scan = new Scanner(System.in);
        idade = scan.nextInt();

        scan.close();
        if ((idade >= 0) && (idade <=11)){
            System.out.println("Criança");
        } else if ((idade >= 12) && (idade <=17)) {
            System.out.println("aborrecente");
        } else if ((idade >=18) && (idade <= 59)){
            System.out.println("Adulto");
        } else {
            System.out.println("VELHO PÈ NA COVA");
        }
    }
}
