import java.util.Scanner;

public class TheNextTenNumbers17 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("tell me a number and i am going to tell the next 10 numbers");
        number = scan.nextInt();

        scan.close();
        for (int i=1; i<=10; i++) {

            System.out.println((number+i) + " = " + number + " + " + i );
        }
    }
}
