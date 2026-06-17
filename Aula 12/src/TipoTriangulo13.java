import java.util.Scanner;

public class TipoTriangulo13 {
    public static void main(String[] args) {

        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Me diga esse lado do triângulo");
        a = scan.nextInt();
        System.out.println("agora me diga esse lado do triângulo");
        b = scan.nextInt();
        System.out.println("Por ultimo Me diga esse lado do triângulo");
        c = scan.nextInt();

        if ((a==b) && (b==c)){
            System.out.println("equilátero");
        } else if ((a==b) || (b==c) )  {
            System.out.println("isósceles");
        } else {
            System.out.println(" escaleno");
        }
        scan.close();
    }
}
