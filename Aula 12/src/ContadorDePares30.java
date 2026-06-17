import java.util.Scanner;

public class ContadorDePares30 {
    public static void main(String[] args) {

        int num, contador;
        contador=0;
        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=8; i++) {
            System.out.println("Me diga um número e eu irei falar se ele é par ou não");
            num = scan.nextInt();

            if (num%2==0){
                System.out.println(num + " é par");
                contador++;
            } else {
                System.out.println(num + "é impar ");
            }
        }
        System.out.println(contador + "/8 são pares");
    }
}
