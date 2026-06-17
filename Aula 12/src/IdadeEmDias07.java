import java.util.Scanner;

public class IdadeEmDias07 {
    public static void main(String[] args) {

        int idade;

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a sua idade em anus");
        idade = scan.nextInt();

        scan.close();
        System.out.println("a sua idade em dias é " + idade*365);
    }
}
