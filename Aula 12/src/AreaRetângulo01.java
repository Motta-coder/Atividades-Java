import java.util.Scanner;

public class AreaRetângulo01 {
    public static void main(String[] args) {
        double base, altura, area;

        Scanner scan = new Scanner(System.in);

        System.out.println("Me diga a base do seu retângulo");
        base = scan.nextDouble();

        System.out.println("Me diga a altura do seu retângulo");
        altura = scan.nextDouble();

        area= altura*base;
        System.out.println(area + " É a área do seu retângulo");
        scan.close();
    }
}
