import java.util.Scanner;

public class ConversaoTemperatura04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double C, F;
        System.out.println("Qual é a temperatura em Celsius dai?");
        C = scan.nextDouble();

        F = (C * 9 / 5) + 32;
        System.out.println(F +  " é a sua temperatura convertida em fahreiheit");

        scan.close();
    }
}
