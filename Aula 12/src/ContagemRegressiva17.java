import java.util.Scanner;

public class ContagemRegressiva17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Me diga um número positivo SER INFERIOR");
        numero = scan.nextInt();

        scan.close();
        for (int i=numero; i>=0; i--){
            System.out.println(i);
        }
    }
}
