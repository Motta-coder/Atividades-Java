import java.util.Scanner;

public class SenhaCorreta10 {
    public static void main(String[] args) {

        int senha;

        Scanner scan = new Scanner(System.in);
        System.out.println(" qual a senha?");
        senha = scan.nextInt();

        scan.close();
        if (senha == 2026){
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Senha incorreta WEEEWOOO");
        }
    }
}
