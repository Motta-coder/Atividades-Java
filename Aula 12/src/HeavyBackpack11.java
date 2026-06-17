import java.util.Scanner;

public class HeavyBackpack11 {
    public static void main(String[] args) {

        int peso;

        Scanner scan = new Scanner(System.in);
        System.out.println(" qual o peso da sua mochila?");
        peso = scan.nextInt();

        scan.close();
        if (peso >= 5){
            System.out.println("HEAVY HEIGHT");
        } else {
            System.out.println("Peso adequado like");
        }
    }
}
