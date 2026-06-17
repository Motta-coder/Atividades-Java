import java.util.Scanner;

public class VolumeCaixa08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double alt, lar, com;

        System.out.println("Qual a altura da sua caixa?");
        alt = scan.nextDouble();

        System.out.println("Qual a largura da sua caixa?");
        lar = scan.nextDouble();

        System.out.println("Qual o comprimento da sua caixa?");
        com = scan.nextDouble();
        scan.close();
        System.out.println(com*lar*alt + " é o volume da sua caixa, idiota");
    }
}
