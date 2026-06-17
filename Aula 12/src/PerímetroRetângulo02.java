import java.util.Scanner;

public class PerímetroRetângulo02 {
    public static void main(String[] args) {
        double base, altura, perimetro;

        Scanner scan = new Scanner(System.in);

        System.out.println("Me diga a base do seu retângulo");
        base = scan.nextDouble();

        System.out.println("Me diga a altura do seu retângulo");
        altura = scan.nextDouble();

        perimetro= 2*(altura+base);
        System.out.println(perimetro + " É o perímetro do seu retângulo");
        scan.close();
    }
}
