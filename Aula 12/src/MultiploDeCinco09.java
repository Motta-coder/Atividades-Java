import java.util.Scanner;

public class MultiploDeCinco09 {
    public static void main(String[] args) {

        int numero;

        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();
        if (numero % 5 == 0){
            System.out.println("esse númwero é multiplo de five");
        } else {
            System.out.println("esse nwúmero não é multiplo de five uwu swenpai");
        }

        scan.close();
    }
}
