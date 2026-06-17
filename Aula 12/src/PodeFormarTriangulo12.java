import java.util.Scanner;

public class PodeFormarTriangulo12 {
    public static void main(String[] args) {

        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Me diga esse lado do triângulo");
        a = scan.nextInt();
        System.out.println("agora me diga esse lado do triângulo");
        b = scan.nextInt();
        System.out.println("Por ultimo Me diga esse lado do triângulo");
        c = scan.nextInt();


        scan.close();
        if ((a + c > b) && (a + b > c ) && (b + c > a)){
            System.out.println("pode formar um triãngulo");
        } else {
            System.out.println("can't form a triangle dum dum");
        }
    }
}
